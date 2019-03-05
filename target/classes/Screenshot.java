package resources;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.testng.Reporter;

import stepDefinitions.Hooks;

public class Screenshot {
	static WebDriver driver;
	
	public static void getScreenshots(String result) throws IOException
	{
		driver = Hooks.driver;	
	    	try
	    	{
	    		Calendar calendar = Calendar.getInstance();
		    	SimpleDateFormat formater  = new SimpleDateFormat("dd_MM_yyy_hh_mm_ss");
		    	
		    	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    		String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath()+ "/src/test/java/com/test/Screenshots/";
	    	    File destFile = new File((String) reportDirectory + result +" "+ formater.format(calendar.getTime())+ ".png");    	
	            FileUtils.copyFile(scrFile, destFile);
	            Reporter.log("<a herf='"+destFile.getAbsolutePath()+"'><img src='"+destFile.getAbsolutePath()+"'height='100' Width='100'/></a>");
	        }        
	     	catch(Exception e)
	    	{
	    		e.printStackTrace();
	    	}  	
	    
	}
}
