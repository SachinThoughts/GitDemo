package resources;

import java.io.IOException;

import org.jsoup.Connection.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.Scenario;

public class CommonMethods {

	
	public static void click(WebDriver driver,WebElement element) throws InterruptedException, IOException
	{
		try {
		HighlightElement.hh(driver,element);
			element.click();
			
		}
		catch(Exception e)
		{
			String result = "Fail";
			Screenshot.getScreenshots(result);
			Assert.fail("Unable to locate element");
					
		}
	}
	
	public static void inputData(WebDriver driver,WebElement element, String data) throws InterruptedException, IOException
	{
		try {
		HighlightElement.hh(driver,element);
		element.sendKeys(data);		
		
	}
		catch(Exception e)
		{
			String result = "Fail";
			Screenshot.getScreenshots(result);
			Assert.fail("Unable to locate element");
		}
		}
	
	public static void selectDropdownbyvalue(WebDriver driver,WebElement element, String data1) throws InterruptedException, IOException
	{
		try {
		Select drpvalue = new Select(element);
		HighlightElement.hh(driver,element);
		Thread.sleep(2000);
		drpvalue.selectByValue(data1);	
		}
		catch(Exception e)
		{
			String result = "Fail";
			Screenshot.getScreenshots(result);
			Assert.fail("Unable to locate element");
		}
	}
	
	public static void selectDropdownbyindex(WebDriver driver,WebElement element, int data2) throws InterruptedException, IOException
	{
		try {
		Select drpvalue1 = new Select(element);
		HighlightElement.hh(driver,element);
		Thread.sleep(2000);
		drpvalue1.selectByIndex(data2);
		}
		catch(Exception e)
		{
			String result = "Fail";
			Screenshot.getScreenshots(result);
			Assert.fail("Unable to locate element");
		}
	}
	
	public static void selectDropdownbyisibletext(WebDriver driver,WebElement element, String data3) throws InterruptedException, IOException
	{
		try {
		Select drpvalue2 = new Select(element);
		HighlightElement.hh(driver,element);
		Thread.sleep(2000);
		drpvalue2.selectByVisibleText(data3);
		}
		catch(Exception e)
		{
			String result = "Fail";
			Screenshot.getScreenshots(result);
			Assert.fail("Unable to locate element");
		}
	}
	

}
