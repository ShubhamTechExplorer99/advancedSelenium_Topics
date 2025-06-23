package com.automationExercise.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationExercise.pageObjects.P_001_HomePage;
import com.automationExercise.pageObjects.P_004_LoginWithInvalidC;

public class TC_004_LoginWithInvalidC extends BaseClass{
	
	@Test
	public void verifyWithInvalidData() throws Exception {
		
		P_001_HomePage p1 =new P_001_HomePage(driver);
		p1.clkSignBtn();
		
		P_004_LoginWithInvalidC p4 =new P_004_LoginWithInvalidC(driver);
		p4.enterEmail(p.getProperty("invalidEmail"));
		p4.enterPass(p.getProperty("invalidPassword"));
		p4.clkSignBtn();
		Thread.sleep(3000);
		
		String expectedError = p4.getErroMsg();
		//System.out.println(actualError);
		String actualError="Your email or password is incorrect!";
		Assert.assertEquals(expectedError, actualError);
		
		
		
	}

}
