package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\SHUBHAM\\\\Downloads\\\\chromedriver-win64 (5)\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/upload?utm_source=chatgpt.com");
		
		driver.findElement(By.id("fileInput")).sendKeys("C:\\\\Users\\\\SHUBHAM\\\\OneDrive\\\\Desktop\\\\Resumes\\\\Resume.pdf");
		
		System.out.println("Upload file successfully");
				
		
	}

}
