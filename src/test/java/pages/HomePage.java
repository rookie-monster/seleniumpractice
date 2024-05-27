package pages;

import org.openqa.selenium.By;

import base.BaseTest;

public class HomePage extends BaseTest {

	By dropdownFilterProducts = By.xpath("//select[@class='product_sort_container']");
	By btnGotoCart= By.xpath("//div[@id='shopping_cart_container']");
	
	public void filterProductList(String text) {
		BrowserControlObj.selectDropdownValue(dropdownFilterProducts, text);
	}
	
	public void addtoCardItem(String itemName) {
		By btnAddtoCart = By.xpath("//div[@class='inventory_item_description' and contains(div[@class='inventory_item_label']/a/div[@data-test='inventory-item-name'], '"+itemName+"')]/div[@class='pricebar']//button[contains(@class, 'btn_inventory') and contains(text(), 'Add to cart')]");
		BrowserControlObj.click(btnAddtoCart);
	}
	
	public void GotoCart() {
		BrowserControlObj.click(btnGotoCart);
	}
}
