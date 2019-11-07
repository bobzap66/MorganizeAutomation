package dev.greene.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
	
WebDriver driver;
	
	public UserPage(WebDriver driver) {
		this.driver = driver;
		// PageFactory is a class that will allow us to easily access the elements on a webpage
		PageFactory.initElements(driver, this);
	}
	
	//Selenium selectors


	@FindBy(id="logout-btn")
	public WebElement logout;
	
	@FindBy(id="create-event-btn")
	public WebElement createEvent;
	
	@FindBy(id="home-btn")
	public WebElement homeButton;
	
	@FindBy(id="create-organization-btn")
	public WebElement createOrganizationButton;

}
