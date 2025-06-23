package com.automationExercise.testCases;

import org.testng.annotations.Test;

import com.automationExercise.pageObjects.P_010_AddToCartPage;

public class TC_010_AddToCartTest extends BaseClass {
	
	@Test
	public void veriftProductIsAddedOrNoy() throws Exception {
		
		P_010_AddToCartPage p10 = new P_010_AddToCartPage(driver);
		p10.clkProduct();
		p10.enterProductName();
		p10.clkSubmitProductBtn();
		Thread.sleep(1000);
		p10.clkViewProduct();
		Thread.sleep(1000);
		p10.clkAddToCart();
		Thread.sleep(1000);
		p10.clkContShopping();
		
		
	}

}
