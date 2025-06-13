package withPageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	//Constructor
	LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//locators
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement txt_username;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement txt_password;
	
	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement btn_login;
	
	@FindBy(tagName = "a")
	List<WebElement> links;
	
	//Actions Methods
	
	public void setUsername(String user) {
		txt_username.sendKeys(user);
	}
	
	public void setPassword(String pass) {
		txt_username.sendKeys(pass);
	}
	
	public void clickLogin() {
		txt_username.click();;
	}
	
	
	
	

}
