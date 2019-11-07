package dev.greene.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		// PageFactory is a class that will allow us to easily access the elements on a webpage
		PageFactory.initElements(driver, this);
	}
	
	//Selenium selectors


	@FindBy(id="loginUsername")
	public WebElement username;
	
	@FindBy(id="loginPassword")
	public WebElement password;
	
	@FindBy(id="login-btn")
	public WebElement loginButton;
	
	@FindBy(id="create-user-btn")
	public WebElement createUserButton;
	
	

}
