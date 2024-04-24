package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageDriver {

	public static WebDriver driver;

    public static void initDriver() {
        try {
            ReadFileProperties.readConfigFiles();
            if(driver == null) {
            	if (ReadFileProperties.getPrp().getProperty("browser").equalsIgnoreCase("chrome")) {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                } else if (ReadFileProperties.getPrp().getProperty("browser").equalsIgnoreCase("firefox")) {
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                }
                driver.get(ReadFileProperties.getPrp().getProperty("url"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void quitDriver() {
    	if(driver != null) {
            driver.quit();
            driver = null;
    		
    	}
    }
}
