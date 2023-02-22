package com.magento.testPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.magento.base.BaseTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LandingPageTest extends BaseTest{

	//Method to click on signIn button
	@SuppressWarnings("deprecation")
	@Test
	public void clickOnSignIN()
	{
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
}
