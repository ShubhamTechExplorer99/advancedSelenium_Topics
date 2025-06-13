package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavaScriptExecutorDemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SHUBHAM\\\\Downloads\\\\chromedriver-win64 (3)\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement inputbox = driver.findElement(By.xpath("//input[@id='name']"));
		
		//Passing the text into inputbox -alternate of sendkays()
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//JavaScriptExecutor js = driver;
		
		js.executeScript("arguments[0].setAttribute('value','Shubham')",inputbox);
		
		
		//clicking on element  - alternate of click()
		WebElement radioButton = driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()",radioButton);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
