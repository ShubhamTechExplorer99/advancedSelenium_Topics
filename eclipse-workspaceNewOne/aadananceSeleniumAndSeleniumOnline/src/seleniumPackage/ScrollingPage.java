package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SHUBHAM\\\\Downloads\\\\chromedriver-win64 (3)\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/register");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//1 - scroll down the page by pixel number
		//js.executeScript("window.scrollBy(0,1500)","");
		//System.out.println(js.executeScript("return window.pageYoffset;"));
		
		//2 - scroll the page till element  is visible
		//WebElement element = driver.findElement(By.xpath("//button[@id=\"register-button\"]"));
		
		//js.executeScript("window.scrollBy(0,1500)",element);
		//System.out.println(js.executeScript("return window.pageYoffset;"));
		
		//3 - scroll page till end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYoffset;"));
		
		
		
		
	}

}
