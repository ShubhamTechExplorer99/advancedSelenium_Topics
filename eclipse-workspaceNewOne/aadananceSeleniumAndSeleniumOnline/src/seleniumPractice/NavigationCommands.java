package seleniumPractice;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHUBHAM\\Downloads\\chromedriver-win64 (5)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		
		/*
		//To set the size of the window
		Dimension d = new Dimension(500, 500);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		*/
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//To delete the cookies
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com/");
		
		//To enter the URL of the webpage
		driver.navigate().to("https://www.naukri.com/");
		
		//To navigate the privious page
		driver.navigate().back();
		
		//To navigate the next page 
		driver.navigate().forward();
		
		//Refresh the current page
		driver.navigate().refresh();
		
		Thread.sleep(4000);
		
		//Close the all windows
		//driver.quit();
		 
		
		
		
		
		
	}

}
