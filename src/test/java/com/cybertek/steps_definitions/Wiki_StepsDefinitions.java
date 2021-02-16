package com.cybertek.steps_definitions;

import com.cybertek.pages.WikipediaSearchFunctionality;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.security.Key;

public class Wiki_StepsDefinitions {

    WikipediaSearchFunctionality wikipediaSearchFunctionality = new WikipediaSearchFunctionality();

    @Given("user is on Wikipedia page")
    public void user_is_on_wikipedia_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("wikiUrl"));
    }

    @When("user types Steve Jobs in the search box and clicks")
    public void userTypesSteveJobsInTheSearchBoxAndClicks() {

       wikipediaSearchFunctionality.wikiSearchEngine.click();

       wikipediaSearchFunctionality.wikiSearchEngine.sendKeys("Steve Jobs" + Keys.ENTER);
    }


    @Then("user should see Steve Jobs in the wiki title")
    public void user_should_see_steve_jobs_in_the_wiki_title() {

        String expectedTitle = "Steve Jobs";
       String actualTitle =  Driver.getDriver().getTitle();

       Assert.assertTrue(actualTitle.contains(expectedTitle));
    }


    @Then("User should see Steve Jobs is in the main header")
    public void userShouldSeeSteveJobsIsInTheMainHeader() {

        String expectedMainHeader = "Steve Jobs";
       String actualMainHeader =  wikipediaSearchFunctionality.mainHeader.getText();

       Assert.assertTrue(actualMainHeader.contains(expectedMainHeader));


    }

    @Then("User should see Steve Jobs is in the image header")
    public void userShouldSeeSteveJobsIsInTheImageHeader() {

        String expectedImageHeader = "Steve Jobs";
        String actualImageHeader = wikipediaSearchFunctionality.imageHeader.getText();

        Assert.assertTrue(actualImageHeader.contains(expectedImageHeader));
    }
}
