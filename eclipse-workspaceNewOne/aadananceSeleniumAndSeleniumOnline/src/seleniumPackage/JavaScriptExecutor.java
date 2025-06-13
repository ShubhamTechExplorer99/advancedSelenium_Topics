package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SHUBHAM\\\\Downloads\\\\chromedriver-win64 (3)\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/login/");
		
		//JavaScript Execututor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Locate web ELement
		js.executeScript("document.getElementById('email').value='abc@gmail.com'");
		js.executeScript("document.getElementsByName('pass')[0].value='abc@gmail.com'");
		js.executeScript("document.getElementsByName('login')[0].click()");
	
		
		
		//Scroll Down using JavaScript
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,1000)");
		
		////Scroll Up using JavaScript
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-1000)");
		
		
	}

}
