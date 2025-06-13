package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage extends BasePage {

	public AddToCartPage(WebDriver driver) {
		super(driver);

	}

	// Loactors

	@FindBy(xpath = "(//a[text()='Cameras'])[1]")
	WebElement btnCamera;

	@FindBy(xpath = "//div[@class='caption']//a[contains(text(),'Nikon D300')]")
	WebElement btnSelectCamera;

	@FindBy(xpath = "//input[@id='input-quantity']")
	WebElement selectQuantity;

	@FindBy(xpath = "//button[@id='button-cart']")
	WebElement btnAddToCart;

	// Actions Methods

	public void clickOnCamera() {
		btnCamera.click();
	}

	public void selectModeol() {
		btnSelectCamera.click();
	}

	public void selectQty() throws InterruptedException {
		selectQuantity.clear();
		Thread.sleep(2000);
		selectQuantity.sendKeys("2");
		Thread.sleep(2000);
	}

	public void clkCart() {
		btnAddToCart.click();
	}

}
