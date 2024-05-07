package pages;

import org.openqa.selenium.By;

import base.BaseTest;

public class HomePage extends BaseTest {

	By dropdownFilterProducts = By.xpath("//select[@class='product_sort_container']");
	
	public void filterProductList(String text) {
		BrowserControlObj.selectDropdownValue(dropdownFilterProducts, text);
	}
}
