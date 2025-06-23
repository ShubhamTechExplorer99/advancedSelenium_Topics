package com.automationExercise.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P_001_HomePage extends BasePage {

	// Constructor
	
	public P_001_HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// locators

	@FindBy(xpath = "//img[@alt='Website for automation practice']")
	WebElement homePageLogo;

	@FindBy(xpath = "//a[normalize-space()='Signup / Login']")
	WebElement btnSignin;

	// Actions Methods
	
	public boolean isHomePageDisplayed() {

		return homePageLogo.isDisplayed();
	}
	
	public void clkSignBtn() {
		btnSignin.click();
	}

}
