 package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHUBHAM\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
		
		/*
		Thread.sleep(3000);
		driver.findElement(By.xpath("(// button[text()='Click me'])[2]")).click();
		
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		
		Thread.sleep(6000);
		driver.switchTo().alert().dismiss();
		
		System.out.println("Alerts Cancelled");
		*/
		
		//Accept alert using javascriptExecutor
		JavascriptExecutor jse =(JavascriptExecutor) driver;
		jse.executeAsyncScript("document.getElementById('confirmButton').click()");
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		System.out.println("Accepted");
		
		
		
		
		
	}

}
