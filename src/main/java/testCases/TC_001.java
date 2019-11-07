package testCases;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.RegisterPage;
import base.Instanciate;
import utilities.StoreExcelValues;
import utilities.dataProvider;

public class TC_001 extends Instanciate {
	
	
		
	@Test(dataProvider="Excel" , dataProviderClass=dataProvider.class)
		
	public void testcase1(String Username,String Password)
	{
		
		RegisterPage register= PageFactory.initElements(driver, RegisterPage.class);
	    //RegisterPage register= new RegisterPage();
		//PageFactory.initElements(driver, register);
		register.userNameInput(Username);
		register.passWordInput(Password);
		
	}

}

