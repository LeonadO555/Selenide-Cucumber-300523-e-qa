package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$x;

public class ProductsPage extends BasePage{

    public void waitForVisibility(){
        header.burgerButton.shouldBe(visible);
        header.cartButton.shouldBe(visible);
    }

    public SelenideElement loginInput = $x("//*[@id='user-name']");
    public SelenideElement passwordInput = $x("//*[@id='password']");
    public SelenideElement loginButton = $x("//*[@id='login-button']");
    public SelenideElement loginCredentials = $("[id='login_credentials']");
    public SelenideElement loginPassword = $x("//*[@class='login_password']");
    public SelenideElement errorMessage = $x("//*[@data-test='error']");
    public SelenideElement addProduct = $x("//*[@id='add-to-cart-sauce-labs-backpack']");
    public SelenideElement remoteProduct =$x("//*[@id='remove-sauce-labs-backpack");



}
