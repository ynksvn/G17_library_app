package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.LoginPage;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef {

    LoginPage loginPage = new LoginPage();

    @Given("librarian is on the login page")
    public void librarian_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("qa2_url"));

    }
    @Then("verify that the title is {string}")
    public void verify_that_the_title_is(String title) {

        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(Driver.getDriver().getTitle().contains(actualTitle));


    }
    @When("librarian enters valid email address and password")
    public void librarian_enters_valid_email_address_and_password() {
        loginPage.emailInput.sendKeys(ConfigurationReader.getProperty("lib22_user"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.getProperty("lib22_pass"));
    }
    @When("librarian clicks sign in button")
    public void librarian_clicks_sign_in_button() {
        loginPage.signinBtn.click();
    }

    @Then("verify that there are {int} models on the page")
    public void verify_that_there_are_models_on_the_page(int dashboard) {
        Assert.assertTrue(loginPage.dashboard.isDisplayed());

    }


}
