package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QAClickMainPage {
	
	public WebDriver driver;
	
	@FindBy(name ="query")
	public WebElement searchbox;
	
		
	public QAClickMainPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	
	
	public WebElement searchBox()
	{
		return searchbox;
	}
	

}
