package utilities;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserControl {
	
	private WebDriverWait wait;
	
	public BrowserControl() throws IOException {
		ReadFileProperties.readConfigFiles();
		int globalImplicitWait = Integer.parseInt(ReadFileProperties.getPrp().getProperty("Global_ImplicitWait"));
		wait = new WebDriverWait(PageDriver.driver, Duration.ofSeconds(globalImplicitWait));
	}
	
	public void enter(By byLocator, String text) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(byLocator));
        PageDriver.driver
        .findElement(byLocator)
        .sendKeys(text);
		System.out.println("Entered text: " + text);
	}
	
	public void click(By byLocator) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(byLocator));
		PageDriver.driver
		.findElement(byLocator)
		.click();
		System.out.println("Clicked: " + byLocator);
	}
	
	public void verifyTextPresent(By byLocator, String text) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(byLocator));
		String actualValue = PageDriver.driver.findElement(byLocator).getText();
		if(actualValue.equals(text)) {
			System.out.println("Text is as expected: " + text);
		} else {
			System.out.println("Text is not as expected. Expected: " + text + ", Actual: " + actualValue);
		}
	}
	
	public boolean verifyElementPresent(By byLocator) {
	    try {
	        wait.until(ExpectedConditions.visibilityOfElementLocated(byLocator));
	        System.out.println("Element is present: " + byLocator);
	        return true;
	    } catch (TimeoutException e) {
	        System.out.println("Element is not present: " + byLocator);
	        return false;
	    }
	}
	
	public void selectDropdownValue(By byLocator, String text) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(byLocator));
		Select dropdown = new Select(PageDriver.driver.findElement(byLocator));
		dropdown.selectByVisibleText(text);
		System.out.println("Selected dropdown value: " + text);
	}


}
