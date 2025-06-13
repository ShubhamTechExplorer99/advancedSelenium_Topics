package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesW3Sceool {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\SHUBHAM\\\\Downloads\\\\chromedriver-win64 (5)\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//to get the tables id using xpath
		WebElement element = driver.findElement(By.xpath("//table[@id='customers']"));
		
		//To get the rows element using tagname
		List<WebElement> tr = driver.findElements(By.tagName("tr"));
		
		//iterating each ros
		for(int i =0;i<tr.size();i++) {
			WebElement rows = tr.get(i);
			
			List<WebElement> th = driver.findElements(By.tagName("th"));
			for(int j=0;j<th.size();j++) {
				WebElement head = th.get(j);
				String text = head.getText();
				System.out.println(text);
			}
		}
	}

}
