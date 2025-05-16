package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {

	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[@title='Shopping Cart']//i[@class='fa fa-shopping-cart']")
	WebElement shoppingCartIcon;

	@FindBy(xpath = "//td[@class='text-start text-wrap']//a[contains(text(),'Samsung SyncMaster 941BW')]") // Sample product in cart
	WebElement addedProduct;

	@FindBy(xpath = "//tfoot//td[@class='text-end'][normalize-space()='$242.00']") // Sample price
	WebElement lblTotalPrice;

	@FindBy(xpath = "//a[@class='btn btn-primary']")
	WebElement btnCheckout;

	public void clickViewCart() {
		shoppingCartIcon.click();
	}


	public boolean isProductDisplayed() {
	return addedProduct.isDisplayed();
	}
	public boolean isPriceVisible() {
		return lblTotalPrice.isDisplayed();
	}

	public boolean isCheckoutButtonVisible() {
		return btnCheckout.isDisplayed();
	}

	public void click_checkout_button(){
		btnCheckout.click();
	}
}
