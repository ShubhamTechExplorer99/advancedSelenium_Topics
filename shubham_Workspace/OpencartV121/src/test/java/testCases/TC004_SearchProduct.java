package testCases;

import org.testng.annotations.Test;

import pageObjects.SearchProductPage;

public class TC004_SearchProduct extends BaseClass{
	
	@Test
	public void verify_Search_Functionality() throws Exception {
		
		SearchProductPage spage= new SearchProductPage(driver);
		spage.searchItem();
		spage.EnterItemName();
		spage.selectItem();
		spage.selectQuantity();
		spage.clkAddButton();
		Thread.sleep(5000);
		
		TC004_SearchProduct t4 = new TC004_SearchProduct();
		t4.getScreenShot(driver);
		System.out.println("Captured the screenshot in TC_No_004");
		
		
		
		
	}

}
