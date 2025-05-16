package stepsDefinitions;


import factory.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.*;

public class checkoutPage {

    @Given("User logs in and navigates checkout page with {string} and {string}")
    public void user_logs_in_navigate_checkout_page(String email, String pwd) {
        HomePage hp=new HomePage(BaseClass.getDriver());
        hp.clickMyAccount();
        hp.clickLogin();

        LoginPage lp=new LoginPage(BaseClass.getDriver());
        lp.setEmail(email);
        lp.setPassword(pwd);
        lp.clickLogin();

       hp.click_checkout();
    }

    @And("user navigates to checkout page and validates product name price and clicks on checkout button")
    public void user_navigates_checkout_page(){
        ShoppingCartPage sc = new ShoppingCartPage(BaseClass.getDriver());
        Assert.assertTrue(sc.isProductDisplayed());
        Assert.assertTrue(sc.isPriceVisible());
        Assert.assertTrue(sc.isCheckoutButtonVisible());
        sc.click_checkout_button();
    }
    CheckoutPage checkout=new CheckoutPage(BaseClass.getDriver());
    @When("User enters first name as {string} and last name as {string}")
    public void user_enters_first_name_as_and_last_name_as(String firstName, String lastName) {



        checkout.setfirstName(firstName);


        checkout.setlastName(lastName);
    }

    @And("User enters address1 {string} and city {string}")
    public void user_enters_address1_and_city(String address, String city) {
        checkout.setaddress1(address);
        checkout.setcity(city);
    }

    @And("User selects Country as {string}")
    public void user_selects_country_as(String country) {
        checkout.setCountry(country);
    }

    @And("User selects State as {string}")
    public void user_selects_state_as(String state) {
        checkout.setState(state);
    }

    @And("User clicks on continue Billing Address Delivery Address Delivery Method and shipping address")
    public void user_clicks_on_continue_buttons() {
        checkout.clickOnContinueAfterBillingAddress();
        checkout.clickOnContinueAfterDeliveryAddress();
        checkout.setDeliveryMethodComment("Please handle with care");
        checkout.clickOnContinueAfterDeliveryMethod();
    }

    @And("User agrees to terms and conditions and clicks on continue for Payment Method")
    public void user_agrees_terms_and_conditions_and_clicks_continue_payment() {
        checkout.selectTermsAndConditions();
        checkout.clickOnContinueAfterPaymentMethod();
    }

    @Then("Total price should be displayed")
    public void total_price_should_be_displayed() {
        String total = checkout.getTotalPriceBeforeConfOrder();
        Assert.assertNotNull("Total price is not displayed", total);
        System.out.println("Total Price: " + total);
    }

    @When("User clicks on Confirm Order")
    public void user_clicks_on_confirm_order() {
        checkout.clickOnConfirmOrder();
    }

    @Then("Order should be placed successfully")
    public void order_should_be_placed_successfully() throws InterruptedException {
        boolean result = checkout.isOrderPlaced();
        Assert.assertTrue("Order was not placed successfully", result);
    }
}