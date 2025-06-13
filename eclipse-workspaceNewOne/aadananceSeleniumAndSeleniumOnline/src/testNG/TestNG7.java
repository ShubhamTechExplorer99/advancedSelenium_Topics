package testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG7 {

	// Used Data provider annotation

	WebDriver driver;

	@BeforeClass
	public void setEnv() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHUBHAM\\Downloads\\chromedriver-win64 (5)\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/login/");

	}

	@DataProvider
	public Object[][] dataSet() throws Exception {
		// Specify the location of property file
		File src1 = new File(
				"C:\\Users\\SHUBHAM\\eclipse-workspaceNewOne\\aadananceSeleniumAndSeleniumOnline\\Repository\\testdata.properties");

		FileInputStream fis1 = new FileInputStream(src1);
		Properties pro1 = new Properties();
		pro1.load(fis1);

		Object arr[][] = new Object[3][2];
		arr[0][0] = pro1.getProperty("TestData1");
		arr[0][1] = pro1.getProperty("TestData2");

//		arr[1][0] = "TestData2";
//		arr[1][1] = "TestData2";
//
//		arr[2][0] = "TestData3";
//		arr[2][2] = "TestData3";

		return arr;

	}

	@Test(dataProvider = "dataSet")
	public void enterData(String username, String password) throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.id("email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(2000);

	}

}
