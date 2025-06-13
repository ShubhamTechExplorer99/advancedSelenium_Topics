package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\SHUBHAM\\\\Downloads\\\\chromedriver-win64 (5)\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		Actions act = new Actions(driver);
		WebElement Drag = driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
		Thread.sleep(3000);
		WebElement Drop = driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		Thread.sleep(3000);
		
		//With using drag and drop methods
		act.dragAndDrop(Drag, Drop).perform();
		
		//Without using drag and drop methods
		//act.clickAndHold(Drag).moveToElement(Drop).release().perform();
		
		
	}

}
