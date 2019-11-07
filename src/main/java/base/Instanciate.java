package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.Utility;

public class Instanciate {
	public WebDriver driver;
	
	@BeforeMethod
	public void startbrowser() throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver","./resources/Chrome_exe/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(Utility.FetchPropertyvalue("url").toString());
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}

	
}
