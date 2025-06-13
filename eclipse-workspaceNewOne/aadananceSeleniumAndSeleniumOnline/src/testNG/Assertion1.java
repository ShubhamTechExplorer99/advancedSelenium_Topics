package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion1 {

	@Test
	public void testCase1() {
		String expectedResult = "Facebook helps you connect and share with the people in your life.";

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHUBHAM\\Downloads\\chromedriver-win64 (5)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com/");

		String actualResult = driver.findElement(By.xpath("//h2[@class=\"_8eso\"]")).getText();

		// Equal assertion
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println("Equal Assertion Verified");

		// Fasle Assertion
		Assert.assertFalse(driver.findElement(By.xpath("//h2[@class=\"_8eso\"]")).isSelected());
		System.out.println("False Assertion Verified");

		// True Assertion
		Assert.assertTrue(driver.findElement(By.xpath("//h2[@class=\"_8eso\"]")).isDisplayed());
		System.out.println("True Assertion Verified");

	}

}
