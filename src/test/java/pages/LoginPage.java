package pages;

import org.openqa.selenium.By;

import base.BaseTest;

public class LoginPage extends BaseTest {

	/** Locators **/
    private By txtUsername = By.xpath("//input[@id='user-name']");
    private By txtPassword = By.xpath("//input[@id='password']");
    private By btnLogin = By.xpath("//input[@id='login-button']");

    /** Methods **/
    public void enterUsername(String text) {
        BrowserControlObj.enter(txtUsername, text);
    }

    public void enterPassword(String text) {
        BrowserControlObj.enter(txtPassword, text);
    }

    public void clickLoginButton() {
        BrowserControlObj.click(btnLogin);
    }
    
}
