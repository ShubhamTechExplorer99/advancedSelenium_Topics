package pageObjects;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchProductPage extends BasePage {

	public SearchProductPage(WebDriver driver) {
		super(driver);

	}

	// Locators
	@FindBy(xpath = "//input[@placeholder='Search']")
	WebElement searchTest;

	@FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
	WebElement btnSearch;

	@FindBy(xpath = "//a[normalize-space()='iMac']")
	WebElement selectProduct;

	@FindBy(xpath = "//input[@id='input-quantity']")
	WebElement enterQty;

	@FindBy(xpath = "//button[@id='button-cart']")
	WebElement btnAddToCart;

	// Actions
	public void searchItem() {
		searchTest.sendKeys("iMac");
	}

	public void EnterItemName() {
		btnSearch.click();
	}

	public void selectItem() {
		selectProduct.click();
	}

	public void selectQuantity() throws Exception {
		enterQty.clear();
		enterQty.sendKeys("3");
		Thread.sleep(3000);
	}

	public void clkAddButton() {
		btnAddToCart.click();
	}

}
