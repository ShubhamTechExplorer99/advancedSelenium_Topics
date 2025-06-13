package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.NewAccountRegistrationPage;

public class TC_001_AccountRegistrationTest extends BaseClass {
	
	@Test
	public void verifyAccpuntRegistrer() {
		
		HomePage nhp = new HomePage(driver);
		nhp.clickMyAccount();
		nhp.clickRegister();
		
		NewAccountRegistrationPage regPage = new NewAccountRegistrationPage(driver);
		regPage.setFirstName(randomString().toUpperCase());
		regPage.setLastName(randomString().toUpperCase());
		regPage.setEmail(randomString() + "@gmail.com"); // randomly generated the email
		regPage.setTelephone(randomNumber());

		String password = randomAlphaNumeric(); // Same password in both the field

		regPage.setPassword(password);
		regPage.setConfirmePassword(password);
		regPage.setPrivacy();
		regPage.setContinue();

		String confirmmsg = regPage.getConfirmationMsg();

		Assert.assertEquals(confirmmsg, "Your Account Has Been Created!");
	}

}
