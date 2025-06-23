package com.automationExercise.testCases;

import org.testng.annotations.Test;

import com.automationExercise.pageObjects.P_001_HomePage;
import com.automationExercise.pageObjects.P_002_RegisterUserPage;

public class TC_002_RegisterUserTest extends BaseClass {
	
	@Test
	public void verifyRegisterUser() {
		
		P_001_HomePage p1= new P_001_HomePage(driver);
		p1.clkSignBtn();
		
		P_002_RegisterUserPage p2= new P_002_RegisterUserPage(driver);
		
		p2.enterName(randomString().toUpperCase());
		p2.enterEmail(randomString() + "@gmail.com");
		p2.clkSigninBtn();
		
		p2.btnTitle();
		
		p2.enterPassword(randomAlphaNumeric());
		//p2.selectNewsLetter();  
		p2.enterFirstName(randomString().toUpperCase());
		p2.enterLastName(randomString().toUpperCase());
		p2.enterAddress1();
		p2.enterState();
		p2.enterCity();
		p2.enterZipCode();
		p2.enterMobileNo();
		p2.createAccBtn();
		p2.continueBtnclk();
		p2.deleteAccount();
		p2.continueAfterDeletBtn();
		
		
		
		
		
		
	}

}
