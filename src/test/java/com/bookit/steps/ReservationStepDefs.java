package com.bookit.steps;

import com.bookit.pages.HuntPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReservationStepDefs {

    HuntPage huntPage = new HuntPage();

    @Given("I am on the hunt page")
    public void i_am_on_the_hunt_page() {
        huntPage.huntButton.click();
        huntPage.isCurrentPage();
    }

    @When("I select date, time and click on search button")
    public void i_select_date_time_and_click_on_search_button() {

    }

    @Then("Free spots should be displayed")
    public void free_spots_should_be_displayed() {

    }

    @When("I click on book button on selected spot and confirm")
    public void i_click_on_book_button_on_selected_spot_and_confirm() {

    }

    @Then("Success message should be displayed")
    public void success_message_should_be_displayed() {

    }


}
