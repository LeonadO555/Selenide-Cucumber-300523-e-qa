package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseSteps {
    @When("^I fill username \"([^\"]*)\"$")
    public void iFillUsername(String username) {
        loginPage.setInput(loginPage.loginInput,username);
    }
    @And("^I fill password \"([^\"]*)\"$")
    public void iFillPassword(String password) {
        loginPage.setInput(loginPage.loginPassword, password);
    }
    @And("^I click to login button$")
    public void iClickToLoginButton() {
        loginPage.click(loginPage.loginButton);
    }
    @Then("^I am on the Products page$")
    public void iAmOnTheProductsPage() {
        productsPage.waitForVisibility();
    }

}
