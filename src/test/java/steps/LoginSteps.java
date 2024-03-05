package steps;

import io.cucumber.java.de.Wenn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Condition.*;

public class LoginSteps extends BaseSteps{
    @When("^I fill username \"([^\"]*)\"$")
    public void iFillUsername(String username) {
        loginPage.setInput(loginPage.loginInput,username);
    }

    @And("^I fill password \"([^\"]*)\"$")
    public void iFillPassword(String password) {
        loginPage.setInput(loginPage.passwordInput,password);
    }

    @And("^I click to login button$")
    public void iClickToLoginButton() {
        loginPage.click(loginPage.loginButton);

    }

    @Then("^I am on the Products page$")
    public void iAmOnTheProductsPage() {
        productsPage.waitForVisibility();
    }


    @Then("I am on get error message with text \"([^\"]*)\"$")
    public void iAmOnGetErrorMessageWithText(String expectedErrorMessage) {
        loginPage.errorMessage.shouldHave(text(expectedErrorMessage));
    }
}

