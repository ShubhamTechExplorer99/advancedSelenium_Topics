package com.automationExercise.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationExercise.pageObjects.P_008_TestCaseModulePage;

public class TC_008_TestCaseModule extends BaseClass {
	
	@Test
	public void verifyTCDisplayed() {
		
		P_008_TestCaseModulePage p8 = new P_008_TestCaseModulePage(driver);
		p8.clkTc();
		String actualMsg = p8.displayMsg();
		String expected="Below is the list of test Cases for you to practice the Automation. Click on the scenario for detailed Test Steps:";
		
		Assert.assertEquals(actualMsg, expected);
		
		if(expected.equals(expected)) {
			System.out.println("Both are same and TC are passed");
		}
		else {
			System.out.println("TC are failed");
		}
		
		
	}

}
