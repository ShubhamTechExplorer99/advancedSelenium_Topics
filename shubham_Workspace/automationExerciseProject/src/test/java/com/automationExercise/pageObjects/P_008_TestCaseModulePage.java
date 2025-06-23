package com.automationExercise.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P_008_TestCaseModulePage extends BasePage {

	//constructor 
	public P_008_TestCaseModulePage(WebDriver driver) {
		super(driver);
		 
	}
	
	//Locators
	@FindBy(xpath = "//a[normalize-space()='Test Cases']")
	WebElement txtTestCases;
	
	@FindBy(xpath = "//span[contains(text(),'Below is the list of test Cases for you to practic')]")
	WebElement txtVisibleOnTCPage;
	
	//ActionsMethods
	public void clkTc() {
		txtTestCases.click();
	}
	
	public String displayMsg() {
		return txtVisibleOnTCPage.getText();
	}

}
