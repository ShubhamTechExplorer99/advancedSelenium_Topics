package com.automationExercise.testCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.Status;

import utilities.MyScreenRecorder;

public class BaseClass {
	
	public WebDriver driver;
	public Properties p;
	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	
	//For record the execution
	
	@BeforeSuite
    public void bruteforce() throws Exception {
        MyScreenRecorder.startRecording("LOGIN.TEST");
    }
	
	@BeforeClass
	@Parameters({ "os", "browser" }) // Retrive data from xml file

	public void setUp(String os, String br) throws Exception {

		// Loading config.properties file

		FileInputStream fis = new FileInputStream("./src/test/resources//config.properties");
		p = new Properties();
		p.load(fis);

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHUBHAM\\Downloads\\chromedriver-win64 (6)\\chromedriver-win64/chromedriver.exe");
		
		

		switch (br.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Invalid browser name ");
			return;
		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(p.getProperty("appURL")); // Reading url from properties file
	}

	@AfterClass(enabled = false)
	public void tearDown() {
		driver.close();
	}
	
	
	//To stop the recording 
	@AfterSuite
    public void afterSuite() throws Exception {
        MyScreenRecorder.stopRecording();

    }
	
	 

	// Get the random data

	public String randomString() {
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return generatedString;

	}

	public String randomNumber() {
		String generatedNumber = RandomStringUtils.randomNumeric(10);
		return generatedNumber;

	}

	public String randomAlphaNumeric() {
		String generatedString = RandomStringUtils.randomAlphabetic(4);
		String generatedNumber = RandomStringUtils.randomNumeric(4);
		return (generatedString + "@" + generatedNumber);

	}

	public void getScreenShot(WebDriver driver) throws Exception {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\Users\\SHUBHAM\\shubham_Workspace\\automationExerciseProject\\screenshots\\AllTC.png");
		FileUtils.copyFile(source, destFile);

	}
	
	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
		File targetFile=new File(targetFilePath);
		
		sourceFile.renameTo(targetFile);
			
		return targetFilePath;

	}

	

	
	
	
	
	
	
	

}
