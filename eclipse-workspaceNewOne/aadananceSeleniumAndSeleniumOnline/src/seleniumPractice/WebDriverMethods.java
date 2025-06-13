package seleniumPractice;

import java.awt.Dimension;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHUBHAM\\Downloads\\chromedriver-win64 (5)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Dimension d = new Dimension(500, 500);
		// driver.manage().window().setSize(d);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/login/");

		String title = driver.getTitle();
		System.out.println("Title : " + title);

		String currentUrl = driver.getCurrentUrl();
		System.out.println("CurrentURL : " + currentUrl);

		String pageSource = driver.getPageSource();
		// System.out.println("PageSource : "+ pageSource);

		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println("Cookies : " + cookies);

		driver.manage().deleteAllCookies();
		driver.findElement(By.id("email")).sendKeys("Shubham0119");

		driver.findElement(By.id("pass")).sendKeys("Jadhav0119");

		//driver.findElement(By.id("loginbutton")).click();

		Thread.sleep(3000);

		System.out.println("Login To facebook");
		
		boolean logo = driver.findElement(By.xpath("//img[@class=\"_97vu img\"]")).isDisplayed();
		
		if(logo==true) {
			System.out.println("Logo is displayed");
		}
		else
		{
			System.out.println("Logo is not displayed");
		}

		//driver.close();

	}

}
