package steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MySteps extends BaseSteps {
    @When("^Login as user \"([^\"]*)\"$")
    public void loginAsUser(String username) {
        loginPage.setInput(loginPage.loginInput, username);
    }

    @And("password \"([^\"]*)\"$")
    public void password(String password) {
        loginPage.setInput(loginPage.passwordInput,password);
    }

    @And("^click to login button$")
    public void clickToLoginButton() {
        loginPage.click(loginPage.loginButton);
    }

    @And("^I choose a product$")
    public void iChooseAProduct(){
        productsPage.click(productsPage.addProduct);
    }

    @Then("^I click to shopping button$")
    public void openCartPage(){
        productsPage.openCartPage();


    }

    @And("^I remote product$")
    public void iRemoteProduct() {
    }
}
