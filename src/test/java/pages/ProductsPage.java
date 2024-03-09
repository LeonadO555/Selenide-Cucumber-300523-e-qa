package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ProductsPage extends BasePage{
    public void waitForVisibility(){
        header.burgerButton.shouldBe(visible);
        header.cartButton.shouldBe(visible);

    }
        public final SelenideElement loginInput = $x("//*[@id='user-name']");
        public final SelenideElement passwordInput = $x("//*[@id='password']");
        public final SelenideElement loginButton = $x("//*[@id='login-button']");
        public final SelenideElement loginCredentials = $("[id='login_credentials']");
        public final SelenideElement loginPassword = $x("//*[@class='login_password']");
        public final SelenideElement errorMessage = $x("//*[@data-test='error']");
        public final SelenideElement addProduct =$x("//*[@id='add-to-cart-sauce-labs-backpack']");
        public final SelenideElement remoteProduct =$x("//*[@id='remove-sauce-labs-backpack']");

}