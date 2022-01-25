package com.bookit.pages;

import com.bookit.utility.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage () {
        PageFactory.initElements(Driver.getDriver(), this);



    }

    public abstract void isCurrentPage ();




}
