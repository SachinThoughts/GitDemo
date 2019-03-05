package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.CommonMethods;

public class LoginPage {
	
	public WebDriver driver;
	
	@FindBy(xpath ="//input[@id='user_email']")
	public WebElement username;
	
	@FindBy(xpath ="//input[@id='user_password']")
	public WebElement password;
	
	@FindBy(xpath ="//input[@value='Log In']")
	public WebElement login;
	
	@FindBy(xpath ="//div[@class='alert alert-danger']")
	public WebElement loginerror;
	
			
	public LoginPage(WebDriver driver) 
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	public void getEmailAddress(String value) throws Exception
	{
		CommonMethods.inputData(driver, username, value);		
	}
		
	
	public WebElement getPassword()
	{
		return password;
	}
	
	public WebElement clickLogin()
	{
		return login;
	}
	
	public WebElement errorLogin()
	{
		return loginerror;
	}	

}
