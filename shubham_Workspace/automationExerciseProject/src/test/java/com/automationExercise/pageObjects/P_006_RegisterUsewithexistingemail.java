package com.automationExercise.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P_006_RegisterUsewithexistingemail extends BasePage{

	//Constructor
	public P_006_RegisterUsewithexistingemail(WebDriver driver) {
		super(driver);
		
	}
	
	//Locators
	
	@FindBy(xpath = "//input[@placeholder='Name']")
	WebElement txtName;
	
	@FindBy(xpath = "//input[@data-qa='signup-email']")
	WebElement txtEmail;
	
	@FindBy(xpath = "//button[normalize-space()='Signup']")
	WebElement btnSignUp;
	
	@FindBy(xpath = "//p[normalize-space()='Email Address already exist!']")
	WebElement txtError;
	
	//Action Methods
	
	public void entername(String name) {
		txtName.sendKeys(name);
	}
	
	public void enterEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void clkSignUp() {
		btnSignUp.click();
	}
	
	public String getErrorMsg() {
		return txtError.getText();
	}
	
	
	

	
	

	

	
	
	
}
