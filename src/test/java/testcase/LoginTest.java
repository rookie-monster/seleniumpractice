package testcase;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utilities.ReadExcelData;

public class LoginTest extends BaseTest {
	

    @Test(dataProviderClass = ReadExcelData.class, dataProvider = "data")
    public static void Login(String username, String password) {
    	LoginPage loginPage = new LoginPage();
    	loginPage.enterUsername(username);
    	loginPage.enterPassword(password);
    	loginPage.clickLoginButton();

    }
}
