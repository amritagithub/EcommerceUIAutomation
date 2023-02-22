package com.magento.testPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.magento.base.BaseTest;
import com.magento.pageObjects.LandingPage;

public class LandingPageTest extends BaseTest {

	// Method to click on signIn button
	@Test
	public void clickOnSignIN() {
		
		landingpage.clickOnSignIn();
		logger.log(Status.PASS, "clicked on sign in button");
	

	}
	}
