package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage {

	// Constructor
	public LogoutPage(WebDriver driver) {
		super(driver);
	}
	
	//Locators
	
	@FindBy(xpath = "//span[normalize-space()='My Account']")
	WebElement myAccount;
	
	@FindBy(xpath = "(//a[text()='Logout'])[1]")
	WebElement btnLogout;
	
	
	//Actions methods
	public void clkMyAccount() {
		myAccount.click();
	}
	
	public void clkLogout() {
		btnLogout.click();
	}

}
