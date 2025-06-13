package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenApplication {

	public static void main(String[] args) throws InterruptedException {

		// Setting the property of chrome browser and passing the chromedriver path
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHUBHAM\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");

		// lanuching the browser instance
		WebDriver driver = new ChromeDriver();

		// wait of given time
		Thread.sleep(2000);

		// open url for get() methods
		driver.get("https://en-gb.facebook.com/login/");

		// maximise the windows
		driver.manage().window().maximize();

		// Delete all cookies
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();

		// open URL using navigate methods
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.co.in/");

		// Refresh the page
		Thread.sleep(2000);
		driver.navigate().refresh();

		// Navigate back to the page
		Thread.sleep(2000);
		driver.navigate().back();

		// Navigate forward to the page
		Thread.sleep(2000);
		driver.navigate().forward();

		// Fetch curremt URL to the page
		Thread.sleep(2000);
		String currentUrl = driver.getCurrentUrl();
		System.out.println("CURRENTURL :  " +currentUrl);

		// Fetch the title of the page
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println("TITLE : " + title);

		Thread.sleep(2000);
		driver.close();

	}

}
