package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\SHUBHAM\\\\Downloads\\\\chromedriver-win64 (5)\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/plus");
		
		WebElement electronics = driver.findElement(By.xpath("//span[normalize-space()='Electronics']"));
		
		Actions act = new Actions(driver);
		 act.moveToElement(electronics).perform();
		Thread.sleep(3000);
		 WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Samsung']"));
		 element.click();
	}

}
