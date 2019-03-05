package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.gherkin.model.Scenario;
import com.aventstack.extentreports.gherkin.model.ScenarioOutline;

import cucumber.api.java.Before;


public class base {
	
public static WebDriver driver;
public Properties prop;


public WebDriver initializeDriver() throws IOException 
	{
		prop= new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\sachin.nair\\CertifyFramework\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);	
		String browserName= prop.getProperty("browser");
		System.out.println(browserName);

		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Framework\\Driver\\chromedriver.exe");
			driver= new ChromeDriver();	
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Framework\\Driver\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Framework\\Driver\\MicrosoftWebDriver.exe");
			WebDriver driver= new InternetExplorerDriver();
	}
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
	
@DataProvider
public Object[][] getData()
	{
		Object[][] data= new Object[2][3];
		data[0][0]= "nonrestricteduser@qw.com";
		data[0][1]= "12345";
		data[0][2]= "Non Restricted User";
		data[1][0]= "restricteduser@qw.com";
		data[1][1]= "12345";
		data[1][2]= "Restricted User";
		return data;
	}

public static void getScreenshots(String result) throws IOException
{
	
    
    	Calendar calendar = Calendar.getInstance();
    	SimpleDateFormat formater  = new SimpleDateFormat("dd_MM_yyy_hh_mm_ss");
    	
    	File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    	try
    	{
    		String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath()+ "/src/main/java/com/test/Screenshots/";
    	    File destFile = new File((String) reportDirectory + result +" "+ formater.format(calendar.getTime())+ ".png");    	
            FileUtils.copyFile(scrFile, destFile);
            Reporter.log("<a herf='"+destFile.getAbsolutePath()+"'><img src='"+destFile.getAbsolutePath()+"'height='100' Width='100'/></a>");
        }        
     	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	
    
}



public void tearDown()
{
	driver.close();
	driver= null;
}
}
