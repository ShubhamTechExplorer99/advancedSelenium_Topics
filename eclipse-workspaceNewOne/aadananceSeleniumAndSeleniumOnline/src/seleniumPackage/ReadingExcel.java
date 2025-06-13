package seleniumPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingExcel {

	public static void main(String[] args) throws Exception {

		// Specify the location of excel file
		File src = new File("C:\\Users\\SHUBHAM\\OneDrive\\Desktop\\datas.xlsx");

		// Load the file
		FileInputStream fis = new FileInputStream(src);

		// Load workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		// Load Worksheet
		XSSFSheet sh = wb.getSheet("Sheet1");

		// Print the loaded sheet name
		System.out.println(sh.getSheetName());

		// Print URL from Excel sheet
		System.out.println(sh.getRow(1).getCell(0).getStringCellValue());

		// Print USERNAME from Excel sheet
		System.out.println(sh.getRow(1).getCell(1).getStringCellValue());

		// Print Float/double value in the Excel sheet
		// System.out.println(sh.getRow(0).getCell(1).getNumericCellValue());

		// Print Int from Excel sheet
		// System.out.println((int)sh.getRow(1).getCell(1).getNumericCellValue());

		// Print total number of row in the Excel sheet - 1st way
		System.out.println("Total Rows : " + sh.getPhysicalNumberOfRows());

		// Print total number of row in the Excel sheet - 2nd way
		System.out.println("Total Rows : " + (sh.getLastRowNum() + 1));

		// Print total number of columns in the Excel sheet - 1st way
		System.out.println("Total Columns : " + sh.getRow(1).getPhysicalNumberOfCells());

		// Print total number of columns in the Excel sheet - 2nd way
		System.out.println("Total columns : " + sh.getRow(1).getLastCellNum());
		
		//Real Time Implementation
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHUBHAM\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String URL = sh.getRow(1).getCell(0).getStringCellValue();
		System.out.println("Get Excel sheet URL :  " + URL);
		driver.get(URL);
		
		//Enter username From Excel sheet
		String username = sh.getRow(1).getCell(1).getStringCellValue();
		System.out.println("Get Excel sheet username : " + username);
		String pass = sh.getRow(1).getCell(2).getStringCellValue();
		System.out.println("Get Excel sheet pass: " + pass);
		
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(pass);
		
	}

}
