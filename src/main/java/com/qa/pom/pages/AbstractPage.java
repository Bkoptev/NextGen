package com.qa.pom.pages;

import com.qa.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {

    BaseTest testClass;

    String wrapXpath = "//div[@class='loading-wrapper']";
    String visibleOfTerminateAndLogin = "//button[contains(@class,'btn btn-primary')]";
    /** Web elements with @FindBy annotation */
    @FindBy(xpath = "//div[@class='loading-wrapper']")
    WebElement loadingWrapper;

    @FindBy(xpath = "//input[@type='password']")
    WebElement loginLoad;

    @FindBy(xpath = "//a[@href='/app/new-client']")
    WebElement addClient;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement submitButton;

    /** Constructor */
    AbstractPage(BaseTest testClass) {
        this.testClass = testClass;
        PageFactory.initElements(testClass.getDriver(), this); // Initialize WebElements
    }
}
