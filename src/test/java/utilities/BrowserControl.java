package utilities;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
		
	}
	
	public void click(By byLocator) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(byLocator));
		PageDriver.driver
		.findElement(byLocator)
		.click();
		
	}

}
