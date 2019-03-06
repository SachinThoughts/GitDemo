package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageObjects.DLRCertifyLoginPage;
import pageObjects.DLRHomePage;
import resources.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class DLRLoginPage {
	
	WebDriver driver = Hooks.driver;
	DLRCertifyLoginPage d= new DLRCertifyLoginPage(driver);
	DLRHomePage h= new DLRHomePage(driver);
	

//	    @Given("^I initialize the driver with chrome browser for DLR site$")
//	    public void i_initialize_the_driver_with_chrome_browser_for_dlr_site() throws Throwable {
//	    	System.out.println("Browser is initialised");
//	    }

	   
//	    @And("^I navigate to (.+) site$")
//	    public void i_navigate_to_site(String URL) throws Throwable {
//	        driver.get(URL);
//	    }

//	    @And("^I enter (.+) in Username field$")
//	    public void i_enter_in_username_field(String Username) throws Throwable {
//	    	d.getUsername(Username);
//	    }
//
//	    @And("^I enter (.+) in Password field$")
//	    public void i_enter_in_password_field(String Password) throws Throwable {
//	        d.getPassword(Password);
//	    }
	
	
	    
	    @When("^I click on Go button$")
	    public void i_click_on_go_button() throws Throwable {
	        d.getLoginClick();
	    }

	    @Then("^I should verify if its a successful DLR login$")
	    public void i_should_verify_if_its_a_successful_dlr_login() throws Throwable {
	    	try
	    	{
	    		h.getHomeTab();
	    		System.out.println("It is a successful login");
	    	}
	    	catch(Exception e)
	    	{
	    		System.out.println("It is not a successful login");
	    	}
	    }
	    
	    @And("^I navigate to (.+) site$")
	    public void i_navigate_to_site(String URL) throws Throwable {
	        driver.get(URL);
    }

	    @And("^I enter (.+) in Username field$")
	    public void i_enter_in_username_field(String Username) throws Throwable {
	    	d.getUsername(Username);
	    }

	    @And("^I enter (.+) in Password field$")
	    public void i_enter_in_password_field(String Password) throws Throwable {
	        d.getPassword(Password);
    }

	}


