package testCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.LogManager;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.apache.logging.log4j.Logger;
import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;

public class BaseClass {

	public WebDriver driver;
	public Properties p;
	public static FileInputStream fis;
	public static XSSFWorkbook wb;

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

	@AfterClass
	public void tearDown() {
		driver.close();
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
		File destFile = new File("C:\\Users\\SHUBHAM\\shubham_Workspace\\OpencartV121\\screenshots\\AllTC.png");
		FileUtils.copyFile(source, destFile);

	}

	// Provide the data through excel

	@DataProvider(name = "OpencartExcel")
	public void readDataFromExcel() throws Exception {

	}

	// Reading Excel data

	public void readExcelData(String sheetName, int row, int colm) throws Exception {
		File src = new File(
				"C:\\Users\\SHUBHAM\\shubham_Workspace\\OpencartV121\\src\\test\\resources\\OpenCartV121.xlsx");
		fis = new FileInputStream(src);

		Workbook wb = WorkbookFactory.create(fis);
		String username = wb.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		System.out.println(username);

		String password = wb.getSheet("Sheet1").getRow(2).getCell(2).getStringCellValue();

	}

}
