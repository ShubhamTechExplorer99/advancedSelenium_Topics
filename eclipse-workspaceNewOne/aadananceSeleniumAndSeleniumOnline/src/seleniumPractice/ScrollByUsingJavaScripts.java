package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumPackage.JavaScriptExecutor;

public class ScrollByUsingJavaScripts {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\SHUBHAM\\\\Downloads\\\\chromedriver-win64 (5)\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/downloads/");

		JavascriptExecutor j = (JavascriptExecutor) driver;

		for (int i = 0; i < 10; i++) {
			// To scroll down
			j.executeScript("window.scrollBy(0,500)");
			Thread.sleep(3000);
		}

		for (int i = 0; i < 10; i++) {
			// To Scroll Up
			j.executeScript("window.scrollBy(0,-500)");
			Thread.sleep(3000);
		}

	}

}
