package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import steps.BaseSteps;

public class ProductsSteps extends BaseSteps {
    @When("Login as user \"([^\"]*)\"$")
    public void loginAsUser(String username) {
        loginPage.setInput(loginPage.loginInput,username);
    }

    @Then("I add product \"([^\"]*)\"$")
    public void iAddProduct(String []productName) {
        productsPage.clickAddToCart(productName);

    }

    @And("I remove product \"([^\"]*)\"$")
    public void iRemoveProduct(String []productName) {
        productsPage.clickRemoveToCart(productName);
    }
}
