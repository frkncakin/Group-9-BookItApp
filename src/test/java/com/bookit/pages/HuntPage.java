package com.bookit.pages;

import com.bookit.utility.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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





}
