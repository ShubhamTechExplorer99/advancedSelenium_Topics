package seleniumPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHUBHAM\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("How stuff works");
		
		//Handling Autosuggestion
		List<WebElement> AllSuggestion = driver.findElements(By.xpath("//ul[@role=\"listbox\"]/li"));
		
		
		for(int i =0 ; i<AllSuggestion.size() ; i++) {
			String expResult = "How stuff works science";
			if(AllSuggestion.get(i).getText().equalsIgnoreCase(expResult)) {
				AllSuggestion.get(i).click();
				break;
			}
		}
		
	
	}

}
