package seleniumPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import okio.Timeout;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws Exception {

		// Specify the location of config property file
		File src1 = new File(
				"C:\\Users\\SHUBHAM\\eclipse-workspaceNewOne\\aadananceSeleniumAndSeleniumOnline\\Repository\\config.properties");

		// Create fileInpurStream class object to load the file
		FileInputStream fis = new FileInputStream(src1);

		// Create properties class object to read properties file
		Properties pro1 = new Properties();
		pro1.load(fis);

		// ===========================================================================================

		// Specify the location of locators property file
		File src2 = new File(
				"C:\\Users\\SHUBHAM\\eclipse-workspaceNewOne\\aadananceSeleniumAndSeleniumOnline\\Repository\\locators.properties");

		// Create fileInpurStream class object to load the file
		FileInputStream fis2 = new FileInputStream(src2);

		// Create properties class object to read properties file
		Properties pro2 = new Properties();
		pro2.load(fis2);

		// ===========================================================================================

		// Specify the location of testdata property file
		File src3 = new File(
				"C:\\Users\\SHUBHAM\\eclipse-workspaceNewOne\\aadananceSeleniumAndSeleniumOnline\\Repository\\testdata.properties");

		// Create fileInpurStream class object to load the file
		FileInputStream fis3 = new FileInputStream(src3);

		// Create properties class object to read properties file
		Properties pro3 = new Properties();
		pro3.load(fis3);

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHUBHAM\\Downloads\\chromedriver-win64 (5)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get(pro1.getProperty("URL_1"));

		// getProperty() methods will accept key and return the value of that key
		driver.findElement(By.xpath(pro2.getProperty("Email"))).sendKeys(pro3.getProperty("TestData1"));

		driver.findElement(By.xpath(pro2.getProperty("Password"))).sendKeys(pro3.getProperty("TestData2"));

		Thread.sleep(3000);

		driver.close();

	}

}
