package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties prp = new Properties();
	public static Properties objloc = new Properties();
	public static FileReader frd1;
	public static FileReader frd2;
	
	@BeforeTest
	public void setUp() throws IOException {
		if(driver == null) {
			frd1 = new FileReader(System.getProperty("user.dir") + "\\src\\test\\resources\\configfiles\\config.properties");
			frd2 = new FileReader(System.getProperty("user.dir") + "\\src\\test\\resources\\configfiles\\locator.properties");
			prp.load(frd1);
			objloc.load(frd2);
		}
		if(prp.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(prp.getProperty("url"));
		}
		else if(prp.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get("https://www.saucedemo.com/");
			driver.get(prp.getProperty("url"));
		}
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
