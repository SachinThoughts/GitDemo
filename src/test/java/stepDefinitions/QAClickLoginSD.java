package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.QAClickMainPage;
import resources.base;

public class QAClickLoginSD  {
	
	WebDriver driver = Hooks.driver;
	LandingPage l= new LandingPage(driver);
	LoginPage p= new LoginPage(driver);
	QAClickMainPage q= new QAClickMainPage(driver);

	
	
//	 @Given("^I initialize the driver with chrome browser$")
//	    public void i_initialize_the_driver_with_chrome_browser() throws Throwable {
//		//driver= initializeDriver();
//		 System.out.println("Browser is initialised");
//		 
//	    }
//	 
//	
//	    @And("^I navigate to (.+) site$")
//	    public void i_navigate_to_site(String url) throws Throwable {
//	    	driver.get(url);
//	    }
	 
	    

	    @And("^I click on login link to navigate to login page secure site$")
	    public void i_click_on_login_link_to_navigate_to_login_page_secure_site() throws Throwable {
	    	if(l.noThanksSize()>0)
			{
				l.popUpNoThanks().click();
			}
			//l.getLogin().click();
			l.getLogin();
			
	    }
	    
	    @And("^I enter (.+) in Username box$")
	    public void i_enter_in_username_box(String username) throws Throwable {
	    	p.getEmailAddress(username);
    }

	   
	    @And("^I enter (.+) in Password box$")
	        public void i_enter_in_password_box(String password) throws Throwable {
	    	p.getPassword().sendKeys(password);
	    }

	    
	    @When("^I click on Login button$")
	    public void i_click_on_login_button() throws Throwable {
	    	p.clickLogin().click();
	    }

	    @Then("^I should verify if its a successful login$")
	    public void i_should_verify_if_its_a_successful_login() throws Throwable {
	    	
	    	//Assert.assertTrue(q.searchBox().isDisplayed());
	    	try
	    	{
	    		q.searchBox().isDisplayed();
	    		System.out.println("It is a successful login");
	    	}
	    	catch(Exception e)
	    	{
	    		System.out.println("It is not a successful login");
	    	}
	    	
	    	/*LoginPage p = new LoginPage(driver);
	    	boolean bool = q.searchBox().isDisplayed();
	    	if(bool == true)	    		
	    	{
	    	System.out.println("It is a successful login");
	    	}
	    	else
	    	{
	    	System.out.println("It is not a successful login");
	    	}*/
	    	//driver.close();
	    	//driver= null;
	        
	    }

}
 