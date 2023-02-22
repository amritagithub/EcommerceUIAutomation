package com.magento.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.magento.pageObjects.LandingPage;
import com.magento.pageObjects.SignInPage;
import com.magento.utilities.BrowserFactory;
import com.magento.utilities.URLFactory;

public class BaseTest {
protected WebDriver driver;
public ExtentHtmlReporter htmlReporter;
public static ExtentReports extent;
public static ExtentTest logger;

BrowserFactory factory=new BrowserFactory();
URLFactory factoryURL=new URLFactory();
protected LandingPage landingpage;
protected SignInPage signinpage;
String url;
@Parameters({"browser", "Environment"}) 
	@BeforeSuite
	public void setUp(String browser, String Environment)
	{
		driver=factory.getDriver(browser, driver);
		url=factoryURL.getURL(Environment);
		url=url.replace("\"", "");
		driver.get(url);
		driver.manage().window().maximize();
		landingpage=PageFactory.initElements(driver,LandingPage.class );
		signinpage=PageFactory.initElements(driver,SignInPage.class );
		htmlReporter= new ExtentHtmlReporter("./Reports/ExtentReportResults.html");
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Automation tester", "Amrita");
		logger=extent.createTest("Test started");
	}
@AfterMethod
public void loggerMethod(ITestResult result)
{
	if(result.getStatus()==ITestResult.FAILURE)
	{
		String failed="failed";
		Markup m=MarkupHelper.createLabel(failed, ExtentColor.RED);
		logger.log(Status.FAIL, m);
	}
	else
	{
		String passed="Passed";
		Markup m=MarkupHelper.createLabel(passed, ExtentColor.GREEN);
		logger.log(Status.PASS, m);
	}
	}

	@AfterClass
	public void tearDown()
	{
		extent.flush();
		/*driver.close();
		if(result.getStatus()==ITestResult.FAILURE)
		{
			System.out.println("capture screenshots");
		}*/
	
	}
}
