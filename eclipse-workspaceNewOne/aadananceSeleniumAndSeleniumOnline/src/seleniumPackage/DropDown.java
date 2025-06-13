package seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\\\\\Users\\\\\\\\SHUBHAM\\\\\\\\Downloads\\\\\\\\chromedriver-win64 (5)\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Sign up for Facebook']")).click();
		Thread.sleep(2000);
		
		//1st way
		List<WebElement> BirthMonth = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("Total Number of Month : "+ BirthMonth.size());
		BirthMonth.get(3).click();//April -Index always start with o
		Thread.sleep(2000);
		BirthMonth.get(8).click();//Sept
		
		//2nd Way
		WebElement bm = driver.findElement(By.xpath("//select[@id='month']"));
		Select  month = new Select(bm);
		Thread.sleep(2000);
		month.selectByVisibleText("Apr");//April
		Thread.sleep(2000);
		month.selectByValue("12");//Dec
		Thread.sleep(2000);
		month.selectByIndex(7);//Aug
		System.out.println(month.getFirstSelectedOption().getText());//Aug-Current selected value
		
		//3rd Way
		List<WebElement> dropdown = month.getOptions();
		System.out.println(dropdown.size());
		for(int i = 0;i<dropdown.size(); i++) {
			if(dropdown.get(i).getText().equalsIgnoreCase("Sept")) {
				dropdown.get(i).click();
			}
		}
		
		//4th Way
		Thread.sleep(2000);
		WebElement bm1 = driver.findElement(By.xpath("//select[@id='month']"));
		bm1.sendKeys("Jun");
		
		//5th Way
		Thread.sleep(2000);
		driver.findElement(By.id("month")).sendKeys("Mar");
		
		//Check if dropdown support multi section
		System.out.println(month.isMultiple());//False
		month.selectByVisibleText("Apr");
		month.selectByValue("12");//Dec
		month.selectByIndex(7);//Aug
		
		//Deselect  the multi selected  value from dropdown
		Thread.sleep(2000);
		month.deselectByVisibleText("Apr");//Apr
		month.deselectByVisibleText("12");//Dec
		month.deselectByIndex(7);//Aug
		month.deselectAll();
		
		
		
		
		
		
		
		
		
	}

}
