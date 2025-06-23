package com.automationExercise.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.automationExercise.pageObjects.P_001_HomePage;

public class TC_001_HomePageTest extends BaseClass {
	
	@Test
	public void verifyHomePageDisplayed() {
		
		P_001_HomePage vd = new P_001_HomePage(driver);
		Assert.assertTrue(vd.isHomePageDisplayed(),"Home page is not displayes");
		vd.clkSignBtn();
	}

}
