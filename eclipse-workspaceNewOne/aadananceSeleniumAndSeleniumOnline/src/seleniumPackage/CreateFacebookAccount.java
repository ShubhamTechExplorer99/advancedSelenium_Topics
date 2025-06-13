package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFacebookAccount {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHUBHAM\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Shubhz's");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Jadhav");
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("9421954242");
		driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("shubh@123");
		
		//All DropDowns
		
		WebElement day = driver.findElement(By.xpath("//select[@title=\"Day\"]"));
		Select s = new Select(day);
		s.selectByValue("7");
		
		WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select s1 = new Select(month);
		s1.selectByValue("9");
		
		WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		year.sendKeys("1995");
		Thread.sleep(2000);
		
		//Radio Buttons
		
		WebElement maleRadio = driver.findElement( By.xpath("//input[@value=\"2\"]"));
		maleRadio.click();
		System.out.println("Male Button is selected : " + maleRadio.isSelected());//True
		
		WebElement signInButton = driver.findElement( By.xpath("//button[text()='Sign Up'][1]"));
		System.out.println("Button is Enabled : " + signInButton.isEnabled());//True
		signInButton.click();
		
		driver.close();
		
		
		
		
		
		
		
		
	}

}
