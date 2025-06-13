package testCases;

import org.testng.annotations.Test;

import pageObjects.AddToCartPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class TC003_AddToCart extends BaseClass {

	@Test
	public void verifyAddToCart_Functionality() throws Exception {

		// HomePage
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();

		// LoginPag
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clkLogin();

		//AddToCart
		AddToCartPage atc = new AddToCartPage(driver);
		atc.clickOnCamera();
		atc.selectModeol();
		atc.selectQty();
		atc.clkCart();

	}

}
