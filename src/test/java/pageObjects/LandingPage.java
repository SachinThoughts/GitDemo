package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import resources.CommonMethods;

public class LandingPage {

	public WebDriver driver;
		

	@FindBy(xpath ="//a[contains(@href,'sign_in')]")
	public WebElement signin;
	
	@FindBy(xpath ="//h2[text()='Featured Courses']")
	public WebElement title;
	
	@FindBy(xpath ="//ul[@class='nav navbar-nav navbar-right']")
	public WebElement navbar;
	
	@FindBy(xpath ="//button[text()='NO THANKS']")
	public List<WebElement> nothanks;
	
//	@FindBys(xpath)
//	By nothanks = By.xpath("nothanks");

public LandingPage(WebDriver driver) 
{
	this.driver= driver;
	PageFactory.initElements(driver, this);
}


public void getLogin() throws InterruptedException, IOException
{	
	CommonMethods.click(driver,signin);	
}

public WebElement getTitle()
{	
	return title;
}


public WebElement getNavBar()
{	
	return navbar;
}

public int noThanksSize()
{	
	//return driver.findElements(nothanks).size();
	//return driver.findElements(nothanks).size();
	return nothanks.size();
	
}

public WebElement popUpNoThanks()
{	
	return nothanks.get(0);
	//return driver.findElement(nothanks);
}

}
