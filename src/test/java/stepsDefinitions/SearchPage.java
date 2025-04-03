package stepsDefinitions;

import factory.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class SearchPage {

    @Given("the user navigates to the login page")
    public void user_navigates_login_page() {
        BaseClass.getLogger().info("Navigating to Login Page...");
        HomePage hp = new HomePage(BaseClass.getDriver());
        hp.clickMyAccount();
        hp.clickLogin();
    }

    @And("User enters valid email as {string} and password as {string} and clicks on the login button")
    public void user_enters_valid_credentials_clicksLogin_button(String email, String pwd) {
        BaseClass.getLogger().info("Entering email and password...");
        LoginPage lp = new LoginPage(BaseClass.getDriver());
        lp.setEmail(email);
        lp.setPassword(pwd);
        lp.clickLogin();
        BaseClass.getLogger().info("Clicked on login button...");
    }

    @When("Home page is displayed, the user clicks on the search bar, enters a valid {string} name, and clicks on the search icon")
    public void user_navigates_homepage_clicks_search_bar(String pName) {
        HomePage hp = new HomePage(BaseClass.getDriver());
        BaseClass.getLogger().info("User clicks on search bar...");
        hp.clickSearch();
        BaseClass.getLogger().info("User enters product name in search bar...");
        hp.enterProductName(pName);
        hp.clickSearch();
    }

    @Then("the user should see the searched product page")
    public void product_search_page_is_opened() {
        BaseClass.getLogger().info("Product search page is displayed...");
        // You can add validation logic here, such as checking the page title or product list
    }
}
