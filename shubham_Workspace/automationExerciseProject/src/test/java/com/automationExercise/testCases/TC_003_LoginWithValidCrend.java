package com.automationExercise.testCases;

import org.testng.annotations.Test;

import com.automationExercise.pageObjects.P_001_HomePage;
import com.automationExercise.pageObjects.P_003_LoginWithValidCredential;

public class TC_003_LoginWithValidCrend extends BaseClass{
	
	@Test
	public void verifyloginWithValid() throws Exception {
		
		P_001_HomePage p1= new P_001_HomePage(driver);
		p1.clkSignBtn();
		
		P_003_LoginWithValidCredential p3= new P_003_LoginWithValidCredential(driver);
		p3.enterEmail(p.getProperty("email"));
		p3.enterPass(p.getProperty("password"));
		p3.clkSignBtn();
		Thread.sleep(3000);
		p3.clkLogout();
	}

}
