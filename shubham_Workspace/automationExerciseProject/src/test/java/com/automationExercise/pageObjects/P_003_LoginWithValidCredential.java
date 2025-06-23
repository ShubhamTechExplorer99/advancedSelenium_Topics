package com.automationExercise.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P_003_LoginWithValidCredential extends BasePage{

	//Constructor
	public P_003_LoginWithValidCredential(WebDriver driver) {
		super(driver);
		
	}
	//Locators
	@FindBy(xpath = "//input[@data-qa='login-email']")
	WebElement txtEmailAdd;
	
	@FindBy(xpath ="//input[@placeholder='Password']" )
	WebElement txtPassword;
	
	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement signBtn;
	
	@FindBy(xpath = "//a[normalize-space()='Logout']")
	WebElement logoutbBtn;
	
	//Actions Methods
	//Email-shubham119@gmail.com
	//Pass-@Shubham119
	
	public void enterEmail(String email) {
		txtEmailAdd.sendKeys(email);
	}
	
	public void enterPass(String password) {
		txtPassword.sendKeys(password);
	}
	
	public void clkSignBtn() {
		signBtn.click();
	}
	
	public void clkLogout() {
		logoutbBtn.click();
	}
	
	
	

}
