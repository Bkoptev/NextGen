package com.qa.pom.pages;

import com.qa.pom.base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class AbstractAssessmentPage extends AbstractPage {

    @FindBy(xpath = "//div[@class='assessment-supplement-box']//..")
    WebElement zIndex;

    @FindBy(xpath = "//div[@title='CAPs']")
    WebElement ClickCaps;

    @FindBy(xpath = "//div[@title='Scales']")
    WebElement ClickScales;

    @FindBy(xpath = "//div[@class='modal-content']//h4[text()='CAPs']")
    WebElement capsOpened;

    @FindBy(xpath = "//div[@class='modal-content']//h4[text()='Scales']")
    WebElement scalesOpened;

    @FindBy(xpath = "//button[@class='modal-close']")
    WebElement closeFormulasPage;

    /** Constructor */
    AbstractAssessmentPage(BaseTest testClass) {
        super(testClass);
    }

    public void scrollToTop() {
        while (zIndex.getCssValue("position").equals("fixed")) {
            testClass.actions.sendKeys(Keys.PAGE_UP).perform();
            testClass.log("Scroll to top");
        }
    }

    public void goToSection(String nameOfSection) {
        WebElement element = testClass.getDriver().findElement(By.xpath("//div[@id='assessment-tab']//div[@type='button' and text()='"
                + nameOfSection
                + "']"));
        if (!element.getAttribute("class").contains("btn-primary")) {
            testClass.findElementAndClick(
                    "//div[@id='assessment-tab']//div[@type='button' and text()='"
                            + nameOfSection
                            + "']");
            testClass.waitTillElementIsVisible(loadingWrapper);
            testClass.waitTillElementNotVisible(wrapXpath);
        }
    }

    public void goToSupplement(String nameOfSupp) {
        WebElement element = testClass.getDriver().findElement(By.xpath("//div[@class='assessment-supplement-box']//a[@class=' assessment-supplement'and text()='"
                + nameOfSupp
                + "']"));
        if (!element.getAttribute("class").contains("active")){
            testClass.findElementAndClick(
                    "//div[@class='assessment-supplement-box']//a[@class=' assessment-supplement'and text()='"
                            + nameOfSupp
                            + "']");
            testClass.waitTillElementIsVisible(loadingWrapper);
            testClass.waitTillElementNotVisible(wrapXpath);
        }
    }

    public void elementClear (String varName){
        testClass.waitTillXpathElementIsVisible("//div[@varname='"+varName+"']//div[@class='element-options']");
        testClass.findElementAndClick("//div[@varname='"+varName+"']//div[@class='element-options']");
        testClass.waitTillXpathElementIsVisible("//div[@varname='"+varName+"']//a[@element-action='clear']");
        testClass.findElementAndClick("//div[@varname='"+varName+"']//a[@element-action='clear']");
    };


    public void fillElement(String varName, String value) {
        WebElement element = testClass.getDriver().findElement(By.xpath("//div[@varname='\"+varName+\"']"));
        //Fill radiobutton
        if (element.getCssValue("class").equals("btn-group clearfix mw-100_pct")) {
            try {
                testClass.findElementAndClick(
                        "//div[@varname='" + varName + "']//label[@value='" + value + "']");
            } catch (Exception e) {
                scrollToTop();
                testClass.findElementAndClick(
                        "//div[@varname='" + varName + "']//label[@value='" + value + "']");
            }
            testClass.log("Radiobutton: " + varName + " Value: " + value + " filled");
            //Fill dropdown
        } else if (element.getCssValue("data-toggle").equals("dropdown")) {
            try {
                testClass.findElementAndClick("//div[@varname='" + varName + "']//button[@type='button']");
            } catch (Exception e) {
                scrollToTop();
                testClass.findElementAndClick("//div[@varname='" + varName + "']//button[@type='button']");
            }
            testClass.waitTillXpathElementIsVisible(
                    "//div[@varname='" + varName + "']//button[@aria-expanded='true']");
            testClass.findElementAndClick(
                    "//div[@varname='"
                            + varName
                            + "']//li[@data-original-index='"
                            + value
                            + "']");
            testClass.waitTillElementNotVisible(
                    "//div[@varname='" + varName + "']//button[@aria-expanded='true']");
            testClass.log("Dropdown: " + varName + " Value: " + value + " filled");
            //Fill input
            } else if (element.getCssValue("type").equals("text")) {
                try {
                    testClass.findElementAndSendKeys("//div[@varname='" + varName + "']//input", value);
                } catch (Exception e) {
                    scrollToTop();
                    testClass.findElementAndSendKeys("//div[@varname='" + varName + "']//input", value);
                }
            testClass.log("TextField: " + varName + " Text: " + value + " filled");
        }

    }

    public void goToAndFillElement (String varname, String[][] assessment) {
        String assessmentName = "";
        String sectionName = "";
        outerloop:
        for (int i = 0; i < assessment.length; i++) {
            for (int j = 0; j < assessment[i].length; j++) {
               if (varname.equals(assessment[i][j])) {
                   assessmentName = assessment[i][0];
                   sectionName = assessment[i][1];
                   break outerloop;
               }
            }
        }
        goToSupplement(assessmentName);
        goToSection(sectionName);
        //fillElement();

    }






    public void checkCapTrigger(
            String nameOfFormula, String expectedFormulaValue, String expectedFormulaDescription) {

        ClickCaps.click();
        testClass.waitTillElementIsVisible(capsOpened);

        String formulaValue =
                testClass.findElementAndGetText(
                        "//div[@class='formulas__header' and text()='"
                                + nameOfFormula
                                + "']//following-sibling::div//span[@class='badge']");
        String formulaDescription =
                testClass.findElementAndGetText(
                        "//div[@class='formulas__header' and text()='"
                                + nameOfFormula
                                + "']//following-sibling::div//span[contains(@class,'label label')]");

        try {
            Assert.assertEquals(
                    "Value of: " + nameOfFormula + " is not as expected",
                    expectedFormulaValue,
                    formulaValue);
            testClass.log(""+nameOfFormula+"  Value Correct");
        } catch (AssertionError e) {
            testClass.logWarn("Please check value of triggered formula");
            testClass.logError(e.getMessage() + " " + e.getCause());
        }
        try {
            Assert.assertEquals(
                    "Description of: " + nameOfFormula + " is not as expected",
                    expectedFormulaDescription,
                    formulaDescription);
            testClass.log(""+nameOfFormula+"  Description Correct");
        } catch (AssertionError e) {
            testClass.logWarn("Please check Description of triggered formula");
            testClass.logError(e.getMessage() + " " + e.getCause());
        }

        closeFormulasPage.click();

    }

    public void checkScaleTrigger(
            String nameOfFormula, String expectedFormulaValue, String expectedFormulaDescription) {

        ClickScales.click();
        testClass.waitTillElementIsVisible(scalesOpened);

        String formulaValue =
                testClass.findElementAndGetText(
                        "//div[@class='formulas__header' and text()='"
                                + nameOfFormula
                                + "']//following-sibling::div//span[@class='badge']");
        String formulaDescription =
                testClass.findElementAndGetText(
                        "//div[@class='formulas__header' and text()='"
                                + nameOfFormula
                                + "']//following-sibling::div//span[contains(@class,'label')]");

        try {
            Assert.assertEquals(
                    "Value of: " + nameOfFormula + " is not as expected",
                    expectedFormulaValue,
                    formulaValue);
            testClass.log(""+nameOfFormula+"  Value Correct");
        } catch (AssertionError e) {
            testClass.logWarn("Please check value of triggered formula");
            testClass.logError(e.getMessage() + " " + e.getCause());
        }
        try {
            Assert.assertEquals(
                    "Description of: " + nameOfFormula + " is not as expected",
                    expectedFormulaDescription,
                    formulaDescription);
            testClass.log(""+nameOfFormula+" Description Correct");
        } catch (AssertionError e) {
            testClass.logWarn("Please check Description of triggered formula");
            testClass.logError(e.getMessage() + " " + e.getCause());
        }

        closeFormulasPage.click();
    }
}
