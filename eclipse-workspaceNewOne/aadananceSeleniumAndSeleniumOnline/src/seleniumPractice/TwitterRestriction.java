package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TwitterRestriction {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\SHUBHAM\\\\\\\\Downloads\\\\\\\\chromedriver-win64 (5)\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://x.com/i/flow/signup");
		driver.findElement(By.xpath("//a[@href='/i/flow/signup']//div[@class='css-146c3p1 r-bcqeeo r-qvutc0 r-37j5jr r-q4m81j r-a023e6 r-rjixqe r-b88u0q r-1awozwy r-6koalj r-18u37iz r-16y2uox r-1777fci']")).click();
		
		driver.findElement(By.xpath("//input[@autocomplete=\"name\"]")).sendKeys("Shubham");
		driver.findElement(By.xpath("//input[@autocomplete=\"email\"]")).sendKeys("shubh@gmail.com");
		
		WebElement date = driver.findElement(By.xpath("//select[@aria-labelledby=\"SELECTOR_1_LABEL\"]"));
		Select s = new Select(date);
		s.selectByValue("July");
		
	}

}
