package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\SHUBHAM\\\\Downloads\\\\chromedriver-win64 (5)\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://adactinhotelapp.com/");
		
		//sendKeys
		driver.findElement(By.id("username")).sendKeys("Shubham");
		driver.findElement(By.name("password")).sendKeys("Jadhav");
		
		//Click
		driver.findElement(By.id("login")).click();
		
		//isDisplayed
		boolean logo = driver.findElement(By.xpath("//img[@class=\"logo\"]")).isDisplayed();
		
		if(logo==true) {
			System.out.println("Logo is available");
		}
		else
		{
			System.out.println("Logo is not available");
		}
		
		//isEnabled
		boolean enabled = driver.findElement(By.name("username")).isEnabled();
		
		if(enabled == true) {
			System.out.println("Test box is enabled to print");
		}
		else
		{
			System.out.println("Text box is not enabled to print");
		}
		
		//isSelectd is using in select class
	}
	
	

}
