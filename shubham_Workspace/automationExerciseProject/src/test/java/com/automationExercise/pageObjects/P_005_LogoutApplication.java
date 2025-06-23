package com.automationExercise.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P_005_LogoutApplication extends BasePage {

	//Constructor
	public P_005_LogoutApplication(WebDriver driver) {
		super(driver);
		
	}
	
	//Locators
	
	@FindBy(xpath = "//a[normalize-space()='Logout']")
	WebElement btnLogout;
	
	@FindBy(xpath = "//h2[normalize-space()='Login to your account']")
	WebElement getHomePageText;
	
	//Actions Methods
	public void clkLogout() {
		btnLogout.click();
	}
	
	public String getHomePageText() {
		return getHomePageText.getText();
		
	}

}
