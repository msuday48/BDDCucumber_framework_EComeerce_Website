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
        BaseClass.getLogger().info("Goto my account-->Click on Login.. ");
        HomePage hp = new HomePage(BaseClass.getDriver());
        hp.clickMyAccount();
        hp.clickLogin();
    }

 @And("User enters valid username and password and clicks on login button")
 public  void user_enters_valid_credentials_clicksLogin_button(String email, String pwd){
        //Login credentilas
        BaseClass.getLogger().info("Entering email and password.. ");

        LoginPage   lp=new LoginPage(BaseClass.getDriver());
        lp.setEmail(email);
        lp.setPassword(pwd);
        lp.clickLogin();
        BaseClass.getLogger().info("clicked on login button...");
    }

    @When("Home page is displayed  user clicks on the search bar enters valid product name clicks on search icon")
    public void user_navigates_homepage_clicks_serach_bar(){



    }


    @Then("user serached product page is displayed")
    public void product_serach_page_is_opened(){

    }

}
