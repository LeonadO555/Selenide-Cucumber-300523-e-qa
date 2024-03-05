package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage extends BasePage{
    public final SelenideElement loginInput = $x("//*[@id='user-name']");
    public final SelenideElement passwordInput = $x("//*[@id='password']");
    public final SelenideElement loginButton = $x("//*[@id='login-button']");
    public final SelenideElement loginCredentials = $("[id='login_credentials']");
    public final SelenideElement loginPassword = $x("//*[@class='login_password']");
    public final SelenideElement errorMessage = $x("//*[@data-test='error']");
}
