package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class New_AddressPage extends BasePage {

    public New_AddressPage(WebDriver driver) {
        super(driver);
    }

    // Locators
    @FindBy(xpath = "//a[@title='My Account' and @class='dropdown-toggle']")
    WebElement myAccount;

    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='My Account']")
    WebElement myAccountSelect;

    @FindBy(xpath = "//a[normalize-space()='Address Book']")
    WebElement addressBookEntries;

    @FindBy(xpath = "//a[normalize-space()='New Address']")
    WebElement newAddress;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstName;

    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastName;

    @FindBy(xpath = "//input[@placeholder='Address 1']")
    WebElement address1;

    @FindBy(xpath = "//input[@placeholder='City']")
    WebElement city;

    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement postCode;

    @FindBy(xpath = "//select[@name='country_id']")
    WebElement countryDropdown;

    @FindBy(xpath = "//select[@name='zone_id']")
    WebElement regionDropdown;

    @FindBy(xpath = "//input[@value='Continue']")
    WebElement continueButton;

    // Action Methods

    public void clickMyAccount() {
        myAccount.click();
    }

    public void selectMyAccount() {
        Actions act = new Actions(driver);
        act.moveToElement(myAccountSelect).click().perform();
    }

    public void navigateToAddressBook() {
        addressBookEntries.click();
    }

    public void clickNewAddress() {
        newAddress.click();
    }

    public void enterfirstname(String fname){
        firstName.sendKeys(fname);
    }


    public void enterLastName(String lName) {
        lastName.clear();
        lastName.sendKeys(lName);
    }

    public void enterAddress1(String addr1) {
        address1.clear();
        address1.sendKeys(addr1);
    }

    public void enterCity(String cityName) {
        city.clear();
        city.sendKeys(cityName);
    }

    public void enterPostCode(String code) {
        postCode.clear();
        postCode.sendKeys(code);
    }

    public void selectCountry(String countryName) {
        Select countrySelect = new Select(countryDropdown);
        countrySelect.selectByVisibleText(countryName);
    }

    public void selectRegion(String regionName) {
        Select regionSelect = new Select(regionDropdown);
        regionSelect.selectByVisibleText(regionName);
    }

    public void clickContinue() {
        continueButton.click();
    }

}