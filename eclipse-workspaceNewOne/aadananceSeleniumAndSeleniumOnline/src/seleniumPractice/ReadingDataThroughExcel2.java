package seleniumPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataThroughExcel2 {

	public static void main(String[] args) throws Exception {

		// Load file
		FileInputStream file = new FileInputStream(
				"C:\\Users\\SHUBHAM\\eclipse-workspaceNewOne\\aadananceSeleniumAndSeleniumOnline\\TestData\\DDD_Datas.xlsx");

		// Load Workbook
		XSSFWorkbook workbook = new XSSFWorkbook(file);

		// Load sheet
		XSSFSheet sh = workbook.getSheet("Sheet1");

		// Print the loaded sheet name
		System.out.println(sh.getSheetName());

		// Print the data from excel sheet
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());

		// Print the Float/double from excel sheet
		System.out.println(sh.getRow(6).getCell(1).getNumericCellValue());

		// Print the int from excel sheet
		System.out.println((int)sh.getRow(6).getCell(1).getNumericCellValue());

		// Print total number of rows
		System.out.println("Total rows : " + sh.getPhysicalNumberOfRows());

	}

}
