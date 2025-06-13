package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\SHUBHAM\\\\Downloads\\\\chromedriver-win64 (5)\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Using id locators
		driver.findElement(By.id("username")).sendKeys("Shubham");
		
		//Using name 
		driver.findElement(By.name("password")).sendKeys("Jadhav");
		
		//Using classname
		//driver.findElement(By.className("login_button")).click();
		
		//Using linkedText
		//driver.findElement(By.linkText("Forgot Password?")).click();
		
		//Using partial linkTest
		driver.findElement(By.partialLinkText("Forgot")).click();
		
		//Using xpath
		driver.findElement(By.xpath("//input[@name=\"emailadd_recovery\"]")).sendKeys("Shubham119@gmail.comm");
		
	}

}
