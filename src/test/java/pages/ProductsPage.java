package pages;

import static com.codeborne.selenide.Condition.visible;

public class ProductsPage extends BasePage{
    public void waitForVisibility(){
        header.burgerButton.shouldBe(visible);
        header.cardButton.shouldBe(visible);
    }
}
