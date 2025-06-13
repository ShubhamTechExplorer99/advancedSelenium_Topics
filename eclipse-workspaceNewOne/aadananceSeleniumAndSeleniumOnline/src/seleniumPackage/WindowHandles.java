package seleniumPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\chromedriver-win64 (5)\\chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Windows.html");

		WebElement newTabButton = driver.findElement(By.xpath("//button[text()='    click   ']"));
		newTabButton.click();

		String mainWindow = driver.getWindowHandle();

		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> iterator = allWindows.iterator();

		while (iterator.hasNext()) {
			String childWindow = iterator.next();

			if (!mainWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow); // Switch to new window
				System.out.println("New Window Title: " + driver.getTitle());

				// Perform some action in the new window (Example: Print Title)
				Thread.sleep(2000);
				driver.close(); // Close the new window
			}
		}
	}

}
