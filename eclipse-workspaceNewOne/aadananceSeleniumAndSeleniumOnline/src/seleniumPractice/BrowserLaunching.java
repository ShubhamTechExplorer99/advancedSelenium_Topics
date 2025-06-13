package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserLaunching {

	public static void main(String[] args) throws InterruptedException {

		// Opem the browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\SHUBHAM\\\\Downloads\\\\chromedriver-win64 (8)\\\\chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// maximize the window
		driver.manage().window().maximize();

		// Enter the URL
		driver.get("https://www.facebook.com/login/");

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println("Facebook home page is opend");
		Thread.sleep(3000);

		// To get the title of current webpage
		String title = driver.getTitle();
		System.out.println("Title of the current webpage : " + title);

		// To get the URL of current webpage
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL Of the webpage : " + currentUrl);

		// Close the browser
		driver.close();
		System.out.println("Broser is closed");

	}

}
