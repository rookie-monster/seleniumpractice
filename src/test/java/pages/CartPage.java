package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseTest;
import utilities.PageDriver;

public class CartPage extends BaseTest {
	
	By itemCartList = By.xpath("//div[@class='cart_list']//div[@class='inventory_item_name']");
	
	public void verifyProductinCart() {
		List<WebElement> itemElements = PageDriver.driver.findElements(itemCartList);
		
		for (WebElement itemElement : itemElements) {
            System.out.println(itemElement.getText());
        }
	}
	
}
