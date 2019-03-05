package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import resources.CommonMethods;

public class DLRHomePage {
	
	public WebDriver driver;
	
	@FindBy(xpath ="//a[text()='Home']")
	public WebElement hometab;
	
	
	
	
	public DLRHomePage(WebDriver driver) 
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}


	public void getHomeTab() throws InterruptedException
	{	
		hometab.isDisplayed();
	}

}
