package seleniumPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHUBHAM\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers");
		
		//Create list of all companies
		List<WebElement> allCompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		System.out.println("Total Companies  : "+  allCompanies.size());
		
		//Create list of current price
		List<WebElement> currentPrice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("Total prices : "+ currentPrice.size());
		
		String expectedResult="Mansi Finance";
		
		for(int i =0; i<allCompanies.size();i++) {
			if(allCompanies.get(i).getText().equalsIgnoreCase(expectedResult));
			System.out.println(allCompanies.get(i).getText()+ "===" + currentPrice.get(i).getText());
			allCompanies.get(i).click();
			System.out.println(driver.getTitle());
			break;
		}
		
	}

}
