package stepsDefinitions;

import factory.BaseClass;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.New_AddressPage;

public class NewAddressPage {

    WebDriver driver;
    New_AddressPage newAddressPage;
    @Given("User logs  in with valiid email {string} and password {string} clicks on My Account and selects My Account")
    public void user_logs_in_with_valid_email_and_password_clicks_on_my_account(String email, String password) {
        driver = BaseClass.getDriver();

        // Login Flow
        HomePage hp = new HomePage(driver);
        hp.clickMyAccount();
        hp.clickLogin();

        LoginPage lp = new LoginPage(driver);
        lp.setEmail(email);
        lp.setPassword(password);
        lp.clickLogin();

        // After login
        newAddressPage = new New_AddressPage(driver);
        newAddressPage.clickMyAccount();
        newAddressPage.selectMyAccount();
    }

    @When("User navigates to Address Book Entries and clicks on the {string} button")
    public void user_navigates_to_address_book_entries_and_clicks_on_button(String buttonText) {
        newAddressPage.navigateToAddressBook();
        newAddressPage.clickNewAddress();
    }



    @Then("User enters {string}, {string}, {string}, {string}, {string}, and {string}")
    public void user_enters_address_details(String firstname, String lastname, String address1, String city, String postcode, String country) {
        newAddressPage.enterfirstname(firstname);
        newAddressPage.enterLastName(lastname);
        newAddressPage.enterAddress1(address1);
        newAddressPage.enterCity(city);
        newAddressPage.enterPostCode(postcode);
        newAddressPage.selectCountry(country);
    }

    @And("User selects {string} from the country dropdown and {string} from the region dropdown")
    public void user_selects_country_and_region(String country, String region) {
        newAddressPage.selectCountry(country); // In case the region list reloads
        newAddressPage.selectRegion(region);
    }

    @And("User clicks on the {string} button")
    public void user_clicks_on_the_button(String buttonText) {
        newAddressPage.clickContinue();
    }
}
