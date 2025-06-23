package com.automationExercise.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P_004_LoginWithInvalidC extends BasePage {

	//Constructor
	public P_004_LoginWithInvalidC(WebDriver driver) {
		super(driver);
	}
	
	//Locators
	@FindBy(xpath = "//input[@data-qa='login-email']")
	WebElement txtEmailAdd;
	
	@FindBy(xpath ="//input[@placeholder='Password']" )
	WebElement txtPassword;
	
	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement signBtn;
	
	@FindBy(xpath = "//p[normalize-space()='Your email or password is incorrect!']")
	WebElement errorMsg;
	
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
	
	public String getErroMsg() {
		return errorMsg.getText();
	}

}
