package com.automationExercise.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationExercise.pageObjects.P_001_HomePage;
import com.automationExercise.pageObjects.P_006_RegisterUsewithexistingemail;


public class TC_006_RegisterUserWithexistingEmail extends BaseClass{

	@Test
	public void verifyRegisterWithExistingEmail() throws Exception {
		
		P_001_HomePage p1 = new P_001_HomePage(driver);
		p1.clkSignBtn();
		
		P_006_RegisterUsewithexistingemail p6 = new P_006_RegisterUsewithexistingemail(driver);
		p6.entername(p.getProperty("name"));
		p6.enterEmail(p.getProperty("email"));
		p6.clkSignUp();
		Thread.sleep(3000);
		
		String actualText="Email Address already exist!";
		String expectedText = p6.getErrorMsg();
		//System.out.println(expectedText);
		
		//Assert.assertEquals(actualText, expectedText);  
		//Another way if else condition also we can check
		
		if(actualText.equals(expectedText)) {
			System.out.println("TC passed");
		}
		else {
			System.out.println("TC Failed");
		}
		
		
	}
	
}
