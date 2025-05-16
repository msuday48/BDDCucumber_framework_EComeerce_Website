package stepsDefinitions;
import factory.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SearchPage;

public class Mac_Product_page {
//
    @Given("the user navigates to the homepage, clicks on the My Account page, and successfully logs {string} {string} in")
    public void user_logs_in(String email, String pwd) {
        BaseClass.getLogger().info("Navigating to Login Page...");
        HomePage hp = new HomePage(BaseClass.getDriver());
        hp.clickMyAccount();
        hp.clickLogin();

        BaseClass.getLogger().info("Entering email and password...");
        LoginPage lp = new LoginPage(BaseClass.getDriver());
        lp.setEmail(email);
        lp.setPassword(pwd);
        lp.clickLogin();
        BaseClass.getLogger().info("Clicked on login button...");
    }

    @When("the user clicks on the search bar, enters the product name {string} and clicks on the search icon")
    public void user_searches_product(String pName) {
        HomePage hp = new HomePage(BaseClass.getDriver());
        BaseClass.getLogger().info("User clicks on search bar...");
        hp.clickSearch();
        BaseClass.getLogger().info("User enters product name in search bar...");
        hp.enterProductName(pName);
        hp.clickSearch();
    }

    @And("the searched product {string} is displayed")
    public void verify_product_displayed(String expectedProductName) {
        SearchPage sp = new SearchPage(BaseClass.getDriver());
        sp.isProductExist(expectedProductName);
    }

    @Then("the user enters the quantity {string} of the product and clicks on the Add to Cart button")
    public void user_adds_product_to_cart(String qty) {
        SearchPage sp = new SearchPage(BaseClass.getDriver());
        sp.setQuantity(qty);
        sp.addToCart();
    }
}
