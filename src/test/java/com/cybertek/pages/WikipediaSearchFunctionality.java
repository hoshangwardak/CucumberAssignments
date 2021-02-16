package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaSearchFunctionality {

    public WikipediaSearchFunctionality() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "searchInput")
    public WebElement wikiSearchEngine;

    @FindBy(xpath = "//h1[.='Steve Jobs']")
    public WebElement mainHeader;

    @FindBy(xpath = "(//table[@class='infobox biography vcard']//div)[1]")
    public WebElement imageHeader;

}

