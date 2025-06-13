package testNG;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;


public class TakeScreenshotOnFailure1 {

	
	WebDriver driver;

	// ITestResult will provide us the test execution status and test name
	public void captureScreenshot(ITestResult result) throws Exception {

		if (ITestResult.FAILURE == result.getStatus()) {

			// create ref of TakeScreenshot Interface and type casting
			TakesScreenshot ts = (TakesScreenshot) driver;

			// Use getScreenshotAs() to capture the screenshot in the file format
			// getScreenshotAs() method return type = FILE
			File sourceFile = ts.getScreenshotAs(OutputType.FILE);
			
			//copy the file to specific location
			File destFolder = new File("./screenshot/" +  result.getName() + ".png");
			
			//error getting
			FileUtils.copyFile(sourceFile , destFolder);
			
			System.out.println(result.getName() + "method() failed ,screenshot captured");
			
			
			

		}
	}

}
