package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;

import java.util.zip.Deflater;

public class ProductsSteps extends BasePage {
    @When("^I fill  username \"([^\"]*)\"$")
    public void userUsesLogin(String username) {
        //loginPage.setInput(loginPage.loginInput, username);


    }

    @And("^I fill password\"([^\"]*)\"$")
    public void userUsesPassword(String password) {
        //loginPage.setInput(loginPage.passwordInput, password);

    }

    @And("^User click to login button$")
    public void userClickToLoginButton() {
        //loginPage.click(loginPage.loginButton);

    }

    @Then("^User can add product$")
    public void userCanAddProduct() {
    }
}
