package com.qa.pom.pages;

import com.qa.pom.base.BaseTest;
import java.util.Random;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddnewClient extends AbstractPage {

    @FindBy(xpath = "//div[@id='firstName']//input")
    private WebElement firstName;

    @FindBy(xpath = "//div[@id='middleName']//input")
    private WebElement middleName;

    @FindBy(xpath = "//div[@id='lastName']//input")
    private WebElement lastName;

    @FindBy(xpath = "//div[@id='salutation']//input")
    private WebElement suffix;

    @FindBy(xpath = "//div[@id='sex']//button")
    private WebElement genderDropdown;

    @FindBy(xpath = "//div[@id='dateOfBirth']//input")
    private WebElement dateOfBirth;

    @FindBy(xpath = "//div[@id='hcn']//input")
    private WebElement hCN;

    @FindBy(xpath = "//div[@id='department']//button")
    private WebElement departmentDropdown;

    @FindBy(xpath = "//div[@id='country']//input")
    private WebElement country;

    @FindBy(xpath = "//div[@id='state']//input")
    private WebElement provinceorState;

    @FindBy(xpath = "//div[@id='zipcode']//input")
    private WebElement postalCode;

    @FindBy(xpath = "//div[@id='sex']//ul[@aria-expanded='true']")
    private WebElement dropdownGenderopenMarker;

    @FindBy(xpath = "//li[@data-original-index='0']//span[contains(text(),'Male')]")
    private WebElement clickMale;

    @FindBy(xpath = "//div[@id='department']//ul[@aria-expanded='true']")
    private WebElement dropdownDepartmentopenMarker;

    @FindBy(xpath = "//button[contains(text(),'Select All')]")
    private WebElement clickSelectall;

    @FindBy(xpath = "//button[contains(@class,'btn-success')]")
    private WebElement clickSave;

    public AddnewClient(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(genderDropdown);
    }

    public Pathways FillinNewpatientInformation() {
        Random rndNum = new Random();
        firstName.sendKeys("Acutenet");
        middleName.sendKeys("Test" + rndNum.nextInt());
        lastName.sendKeys("Phase");
        suffix.sendKeys("RT");
        genderDropdown.click();
        testClass.waitTillElementIsVisible(dropdownGenderopenMarker);
        clickMale.click();
        dateOfBirth.sendKeys("11/02/1992");
        hCN.sendKeys("1435263543");
        departmentDropdown.click();
        testClass.waitTillElementIsVisible(dropdownDepartmentopenMarker);
        clickSelectall.click();
        country.sendKeys("NY");
        provinceorState.sendKeys("Test");
        postalCode.sendKeys("A0A");
        clickSave.click();
        testClass.log("Go to the Pathways");
        return new Pathways(testClass);
    }
}
