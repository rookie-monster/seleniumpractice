package testcase;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.Common;
import pages.HomePage;
import pages.LoginPage;
import utilities.ReadExcelData;

public class FilterProductTest extends BaseTest {

	@Test(dataProviderClass = ReadExcelData.class, dataProvider = "data")
    public static void FilterProduct(
    		String username, 
    		String password, 
    		String pageheader,
    		String filterproduct) {
    	Common common = new Common();
    	LoginPage loginpage = new LoginPage();
    	HomePage homepage = new HomePage();
    	loginpage.enterUsername(username);
    	loginpage.enterPassword(password);
    	loginpage.clickLoginButton();
    	common.verifyPageHeader("Swag Labs", pageheader);

    	homepage.filterProductList(filterproduct);
    }
}
