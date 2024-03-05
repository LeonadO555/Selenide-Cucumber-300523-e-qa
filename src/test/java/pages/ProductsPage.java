package pages;

import com.codeborne.selenide.WebElementCondition;

import static com.codeborne.selenide.Condition.visible;

public class ProductsPage extends BasePage{
public void waitForVisibility(){
    header.burgerButton.shouldBe(visible);
    header.cartButton.shouldBe(visible);

}
}
