package pages;

import org.openqa.selenium.By;

import base.BaseTest;

public class Common extends BaseTest {
	
	public void verifyPageHeader(String pageHeader, String value) {
		By element = By.xpath("//div[contains(text(),'"+pageHeader+"')]");
		BrowserControlObj.verifyTextPresent(element, value);
	}
}
