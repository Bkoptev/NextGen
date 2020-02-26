package com.qa.pom.pages;

import com.qa.pom.base.BaseTest;
import com.qa.pom.utils.YamlFile;
import com.qa.pom.utils.YamlParser;
import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends AbstractPage {

    @FindBy(
            xpath =
                    "//button[contains(@class,'btn btn-primary')] | //div[@class='loading-wrapper']")
    private WebElement spinnerPathAndTerminateAndLogin;

    @FindBy(xpath = "//input[@type='text']")
    private WebElement username;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement password;

    @FindBy(xpath = "//button[contains(@class,'btn btn-primary')]")
    private WebElement terminateandLogin;

    /**
     * Constructor
     *
     * @param testClass the instance of login page
     */
    public Login(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(loginLoad);
    }

    /**
     * Log in using email and password form configuration.yaml
     *
     * @return next page
     */
    public Dashboard logIn() throws IOException {

        YamlFile yamlData = YamlParser.getYamlData();

        username.sendKeys(yamlData.getLogin());
        password.sendKeys(yamlData.getPassword());
        submitButton.click();
        testClass.waitTillElementIsVisible(spinnerPathAndTerminateAndLogin);
        testClass.sizeConditionLoginCheckAndClickOnElem(
                visibleOfTerminateAndLogin, terminateandLogin);
        testClass.waitTillElementIsVisible(loadingWrapper);
        testClass.waitTillElementNotVisible(wrapXpath);

        return new Dashboard(testClass);
    }
};
