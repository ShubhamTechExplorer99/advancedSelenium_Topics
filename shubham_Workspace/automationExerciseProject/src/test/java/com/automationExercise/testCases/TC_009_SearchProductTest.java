package com.automationExercise.testCases;

import org.testng.annotations.Test;

import com.automationExercise.pageObjects.P_009_SearchProduct;

public class TC_009_SearchProductTest extends BaseClass {
	
	@Test
	public void verfityProductIsAdded() throws InterruptedException {
		
		P_009_SearchProduct p9= new P_009_SearchProduct(driver);
		p9.clkProduct();
		p9.enterProductName();
		p9.clkEnterProdt();
		String displayed = p9.productDisplayed();
		
		//System.out.println(displayed);//View Product
		
		String allInfo="View Product";
		
		if(displayed.equals(allInfo)) {
			System.out.println("Matched the product");
			Thread.sleep(2000);
			p9.addToCrt();
		}
		else {
			System.out.println("Mismatched the product");
		}
		
		
	}

}
