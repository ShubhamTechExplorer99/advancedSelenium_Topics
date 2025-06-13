package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

	// Constructor
	public HomePage(WebDriver driver) {
		super(driver);

	}

	// Locators

	@FindBy(xpath = "//span[normalize-space()='My Account']")
	WebElement likMyaccount;

	@FindBy(xpath = "(//a[normalize-space()='Register'])[1]")
	WebElement likRegister;
	
	@FindBy(xpath = "//a[normalize-space()='Login']")
	WebElement linLogin;

	// Actions Methods
	public void clickMyAccount() {
		likMyaccount.click();
	}

	public void clickRegister() {
		likRegister.click();
	}
	
	public void clickLogin() {
		linLogin.click();
	}

}
