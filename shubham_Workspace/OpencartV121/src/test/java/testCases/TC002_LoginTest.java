package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class TC002_LoginTest extends BaseClass {
	
	@Test
	public void verifyLogin() {
		
		try
		{
		//HomePage
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		//LoginPag
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clkLogin();
		
		//MyAccountPage
		MyAccountPage mp = new MyAccountPage(driver);
		boolean targetPage = mp.isMyAccountPageExists();
		
		//Assert.assertEquals(targetPage, true,"LoginFailed");
		Assert.assertTrue(targetPage);
		}
		catch (Exception e) {
			Assert.fail();
		}
	}
	
	

}
