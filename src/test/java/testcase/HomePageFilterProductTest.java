package testcase;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.Common;
import pages.HomePage;
import pages.LoginPage;
import utilities.ReadExcelData;

public class HomePageFilterProductTest extends BaseTest {

	@Test(dataProviderClass = ReadExcelData.class, dataProvider = "data")
    public static void FilterProduct(
    		String username, 
    		String password, 
    		String pageHeader,
    		String filterproduct) {
    	Common common = new Common();
    	LoginPage loginPage = new LoginPage();
    	HomePage homePage = new HomePage();
    	loginPage.enterUsername(username);
    	loginPage.enterPassword(password);
    	loginPage.clickLoginButton();
    	common.verifyPageHeader("Swag Labs", pageHeader);

    	homePage.filterProductList(filterproduct);
    }
}
