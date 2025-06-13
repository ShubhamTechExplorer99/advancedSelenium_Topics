package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewAccountRegistrationPage extends BasePage {

	// Constructor
	public NewAccountRegistrationPage(WebDriver driver) {
		super(driver);

	}

	// Locators

	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement txt_Firstname;

	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement txt_Lastname;

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txt_Email;

	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement txt_Telephone;

	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txt_Password;

	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement txt_ConfirmPassword;

	@FindBy(xpath = "//input[@name='agree']")
	WebElement chktPolicy;

	@FindBy(xpath = "//input[@value='Continue']")
	WebElement btnContinue;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;

	// Actions Methods

	public void setFirstName(String fname) {
		txt_Firstname.sendKeys(fname);
	}

	public void setLastName(String lname) {
		txt_Lastname.sendKeys(lname);
	}

	public void setEmail(String email) {
		txt_Email.sendKeys(email);
	}

	public void setTelephone(String tel) {
		txt_Telephone.sendKeys(tel);
	}

	public void setPassword(String pwd) {
		txt_Password.sendKeys(pwd);
	}

	public void setConfirmePassword(String pwd) {
		txt_ConfirmPassword.sendKeys(pwd);
	}

	public void setPrivacy() {
		chktPolicy.click();
	}

	public void setContinue() {
		btnContinue.click();
	}

	public String getConfirmationMsg() {
		try {
			return (msgConfirmation.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}

	}

}
