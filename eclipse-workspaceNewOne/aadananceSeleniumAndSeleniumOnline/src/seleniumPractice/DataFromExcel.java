package seleniumPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataFromExcel {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\SHUBHAM\\\\Downloads\\\\chromedriver-win64 (5)\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		

		FileInputStream fis = new FileInputStream("C:\\Users\\SHUBHAM\\OneDrive\\Desktop\\datas.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String URL = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String USERNAME = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String Password = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		driver.get(URL);
		
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(Password);
	}

}
