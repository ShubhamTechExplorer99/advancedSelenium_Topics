package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.LogoutPage;

public class TC006_LogoutTest extends BaseClass {

	@Test
	public void verifyLogout() throws InterruptedException {

		HomePage hm = new HomePage(driver);
		hm.clickMyAccount();
		hm.clickLogin();
		Thread.sleep(2000);

		// LoginPag
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clkLogin();

		Thread.sleep(4000);
		
		LogoutPage lo = new LogoutPage(driver);
		lo.clkMyAccount();
		Thread.sleep(2000);
		lo.clkLogout();
	}

}
