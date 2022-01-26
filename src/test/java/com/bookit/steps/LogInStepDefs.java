package com.bookit.steps;

import com.bookit.pages.BookItHomePage;
import com.bookit.pages.LoginPage;
import com.bookit.utility.ConfigurationReader;
import com.bookit.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogInStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("bookit_url"));

    }

    @When("I enter username {string} and password {string} and click on sign in button")
    public void i_enter_username_and_password(String userName, String password) {
        loginPage.logIn(userName, password);

    }

    @Then("title should be displayed")
    public void title_should_be_displayed() {
        BookItHomePage bookItHomePage = new BookItHomePage();
        bookItHomePage.isCurrentPage();

    }

    @When("I enter invalid username {string} and password {string} and click on sign in button")
    public void i_enter_invalid_username_and_password(String userName, String password) {

        loginPage.logIn(userName, password);

    }

    @Then("the system should show the error message as {string}")
    public void the_system_should_show_the_error_message_as(String expErrorMsg) {

        String actErrorMsg = loginPage.errorMsg.getText();
        Assert.assertEquals(expErrorMsg, actErrorMsg);


    }


}
