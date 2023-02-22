package com.magento.testPages;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.magento.base.BaseTest;
import com.magento.pageObjects.SignInPage;

public class SignInPageTest extends BaseTest{
	//@Parameters("Environment")
	@Test
	public void performSignIn()
	{
		//if(Environment.equals("Staging"))
		//{
			String Username="test_falabella@test.com";
			String Password="test@123";
			signinpage.SignIn(Username,Password);
		//}
	}

}
