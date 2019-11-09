package testCases;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


import Pages.RegisterPage;
import base.Instanciate;
import utilities.ExtentReportGen;
import utilities.StoreExcelValues;
import utilities.Utility;
import utilities.dataProvider;
@Listeners(utilities.ExtentReportGen.class)
public class TC_001 extends Instanciate {
	ExtentHtmlReporter reporter;
	ExtentReports report;
	ExtentTest test;
	
	
	
	
	@Test(dataProvider="Excel" , dataProviderClass=dataProvider.class)
		
	public void testcase1(String Username,String Password )
	{
		
		RegisterPage register= PageFactory.initElements(driver, RegisterPage.class);
	    //RegisterPage register= new RegisterPage();
		//PageFactory.initElements(driver, register);
		register.userNameInput(Username);
		register.passWordInput(Password);
		
		
		
	}
	
}

