package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardActions {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\SHUBHAM\\\\Downloads\\\\chromedriver-win64 (5)\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://adactinhotelapp.com/");
		
		WebElement element = driver.findElement(By.id("username"));
		element.sendKeys("Shubham");
		WebElement element2 = driver.findElement(By.name("password"));
		
		element.sendKeys(Keys.CONTROL,"ac");
		element2.sendKeys(Keys.CONTROL,"v");
		
		
		
	}

}
