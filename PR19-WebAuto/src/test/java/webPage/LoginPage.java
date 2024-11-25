package webPage;

import org.openqa.selenium.By;

import static helper.Utility.driver;

public class LoginPage {

    By inputUsername = By.xpath("//input[@id='user-name']");
    By inputPassword = By.xpath("//input[@id='password']");
    By buttonLogin = By.xpath("//input[@id='login-button']");
    By cartButton = By.xpath("//a[@class='shopping_cart_link']");
    By eror_message(String mssg){
        return By.xpath("//*[contains(text (),'" + mssg + "')]");
    }

    public void openBrowser(){
        driver.get("https://www.saucedemo.com/");
    }

    public void userFillUsernameWith(String username) {
        driver.findElement(inputUsername).sendKeys(username);
    }

    public void userFillPasswordWith(String password) {
        driver.findElement(inputPassword).sendKeys(password);
    }

    public void userClickLoginButton() {
        driver.findElement(buttonLogin).click();
    }

    public void userSuccessToLoginAndOnHomePage() {
        driver.findElement(cartButton).isDisplayed();
    }

    public void userGetErrorMessage(String mssg) {
        driver.findElement(eror_message(mssg)).isDisplayed();
    }
}
