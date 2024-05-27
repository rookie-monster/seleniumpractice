package testcase;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.Common;
import pages.LoginPage;
import utilities.ReadExcelData;

public class LoginTest extends BaseTest {
	

    @Test(dataProviderClass = ReadExcelData.class, dataProvider = "data")
    public static void Login(String username, String password, String pageheader) {
    	Common common = new Common();
    	LoginPage loginpage = new LoginPage();
    	loginpage.enterUsername(username);
    	loginpage.enterPassword(password);
    	loginpage.clickLoginButton();
    	common.verifyPageHeader("Swag Labs", pageheader);

    }
}
