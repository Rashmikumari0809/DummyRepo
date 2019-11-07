package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterPage {
	
	
	@FindBy(name="fld_username") WebElement UserNameTextbox;
	@FindBy(how=How.NAME,using="fld_password") WebElement PasswordTextbox;
	
	/*public void userNameInput()
	{
		
		UserNameTextbox.clear();
		UserNameTextbox.sendKeys("Usermane1");
		
	}*/
	
	public void userNameInput(String usrname)
	{
		
		UserNameTextbox.clear();
		UserNameTextbox.sendKeys(usrname);
		
	}
	public void emailIdInput()
	{
		
	}
	/*public void passWordInput()
	{
		
		PasswordTextbox.clear();
		PasswordTextbox.sendKeys("password1");
		
	}*/
	public void passWordInput(String password)
	{
		
		PasswordTextbox.clear();
		PasswordTextbox.sendKeys(password);
		
	}	

}
