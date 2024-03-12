package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;

public class ProductsSteps extends BaseSteps {
    @When("^I add username \"([^\"]*)\"$")
    public void iAddUsername(String username) {
        loginPage.setInput(loginPage.loginInput, username);
    }
    @And("^I fill password \"([^\"]*)\"$")
    public void iFillPassword(String password) {
        loginPage.setInput(loginPage.passwordInput, password);
    }

    @And("^User click to login button$")
    public void userClickToLoginButton() {
        loginPage.click(loginPage.loginButton);

    }

    @Then("^I am click to shopping button$")
    public void iAmClickToShoppingButton() {

    }

    @And("^I am remote product$")
    public void iAmRemoteProduct() {
    }
}
