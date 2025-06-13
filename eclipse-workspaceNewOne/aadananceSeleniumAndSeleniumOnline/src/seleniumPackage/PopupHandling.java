package seleniumPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHUBHAM\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
		
		//Step 1 = Tab Handling
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('tabButton').click()");
		
		//get the total number open tabs/windows
		Set<String> allwindowId = driver.getWindowHandles();
		System.out.println(allwindowId);
		Iterator<String> abc = allwindowId.iterator();
		String wind1 = abc.next();
		String wind2 = abc.next();
		
		//print the title of parent window
		WebDriver parentwindid = driver.switchTo().window(wind1);
		System.out.println(parentwindid);  //alphanumeric id of parent window
		
		//print the current url of child tab
		Thread.sleep(2000);
		driver.switchTo().window(wind2);//alphanumeric id of child window
		Thread.sleep(2000);
		System.out.println("Child Window id : " + wind2); //current url of child tab
		System.out.println(driver.getCurrentUrl()); //current url of child tab
		driver.close();
		
		
		//Step 2 : window or popup handling
		Thread.sleep(2000);
		driver.switchTo().window(wind1);
		jse.executeScript("document.getElementById('tabButton').click()");
		
		//print the title of child window
		Set<String> allwindowId2 = driver.getWindowHandles();
		System.out.println(allwindowId2);
		Iterator<String> abc2 = allwindowId2.iterator();
		String wind3 = abc2.next();
		String wind4 = abc2.next();
		Thread.sleep(2000);
		driver.switchTo().window(wind4);
		Thread.sleep(2000);
		System.out.println("Child Window id  :  "+ wind4); //alphanumeric id of child window
		System.out.println(driver.getTitle()); //give title of child window
		System.out.println(driver.getCurrentUrl()); //give current url of child window
		
		driver.close();  //close parent window as well as all associated window
		System.out.println("window  Popups  and Tabs Handled");
		
		
		
		
		
		
	}

}
