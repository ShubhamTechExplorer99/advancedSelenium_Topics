package accessModifierCheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HclFlipcartSelenium {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHUBHAM\\Downloads\\chromedriver-win64 (8)\\chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/plus");
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.xpath("//input[@class=\"zDPmFV\"]"));
		element.sendKeys("Samsung TV");

	}

}
