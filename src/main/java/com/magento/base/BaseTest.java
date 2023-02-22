package com.magento.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.magento.utilities.BrowserFactory;

public class BaseTest {
protected WebDriver driver;
BrowserFactory factory=new BrowserFactory();
@Parameters("browser") 
	@BeforeClass
	public void setUp(String browser)
	{
		driver=factory.getDriver(browser, driver);
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
