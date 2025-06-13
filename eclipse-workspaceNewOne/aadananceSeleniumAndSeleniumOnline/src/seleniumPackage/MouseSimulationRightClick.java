package seleniumPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulationRightClick {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHUBHAM\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/plus");

		// Create Electronics web element Ref
		WebElement electro = driver.findElement(By.xpath("//span[text()='Electronics']"));
		// Mouse Simulation using action class
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		a.moveToElement(electro).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();

		// Keyboard operation
		Thread.sleep(2000);

		WebElement men = driver.findElement(By.xpath("//span[text()='Men']"));
		a.sendKeys(men, Keys.ENTER).build().perform();
		System.out.println("Men option Clicked");

		// Right click on the webpage
		Thread.sleep(2000);
		a.contextClick().build().perform();
		Thread.sleep(5000);

		driver.close();

	}
}
