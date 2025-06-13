package seleniumPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingDataThroughExcel {
	
	public static void main(String[] args) throws Exception {
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\SHUBHAM\\eclipse-workspaceNewOne\\aadananceSeleniumAndSeleniumOnline\\TestData\\DDD_Datas.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int totalRows = sheet.getLastRowNum();
		
		short totalCells = sheet.getRow(1).getFirstCellNum();
		
		System.out.println(totalRows);
		System.out.println(totalCells);
		
		for(int r =0;r<totalRows;r++) {
			XSSFRow CurrentRow = sheet.getRow(r);
			
			for(int c=0;c<totalCells;c++) {
				XSSFCell cell = CurrentRow.getCell(c);
				System.out.println(cell.toString() + "\t");
			}
			
			System.out.println();
		}
	}
	

}
