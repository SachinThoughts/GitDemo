package resources;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	
	public static void iWait(int secs)
	{
	try
	{
		Thread.sleep(secs);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	} 
public static void iWaitForSecs(WebDriver driver,int secs)
	{
		driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);
	} 
//Implicit wait in minutes
	public static void iWaitForMins(WebDriver driver,int mins)
	{
		driver.manage().timeouts().implicitlyWait(mins, TimeUnit.MINUTES);
	} 
//Explicit wait in seconds till the element is visible
	public static void eWait(WebDriver driver, int secs, WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver, secs);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	//Explicit wait in seconds till the element is clickable
	public static void eWaitForClickable(WebDriver driver, int secs, WebElement ele) 
	{
		WebDriverWait wait = new WebDriverWait(driver, secs);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	} 

	//Explicit wait in seconds till the title is visible
	public static void eWaitForTitle(WebDriver driver, int secs, String expTitle) 
	{
		WebDriverWait wait = new WebDriverWait(driver, secs);
		wait.until(ExpectedConditions.titleIs(expTitle));
	}

	//Explicit wait in seconds to verify staleness of element
	public static void eWaitForStaleness(WebDriver driver, int secs, WebElement ele) 
	{
		WebDriverWait wait = new WebDriverWait(driver, secs);
		wait.until(ExpectedConditions.stalenessOf(ele));
	} 

}
