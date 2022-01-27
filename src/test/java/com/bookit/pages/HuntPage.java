package com.bookit.pages;

import com.bookit.utility.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Collections;
import java.util.List;

public class HuntPage extends BasePage {

    @Override
    public void isCurrentPage() {
        Assert.assertEquals("hunt for spot", huntTitle.getText());
    }

    @FindBy(tagName = "h1")
    public WebElement huntTitle;

    @FindBy(xpath = "//a[@href='/hunt']")
    public WebElement huntButton;

    @FindBy(xpath = "//button[@aria-label='Open calendar']")
    public WebElement calendarBtn;

    @FindBy(xpath = "//mat-select[@aria-label='from']")
    public WebElement startingTime;

    @FindBy(xpath = "//mat-select[@aria-label='to']")
    public WebElement finishTime;

    @FindBy(xpath = "//button[@class='mat-button']")
    public WebElement searchButton;

    @FindBy(xpath = "//div[@class='column is-one-third ng-star-inserted']")
    public List<WebElement> freeSpots;

    @FindBy(xpath = "//button[@class='button is-transparent is-white']")
    public WebElement bookBtn;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement confirmBTn;

    @FindBy(xpath = "//h1[.='yey, you got it']")
    public WebElement successMessage;

    public void selectDate(int num) {
        calendarBtn.click();
        Driver.getDriver().findElement(By.xpath("//div[contains(text(),'" + num + "')]")).click();
    }

    public void selectStartTime(String startTime) {
        startingTime.click();
        Driver.getDriver().findElement(By.xpath("//span[contains(text(),'" + startTime + "')]")).click();
    }

    public void selectFinishTime(String endTime) {
        finishTime.click();
        Driver.getDriver().findElement(By.xpath("//span[contains(text(),'" + endTime + "')]")).click();
    }



    public int countFreeSpots() {
        int spotCount = 0;
        for (int i = 0; i < freeSpots.size(); i++) {
            spotCount ++;
        }
        return spotCount;
    }


}
