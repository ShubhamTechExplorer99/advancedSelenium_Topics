package com.automationExercise.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P_010_AddToCartPage extends BasePage{

	//Constructor
	public P_010_AddToCartPage(WebDriver driver) {
		super(driver);
		
	}
	
	//Locators
	@FindBy(xpath = "//a[@href='/products']")
	WebElement btnProduct;
	
	@FindBy(xpath = "//input[@id='search_product']")
	WebElement searchProct;
	
	@FindBy(xpath = "//button[@id='submit_search']")
	WebElement submitProduct;
	
	@FindBy(xpath = "//a[normalize-space()='View Product']")
	WebElement btnViewToCart;
	
	@FindBy(xpath = "//button[normalize-space()='Add to cart']")
	WebElement btnAddToCart;
	
	@FindBy(xpath = "//button[normalize-space()='Continue Shopping']")
	WebElement btnContinueShopping;
	
	//Actions Methods
	
	public void clkProduct() {
		btnProduct.click();
	}
	
	public void enterProductName() {
		searchProct.sendKeys("Men Tshirt");
	}
	
	public void clkSubmitProductBtn() {
		submitProduct.click();
	}
	
	public void clkViewProduct() {
		btnViewToCart.click();
	}
	
	public void clkAddToCart() {
		btnAddToCart.click();
	}
	
	public void clkContShopping() {
		btnContinueShopping.click();
	}

}
