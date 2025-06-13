package seleniumPractice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKart {

	public static void main(String[] args) throws InterruptedException, Exception {

		// 1.Go to flipkart,com, click mobile case using mouse over action,&check the
		// particular
		// title is correct and take screenshot :

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\SHUBHAM\\\\Downloads\\\\chromedriver-win64 (5)\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		WebElement Mobile = driver.findElement(By.xpath("//div[@aria-label=\"Electronics\"]"));

		Actions act = new Actions(driver);
		act.moveToElement(Mobile).build().perform();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Electronics GST Store']"));
		element.click();
		System.out.println("Clicked on mobile element");

		String title = driver.getTitle();
		System.out.println(title);

		if (title.equals(
				"Electronics GST Store Online - Avail GST benefits on electronic purchases for Business on Flipkart")) {
			System.out.println("Title is correct");
		}

		else {
			System.out.println("Title is incorect");
		}
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest =new File("C:\\\\Users\\\\SHUBHAM\\\\OneDrive\\\\Pictures\\\\/facebook.png");
		FileUtils.copyFile(source, dest);
		System.out.println("Screesnshot is captured");
	}

}
