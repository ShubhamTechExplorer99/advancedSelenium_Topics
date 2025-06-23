package com.automationExercise.pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P_007_ContactUsFunctionality extends BasePage {

	//Constructor
	public P_007_ContactUsFunctionality(WebDriver driver) {
		super(driver);
		
	}
	
	//Locators
	
	@FindBy(xpath = "//a[normalize-space()='Contact us']")
	WebElement btnContactUs;
	
	@FindBy(xpath = "//h2[normalize-space()='Get In Touch']")
	WebElement txtGetInTouch;
	
	@FindBy(xpath = "//input[@placeholder='Name']")
	WebElement txtName;
	
	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement txtEmail;
	
	@FindBy(xpath = "//input[@placeholder='Subject']")
	WebElement txtSubject;
	
	@FindBy(xpath = "//textarea[@id='message']")
	WebElement txtYourMessage;
	
	@FindBy(xpath = "//input[@name='upload_file']")
	WebElement btnChooseFile;
	
	@FindBy(xpath = "//input[@name='submit']")
	WebElement btnSubmit;
	
	//Actions Methods
	
	public void clkContactUs() {
		btnContactUs.click();
	}
	
	public void enterName() {
		txtName.sendKeys("Shubham");
	}
	
	public void enterEmail() {
		txtEmail.sendKeys("shubham119@gmail.com");
	}
	
	public void enterSubject() {
		txtSubject.sendKeys("Automation Testing");
	}
	
	public void enterMsg() {
		txtYourMessage.sendKeys("Welcome To Automation");
	}
	
	public void fileUpload(String filepath) {
		btnChooseFile.sendKeys(filepath);
	}
	
	public void clkSubmit() {
		btnSubmit.click();
		
	}
	
	public void acceptAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	
	
	

}
