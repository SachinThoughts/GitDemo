package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.DLRCertifyLoginPage;
import pageObjects.DLRHomePage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class CommonStepDef
{

	
	WebDriver driver = Hooks.driver;
	DLRCertifyLoginPage d= new DLRCertifyLoginPage(driver);
	DLRHomePage h= new DLRHomePage(driver);

	
	
	@And("^I initialize the driver with chrome browser$")
	public void i_initialize_the_driver_with_chrome_browser() throws Throwable {
	
	 System.out.println("Browser is initialised");
	 
    }
	
	@And("^I navigate to (.+) site$")
    public void i_navigate_to_site(String url) throws Throwable {
		driver.get(url);
        
    }
    
	@And("^I enter (.+) in Username field$")
    public void i_enter_in_username_field(String username) throws Throwable {
    	d.getUsername(username);
    	
    }

	 @And("^I enter (.+) in Password field$")
	    public void i_enter_in_password_field(String password) throws Throwable {
        d.getPassword(password);
	 }
	 
        
//     @And("^I should close the browser$")
//        public void i_should_close_the_browser() throws Throwable {
//    	 driver.close();   		  
//    		
//    }
    
	    @And("^I should be able to close the browser$")
	    public void i_should_be_able_to_close_the_browser() throws Throwable {
	        System.out.println("Browser closed successfully");
	    }

}
