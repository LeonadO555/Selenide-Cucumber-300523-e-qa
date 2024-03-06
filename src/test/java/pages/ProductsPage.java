package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProductsPage extends BasePage{
    public void waitForVisibility(){
        header.burgerButton.shouldBe(visible);
        header.cardButton.shouldBe(visible);
    }
    public void clickAddToCart(String[] productNames) {
        for (String productName : productNames) {
            SelenideElement addCartButton = $("[data-test='add-to-cart-" + productName.replace(" ", "-").toLowerCase() + "']");
            addCartButton.shouldBe(visible, enabled)
                    .shouldHave(text("Add to cart"))
                    .click();
        }
    }

    public void clickRemoveToCart(String[] productNames) {
        for (String productName : productNames) {
            SelenideElement remoteCartButton = $("[data-test='remove-" + productName.replace(" ", "-").toLowerCase() + "']");
            remoteCartButton.shouldBe(visible, enabled)
                    .shouldHave(text("Remove"))
                    .click();
        }
    }
}
