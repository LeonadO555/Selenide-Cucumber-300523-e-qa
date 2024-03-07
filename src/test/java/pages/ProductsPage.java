package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProductsPage extends BasePage{

    ElementsCollection inventoryItem = $$("[class='inventory_item']");
    ElementsCollection inventoryItemName = $$("[class='inventory_item_name ']");
    ElementsCollection inventoryItemPrice = $$("[class='inventory_item_price']");
    SelenideElement shoppingCartLink = $("[class='shopping_cart_link']");
    public void waitForVisibility(){
        header.burgerButton.shouldBe(visible);
        header.cartButton.shouldBe(visible);
    }

}
