package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDowns {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\SHUBHAM\\\\Downloads\\\\chromedriver-win64 (5)\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://ironspider.ca/forms/dropdowns.htm");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.name("coffee"));
		Thread.sleep(3000);
		Select s = new Select(element);
		Thread.sleep(3000);
		s.selectByIndex(3);
		
		//SelectByValue
		//SelectByText
		//SelectByVisibleText
		
	}

}
