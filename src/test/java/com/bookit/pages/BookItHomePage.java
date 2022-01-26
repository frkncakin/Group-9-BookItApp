package com.bookit.pages;

import com.bookit.utility.Driver;
import org.junit.Assert;

public class BookItHomePage extends BasePage {


    @Override
    public void isCurrentPage() {
        Assert.assertEquals("bookit", Driver.getDriver().getTitle());
    }
}
