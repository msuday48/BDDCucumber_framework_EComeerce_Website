package stepsDefinitions;


import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.ShoppingCartPage;

public class View_Cart_Page {

    @Given("the user navigates to the homepage, clicks on the login button with email {string} and password {string} and successfully logs in")
    public void user_successfully_login(String email, String password) {
        BaseClass.getLogger().info("Navigating to Login Page...");
        HomePage hp = new HomePage(BaseClass.getDriver());
        hp.clickMyAccount();
        hp.clickLogin();

        BaseClass.getLogger().info("Entering email and password...");
        LoginPage lp = new LoginPage(BaseClass.getDriver());
        lp.setEmail(email);
        lp.setPassword(password);
        lp.clickLogin();
    }

    @When("the user navigates to the view cart page")
    public void view_cart_page() {
        ShoppingCartPage scp = new ShoppingCartPage(BaseClass.getDriver());
        scp.clickViewCart();
    }

    @Then("the same products added to the cart are displayed")
    public void validate_product_visibility() {
        ShoppingCartPage scp = new ShoppingCartPage(BaseClass.getDriver());
 scp.isProductDisplayed();
    }

    @Then("the product price and checkout button are visible")
    public void validate_price_and_checkout_visibility() {
        ShoppingCartPage scp = new ShoppingCartPage(BaseClass.getDriver());
     scp.isPriceVisible();
     scp.isCheckoutButtonVisible();
    }
}
