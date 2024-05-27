package testcase;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.CartPage;
import pages.Common;
import pages.HomePage;
import pages.LoginPage;
import utilities.ReadExcelData;

public class CheckoutTest extends BaseTest {

	@Test(dataProviderClass = ReadExcelData.class, dataProvider = "data")
    public static void Checkout(
    		String username, 
    		String password, 
    		String pageHeader,
    		String itemName) {
    	Common common = new Common();
    	LoginPage loginpage = new LoginPage();
    	HomePage homepage = new HomePage();
    	CartPage cartpage = new CartPage();
    	loginpage.enterUsername(username);
    	loginpage.enterPassword(password);
    	loginpage.clickLoginButton();
    	common.verifyPageHeader("Swag Labs", pageHeader);

    	homepage.addtoCardItem(itemName);
    	homepage.GotoCart();
    	cartpage.verifyProductinCart();
    }
}
