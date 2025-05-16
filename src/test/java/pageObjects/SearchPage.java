package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

	WebDriver driver;

	public SearchPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[normalize-space()='MacBook']")
	WebElement Mac_Product;

	@FindBy(xpath = "//input[@name='quantity']")
	WebElement txtquantity;

	@FindBy(xpath = "(//button[normalize-space()='Add to Cart'])[1]")
	WebElement btnaddToCart;

	@FindBy(xpath = "//div[contains(text(),'Success: You have added')]")
	WebElement cnfMsg;

	public boolean isProductExist(String expectedProductName) {
		String actualProductName = Mac_Product.getText();

		// Assertion to ensure the product name matches
		Assert.assertEquals("Product name does not match!", expectedProductName, actualProductName);

		// Click on the product
		Mac_Product.click();

		return true;
	}

	public void setQuantity(String qty) {
		txtquantity.clear();
		txtquantity.sendKeys(qty);
	}

	public void addToCart() {
		btnaddToCart.click();
	}

	public boolean isConfirmationMessageDisplayed() {
		return cnfMsg.isDisplayed();
	}
}
