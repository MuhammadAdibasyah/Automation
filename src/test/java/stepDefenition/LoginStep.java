package stepDefenition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webPage.LoginPage;

public class LoginStep {

    webPage.LoginPage LoginPage ;

    public LoginStep(){
        this.LoginPage = new LoginPage();
    }

    @Given("user on login page")
    public void userOnLoginPage() {
        LoginPage.openBrowser();
    }

    @When("user fill username with {string}")
    public void userFillUsernameWith(String username) {
        LoginPage.userFillUsernameWith(username);
    }

    @And("user fill password with {string}")
    public void userFillPasswordWith(String password) {
        LoginPage.userFillPasswordWith(password);
    }

    @And("user click login button")
    public void userClickLoginButton() {
        LoginPage.userClickLoginButton();
    }

    @Then("user success to login and on home page")
    public void userSuccessToLoginAndOnHomePage() {
        LoginPage.userSuccessToLoginAndOnHomePage();
    }

    @Then("user get error message {string}")
    public void userGetErrorMessage(String msg) {
        LoginPage.userGetErrorMessage(msg);
    }
}
