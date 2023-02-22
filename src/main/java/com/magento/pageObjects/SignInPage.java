package com.magento.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	WebDriver driver;
	// create constructor
public SignInPage(WebDriver driver)
{	this.driver=driver;
}
// create elements
@FindBy(id="email") WebElement username;
@FindBy(id="pass") WebElement password;
@FindBy(id="send2") WebElement signInButton;


// Action methods on the element sign in
public SignInPage SignIn(String UserName, String Password) {
	
	username.sendKeys(UserName);
	password.sendKeys(Password);
	signInButton.click();
	return (new SignInPage(driver));
}
}



