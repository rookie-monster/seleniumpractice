package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.readexceldata;

public class SampleTestFrameworkApproach extends BaseTest {

	@Test(dataProviderClass=readexceldata.class,dataProvider="data")
	public static void LoginTest(String username, String password) throws InterruptedException {
		driver.findElement(By.xpath(objloc.getProperty("txtUsername"))).sendKeys(username);
		driver.findElement(By.xpath(objloc.getProperty("txtPassword"))).sendKeys(password);
		driver.findElement(By.xpath(objloc.getProperty("btnLogin"))).click();
		
	}
}
