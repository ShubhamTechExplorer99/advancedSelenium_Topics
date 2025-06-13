package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\\\\\Users\\\\\\\\SHUBHAM\\\\\\\\Downloads\\\\\\\\chromedriver-win64 (5)\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://text-compare.com/");

		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("WELCOME");
		Actions act = new Actions(driver);

		// Control+A -Select the etxt
		// down=pressing and up - relasing the control
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();

		// Contril+C -copy the text
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();

		Thread.sleep(2000);

		// TAB -shift to second box

		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();

		// Control+V -paste the text
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();

	}

}
