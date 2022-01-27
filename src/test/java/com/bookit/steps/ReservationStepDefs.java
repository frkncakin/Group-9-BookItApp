package com.bookit.steps;

import com.bookit.pages.HuntPage;
import com.bookit.utility.BrowserUtil;
import com.bookit.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ReservationStepDefs {

    HuntPage huntPage = new HuntPage();

    @Given("I am on the hunt page")
    public void i_am_on_the_hunt_page() {
        huntPage.huntButton.click();
        huntPage.isCurrentPage();
    }

    @When("I select date, time and click on search button")
    public void i_select_date_time_and_click_on_search_button() {
        huntPage.selectDate(30);
        huntPage.selectStartTime("9:30am");
        BrowserUtil.waitFor(2);
        huntPage.selectFinishTime("11:00am");
        huntPage.searchButton.click();
    }

    @Then("Free spots should be displayed")
    public void free_spots_should_be_displayed() {
        System.out.println("huntPage.countFreeSpots() = " + huntPage.countFreeSpots());
        Assert.assertTrue(huntPage.countFreeSpots() > 0);

    }

    @When("I click on book button on selected spot and confirm")
    public void i_click_on_book_button_on_selected_spot_and_confirm() {
        huntPage.freeSpots.get(0);
        huntPage.bookBtn.click();
        huntPage.confirmBTn.click();

    }

    @Then("Success message should be displayed")
    public void success_message_should_be_displayed() {
        System.out.println("Message = " + huntPage.successMessage.getText());
        Assert.assertEquals("yey, you got it",huntPage.successMessage.getText());
    }


}
