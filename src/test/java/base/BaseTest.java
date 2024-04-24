package base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.BrowserControl;
import utilities.PageDriver;

public class BaseTest {
	
	public static BrowserControl BrowserControlObj;

    @BeforeMethod
    public void setUp() throws IOException {
    	PageDriver.initDriver();
    	BrowserControlObj = new BrowserControl();
    }

    @AfterMethod
    public void tearDown() {
        PageDriver.quitDriver();
    }
}
