package com.automationExercise.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationExercise.pageObjects.P_001_HomePage;
import com.automationExercise.pageObjects.P_003_LoginWithValidCredential;
import com.automationExercise.pageObjects.P_005_LogoutApplication;

public class TC_005_LogoutApplication extends BaseClass {
	
	@Test
	public void verifyLogout() {
		
		P_001_HomePage p1 = new P_001_HomePage(driver);
		p1.clkSignBtn();
		
		P_003_LoginWithValidCredential p3 = new P_003_LoginWithValidCredential(driver);
		p3.enterEmail(p.getProperty("email"));
		p3.enterPass(p.getProperty("password"));
		p3.clkSignBtn();
		
		P_005_LogoutApplication p5 = new P_005_LogoutApplication(driver);
		p5.clkLogout();
		
		String expectedText = p5.getHomePageText();
		String actalText="Login to your account";
		Assert.assertEquals(actalText, expectedText);
		System.out.println("Application is Successfully logout");
		
		
		
	}

}
