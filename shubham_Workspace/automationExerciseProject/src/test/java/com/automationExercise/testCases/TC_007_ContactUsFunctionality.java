package com.automationExercise.testCases;

import org.testng.annotations.Test;

import com.automationExercise.pageObjects.P_007_ContactUsFunctionality;

public class TC_007_ContactUsFunctionality extends BaseClass{
	
	@Test
	public void verifyContactUs() throws Exception {
		
		P_007_ContactUsFunctionality p7 = new P_007_ContactUsFunctionality(driver);
		
		String filepath="D:\\Selenium QAIdea Notes\\Manual testing handbook (1).pdf";
		
		p7.clkContactUs();
		p7.enterName();
		p7.enterEmail();
		p7.enterSubject();
		p7.enterMsg();
		p7.fileUpload(filepath);
		Thread.sleep(2000);
		p7.clkSubmit();
		p7.acceptAlert();
		
		
		
		
		
	}

}
