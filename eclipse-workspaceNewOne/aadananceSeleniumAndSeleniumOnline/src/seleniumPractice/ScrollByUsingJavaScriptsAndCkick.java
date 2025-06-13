package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByUsingJavaScriptsAndCkick {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\SHUBHAM\\\\Downloads\\\\chromedriver-win64 (5)\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");

		JavascriptExecutor j = (JavascriptExecutor) driver;
		
		// assign up to which path we want to down
		WebElement w = driver.findElement(By.xpath("//*[text()='LiveDemo']"));
		
		//scroll down up to particular path
		j.executeScript("arguments[0].scrollIntoView(true)",w);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='View more demos']")).click();
		}
	}


