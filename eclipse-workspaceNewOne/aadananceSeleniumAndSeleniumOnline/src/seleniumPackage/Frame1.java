package seleniumPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHUBHAM\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://paytm.com/");

		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		Thread.sleep(5000);

		// Find the total number of frame present on the web page
		int allframes = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total Number of frame : " + allframes);

		// check if element is present or not
		for (int i = 0; i < allframes; i++) {
			driver.switchTo().frame(i);
			driver.switchTo().frame(i);

			String expText = "Open Patym App";
			String actualTest = driver.findElement(By.xpath("//span[text()='Open Paytm App']")).getText();

			if (actualTest.equalsIgnoreCase(expText)) {
				System.out.println("Element Found");
				break;
			} else {
				System.out.println("Element Not Found");
			}

		}

	}

}
