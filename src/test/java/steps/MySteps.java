package steps;

import io.cucumber.java.en.And;
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
}
