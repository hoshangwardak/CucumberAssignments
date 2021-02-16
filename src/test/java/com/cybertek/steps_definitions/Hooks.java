package com.cybertek.steps_definitions;


import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;

public class Hooks {

    @Before
    public void setUpScenario() {
        System.out.println("My before method is working");
        Driver.getDriver().get(ConfigurationReader.getProperty("wikiUrl"));
    }

    @After
    public void tearDownScenario() {
        BrowserUtils.screenShot();

    }



}
