package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.mongodb.assertions.Assertions;

import resources.CommonMethods;


public class DLRCertifyLoginPage {
	
	public WebDriver driver;

	
	@FindBy(xpath ="//input[@id='userid']")
	public WebElement username;
	
	@FindBy(xpath ="//input[@id='userpassword']")
	public WebElement password;
	
	@FindBy(xpath ="//button[@id='loginSubmit']")
	public WebElement goButton;
	
	@FindBy(xpath ="//a[text()='Forgotten your Username/Password?']")
	public WebElement forgotuserpass;
	
	@FindBy(xpath ="//select[@id='languageListSelectionId']")
	public WebElement languageselection;
	
		
	

	public DLRCertifyLoginPage(WebDriver driver) 
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}


	public void getUsername(String data) throws InterruptedException, IOException
	{	
		CommonMethods.inputData(driver, username, data);
	}
	
	public void getPassword(String data) throws InterruptedException, IOException
	{	
		CommonMethods.inputData(driver, password, data);		
	}
	
	public void getLoginClick() throws InterruptedException, IOException
	{	
		CommonMethods.click(driver, goButton);	
		
	}
	
	public void getForgotUsernamePassword() throws InterruptedException, IOException
	{	
		CommonMethods.click(driver, forgotuserpass);	
	}
	
	public void getLanguageSelectionDropdown(int i) throws InterruptedException, IOException
	{	
		CommonMethods.selectDropdownbyindex(driver, languageselection, i);
	}

}


	