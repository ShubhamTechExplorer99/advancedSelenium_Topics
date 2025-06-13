 package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4JLogging {

	public static void main(String[] args) {

		// Create Logger Instance
		Logger logger = Logger.getLogger("Log4JLogging");

		// Configure log4j.properties file
		PropertyConfigurator.configure(
				"C:\\Users\\SHUBHAM\\eclipse-workspace\\Online_Java_Workspace\\Online_Java_Batch\\Repository\\Log4j.properties");

		// Open Browser instance
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHUBHAM\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		logger.info("Chrome Browser Opend");

		// Maximize the window
		driver.manage().window().maximize();
		logger.info("Window Maximized");

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger.info("Implicit wait given");

		// Check if the webElement is displayed or not
		/*
		 * try { driver.findElement(By.id("emails")).isDisplayed();
		 * logger.info("WebElement found"); } catch (Exception e) { e.printStackTrace();
		 * logger.info("Failure- WebElement not found"); }
		 */

	}

}
