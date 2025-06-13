package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SHUBHAM\\\\Downloads\\\\chromedriver-win64 (3)\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/upload-download");
		
		//Single file upload
		driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("D:\\Manual_Testing\\SDET-MTNotes.pdf");
		
		if(driver.findElement(By.xpath("//p[@id='uploadedFilePath']")).getText().equals("C:\\fakepath\\SDET-MTNotes.pdf")) {
			System.out.println("File is Successfully Upload");
		}
		else
		{
			System.out.println("File is not successfully upload");
		}
	}
}
