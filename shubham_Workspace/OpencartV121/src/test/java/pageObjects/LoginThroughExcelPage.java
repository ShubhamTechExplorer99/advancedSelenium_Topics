package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginThroughExcelPage extends BasePage{
	
	public LoginThroughExcelPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtEmailAddress;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtPassword;
	
	@FindBy(xpath = "//input[@value='Login']")
	WebElement btnLogin;
	
	public void setEmail(String username) {
		txtEmailAddress.sendKeys(username);
	}
	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}
	public void clkLogin() {
		btnLogin.click();
	}

}
