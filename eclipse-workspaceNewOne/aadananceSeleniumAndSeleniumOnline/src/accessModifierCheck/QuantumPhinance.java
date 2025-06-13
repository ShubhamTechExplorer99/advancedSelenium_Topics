package accessModifierCheck;

import java.io.FileWriter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QuantumPhinance {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHUBHAM\\Downloads\\chromedriver-win64 (8)\\chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		  WebDriverWait wait = new WebDriverWait(driver, 15);

	        try {
	            // 1) Go to RBI website
	            driver.get("https://www.rbi.org.in/");
	            driver.manage().window().maximize();

	            // 2) Scroll to bottom and click on "Bank Holidays"
	            JavascriptExecutor js = (JavascriptExecutor) driver;
	            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	            Thread.sleep(3000);
	            WebElement bankHolidays = driver.findElement(By.xpath("(//a[text()='Bank Holidays'])[2]"));
	            Thread.sleep(2000);
	            bankHolidays.click();
	            
	            //WebElement bankHolidaysLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/Scripts/HolidayMatrixDisplay.aspx']")));
	           // bankHolidaysLink.click();
	            Thread.sleep(2000);
	            
	            // Switch to new tab if opened
	            for (String winHandle : driver.getWindowHandles()) {
	                driver.switchTo().window(winHandle);
	            }

	            // 3) Select Regional Office = "Mumbai", Month = "All Months"
	            Select regionSelect = new Select(wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ddlRbiHolidaySearch_Region"))));
	            regionSelect.selectByVisibleText("Mumbai");

	            Select monthSelect = new Select(driver.findElement(By.id("ddlRbiHolidaySearch_Month")));
	            monthSelect.selectByVisibleText("All Months");

	            // 4) Click on GO
	            WebElement goButton = driver.findElement(By.id("btnHolidaySearch"));
	            goButton.click();

	            // 5) Extract table data
	            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("gvHoliday")));

	            List<WebElement> rows = driver.findElements(By.cssSelector("#gvHoliday tr"));
	            FileWriter writer = new FileWriter("holidays.txt");

	            for (int i = 1; i < rows.size(); i++) { // Skip header row
	                List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
	                if (cols.size() >= 3) {
	                    String date = cols.get(0).getText(); // Example: "January 26"
	                    String occasion = cols.get(1).getText();

	                    String[] dateParts = date.split(" ");
	                    String month = dateParts[0].trim();
	                    String day = dateParts.length > 1 ? dateParts[1].replaceAll("[^0-9]", "") : "";

	                    writer.write(month + "," + day + "," + occasion + "\n");
	                }
	            }

	            writer.close();
	            System.out.println("Holiday data saved to holidays.txt");

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            driver.quit();
	        }
	    }

	}


