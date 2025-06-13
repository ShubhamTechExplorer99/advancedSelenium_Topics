package withoutPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	// Constructor
	LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Locators

	By username = By.xpath("//input[@name=\"username\"]");
	By password = By.xpath("//input[@name=\"password\"]");
	By loginButton = By.xpath("//button[@type=\"submit\"]");
	
	//driver.findElement(By.xpath("//button[normalize-space()='Login']"))

	// Actions Methods
	public void setUsername(String user) {
		driver.findElement(username).sendKeys(user);
	}

	public void setPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}

	public void clickLogin() {
		driver.findElement(loginButton).click();;
	}

}
