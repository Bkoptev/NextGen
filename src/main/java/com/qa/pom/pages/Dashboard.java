package com.qa.pom.pages;

import com.qa.pom.base.BaseTest;
import com.qa.pom.utils.YamlFile;
import com.qa.pom.utils.YamlParser;
import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard extends AbstractPage {

    @FindBy(xpath = "//tr[@class='odd cursor-pointer']")
    private WebElement clickSearchResult;

    @FindBy(xpath = "//div[@id='hcn']//input")
    private WebElement inputHcn;

    @FindBy(xpath = "//div[@id='searchButtons']//button[4]")
    private WebElement clickHcn;

    @FindBy(xpath = "//button[@id='patient-search-submit']")
    private WebElement clickSearch;

    /**
     * Constructor
     *
     * @param testClass the instance of account page
     */
    public Dashboard(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(submitButton);
    }

    public AddnewClient addnewClientclick() throws IOException {
        addClient.click();
        return new AddnewClient(testClass);
    }

    public Pathways existedPatient() throws IOException {

        YamlFile yamlData = YamlParser.getYamlData();
        clickHcn.click();
        inputHcn.sendKeys(yamlData.getHcn());
        clickSearch.click();
        testClass.waitTillElementIsVisible(clickSearchResult);
        clickSearchResult.click();
        return new Pathways(testClass);
    };
}
