package com.bookit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends  BasePage{

    @Override
    public void isCurrentPage() {
    }

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailField;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement sigInBtn;

    @FindBy (xpath = "//div[contains(text(),'[object ProgressEvent]')]")
    public WebElement errorMsg;


    public void logIn (String u, String p) {
        emailField.sendKeys(u);
        passwordField.sendKeys(p);
        sigInBtn.click();
    }

}
