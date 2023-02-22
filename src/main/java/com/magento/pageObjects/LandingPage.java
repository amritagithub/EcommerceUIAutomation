package com.magento.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.Status;

public class LandingPage {
	WebDriver driver;
	// create constructor
public LandingPage(WebDriver driver)
{this.driver=driver;
}
// create elements
@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[2]/a") WebElement signInButton;


// Action methods on the element sign in
public void clickOnSignIn() {
	signInButton.click();
	
	
	
	
}
}
