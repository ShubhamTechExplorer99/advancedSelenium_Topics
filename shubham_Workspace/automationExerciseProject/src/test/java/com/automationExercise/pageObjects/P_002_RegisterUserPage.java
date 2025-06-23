package com.automationExercise.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P_002_RegisterUserPage extends BasePage {

	public P_002_RegisterUserPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//input[@placeholder='Name']")
	WebElement txt_Name;
	
	@FindBy(xpath = "//input[@data-qa='signup-email']")
	WebElement txt_Email;
	
	@FindBy(xpath = "//button[normalize-space()='Signup']")
	WebElement btnSign;
	
	@FindBy(xpath = "//input[@id='id_gender1']")
	WebElement titleBoxbtn;
	
	@FindBy(xpath = "//input[@id='name']")
	WebElement nameOfUserText;
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement emailText;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement passwodText;
	
	@FindBy(xpath = "//input[@id='newsletter']")
	WebElement newsLettercheckbox;
	
	@FindBy(xpath = "//input[@id='optin']")
	WebElement specialOffercheckbox;
	
	@FindBy(xpath = "//input[@id='first_name']")
	WebElement firstName;
	
	@FindBy(xpath = "//input[@id='last_name']")
	WebElement lastName;
	
	@FindBy(xpath = "//input[@id='company']")
	WebElement compnyName;
	
	@FindBy(xpath = "//input[@id='address1']")
	WebElement address1;
	
	@FindBy(xpath = "//input[@id='address2']")
	WebElement address2;
	
	@FindBy(xpath = "//input[@id='state']")
	WebElement state;
	
	@FindBy(xpath = "//input[@id='city']")
	WebElement city;
	
	@FindBy(xpath = "//input[@id='zipcode']")
	WebElement zipCode;
	
	@FindBy(xpath = "//input[@id='mobile_number']")
	WebElement mobNo;
	
	@FindBy(xpath = "//button[normalize-space()='Create Account']")
	WebElement btnCreateAccount;
	
	@FindBy(xpath = "//a[text()='Continue']")
	WebElement continueBtn;
	
	@FindBy(xpath = "//a[normalize-space()='Delete Account']")
	WebElement deleteAccountbtn;
	
	@FindBy(xpath = "//b[normalize-space()='Account Deleted!']")
	WebElement accountDeletedMsg;
	
	@FindBy(xpath = "//a[normalize-space()='Continue']")
	WebElement continueAfterDeleteBtn;
		
	
	//Actions Methods
	public void enterName(String ename) {
		txt_Name.sendKeys(ename);
	}
	
	public void enterEmail(String email) {
		txt_Email.sendKeys(email);
	}
	
	public void clkSigninBtn() {
		btnSign.click();
	}
	
	public void btnTitle() {
		titleBoxbtn.click();
	}
	
	public void enterNames(String ename) {
		nameOfUserText.sendKeys(ename);
	}
	
	public void enterEmails(String email) {
		emailText.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		passwodText.sendKeys(password);
	}
	
	public void selectNewsLetter() {
		newsLettercheckbox.click();
	}
	
	public void enterFirstName(String ename) {
		firstName.sendKeys(ename);
	}
	
	public void enterLastName(String lname) {
		lastName.sendKeys(lname);
	}
	
	public void enterCompanyName() {
		compnyName.sendKeys("jadhav.pvt.lmt");
	}
	
	public void enterAddress1() {
		address1.sendKeys("Konark PG");
	}
	
	public void enterState() {
		state.sendKeys("Maharastra");
	}
	
	public void enterCity() {
		city.sendKeys("Pune");
	}
	
	public void enterZipCode() {
		zipCode.sendKeys("411032");
	}
	
	public void enterMobileNo() {
		mobNo.sendKeys("1234567990");
	}
	
	public void createAccBtn() {
		btnCreateAccount.click();;
	}
	
	public void continueBtnclk() {
		continueBtn.click();
	}
	
	public void deleteAccount() {
		deleteAccountbtn.click();
	}
	
	public void continueAfterDeletBtn() {
		continueAfterDeleteBtn.click();
	}
	
	
	
	
	

}
