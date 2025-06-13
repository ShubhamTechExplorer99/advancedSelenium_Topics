package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginThroughExcelPage;

public class TC005_LoginThroghExcel extends BaseClass{

	public WebDriver driver;
	
	@Test(dataProvider = "OpencartExcel",dataProviderClass = BaseClass.class)
	public void openCrtLogin(String Username,String Pass) {
		
		/*
		// HomePage
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		
		
		LoginThroughExcelPage pag = new LoginThroughExcelPage(driver);
		pag.setEmail(Username);
		pag.setPassword(Pass);
		pag.clkLogin();
		
		*/
		
		
		
		/*
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(Username);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(Pass);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		*/
	}
}
