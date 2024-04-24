package pages;

import org.openqa.selenium.By;

import base.BaseTest;

public class LoginPage extends BaseTest {

    private By txtUsername = By.xpath("//input[@id='user-name']");
    private By txtPassword = By.xpath("//input[@id='password']");
    private By btnLogin = By.xpath("//input[@id='login-button']");

    public void enterUsername(String username) {
        BrowserControlObj.enter(txtUsername, username);
    }

    public void enterPassword(String password) {
        BrowserControlObj.enter(txtPassword, password);
    }

    public void clickLoginButton() {
        BrowserControlObj.click(btnLogin);
    }
}
