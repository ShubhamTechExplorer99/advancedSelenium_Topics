package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TakeScreenshotOnFailure2 {

	TakeScreenshotOnFailure1 t1 = new TakeScreenshotOnFailure1();

	@Test
	public void doLoagin() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHUBHAM\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
		t1.driver = new ChromeDriver();
		t1.driver.manage().window().maximize();
		t1.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		t1.driver.get("https://en-gb.facebook.com/login/");
		t1.driver.findElement(By.id("email")).sendKeys("12345");
		
		//Pass wrong id for password - testcase will be failes
		t1.driver.findElement(By.id("pass_wrong_pass")).sendKeys("12345");
	}
	
	@AfterMethod
	public void takeScreenshot(ITestResult result2) throws Exception {
		t1.captureScreenshot(result2);
		
	}

}
