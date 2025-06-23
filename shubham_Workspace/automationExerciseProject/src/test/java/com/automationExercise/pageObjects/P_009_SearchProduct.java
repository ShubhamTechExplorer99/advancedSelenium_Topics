package com.automationExercise.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P_009_SearchProduct extends BasePage{

	//Constructor
	public P_009_SearchProduct(WebDriver driver) {
		super(driver);
		
	}
	
	//Locators
	@FindBy(xpath = "//a[@href='/products']")
	WebElement btnProduct;
	
	@FindBy(xpath = "//input[@id='search_product']")
	WebElement btnSearchProduct;
	
	@FindBy(xpath = "//button[@id='submit_search']")
	WebElement btnEnterSearch;
	
	@FindBy(xpath = "//a[normalize-space()='View Product']")
	WebElement prdInfo;
	
	@FindBy(xpath = "//a[normalize-space()='View Product']")
	WebElement prdAddToCart;
	
	//Actions Methods
	
	public void clkProduct() {
		btnProduct.click();
	}
	
	public void enterProductName() {
		btnSearchProduct.sendKeys("Men Tshirt");
	}
	
	public void clkEnterProdt() {
		btnEnterSearch.click();
	}
	
	public String productDisplayed() {
		return prdInfo.getText();//View Product
		 
	}
	
	public void addToCrt() {
		prdAddToCart.click();
	}
	
	
	

}
