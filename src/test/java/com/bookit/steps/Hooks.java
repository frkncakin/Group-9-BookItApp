package com.bookit.steps;

import com.bookit.utility.ConfigurationReader;
import com.bookit.utility.DB_Util;
import com.bookit.utility.Driver;
import com.bookit.utility.ConfigurationReader;
import com.bookit.utility.DB_Util;
import com.bookit.utility.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("this is coming from BEFORE");
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get(ConfigurationReader.getProperty("bookit_url"));




    }

    @After
    public void tearDown(Scenario scenario){
        System.out.println("this is coming from AFTER");

        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }

        Driver.closeBrowser();

    }


    @Before("@db")
    public void setUpDB() {

        DB_Util.createConnection();
        System.out.println("CONNECTING DATABASE......");

    }


    @After("@db")
    public void destroyDB() {

        DB_Util.destroy();
        System.out.println("CLOSING DATABASE CONNECTION......");

    }
}
