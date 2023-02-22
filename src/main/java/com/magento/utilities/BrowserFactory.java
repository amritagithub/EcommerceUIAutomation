package com.magento.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	
	//Method to return driver based on received browser name
public WebDriver getDriver(String browser, WebDriver driver)
{
	if( browser.equalsIgnoreCase("Chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		return driver;
	}
	else
	{
		System.out.println("Give valid browser name");
	}
	return driver;
}
}
