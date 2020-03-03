package com.qa.pom.pages;

import com.qa.pom.base.BaseTest;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.FileReader;
import java.io.IOException;

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

    public JSONObject assessmentMap;

    /** Constructor */
    AbstractAssessmentPage(BaseTest testClass) {
        super(testClass);
    }

    public void setAssessmentMap (JSONObject assessmentMap) {
        this.assessmentMap = assessmentMap;
    }

    public JSONObject getAssessmentMap() {
        return this.assessmentMap;
    }

    public void scrollToTop() {
        while (zIndex.getCssValue("position").equals("fixed")) {
            testClass.actions.sendKeys(Keys.PAGE_UP).perform();
            testClass.log("Scroll to top");
        }
    }

    public void goToSection(String nameOfSection) {
        WebElement element =
                testClass
                        .getDriver()
                        .findElement(
                                By.xpath(
                                        "//div[@id='assessment-tab']//div[@type='button' and text()='"
                                                + nameOfSection
                                                + "']"));
        if (!element.getAttribute("class").contains("btn-primary")) {
            testClass.findElementAndClick(
                    "//div[@id='assessment-tab']//div[@type='button' and text()='"
                            + nameOfSection
                            + "']");
            testClass.waitTillElementIsVisible(loadingWrapper);
            testClass.waitTillElementNotVisible(wrapXpath);
            testClass.log("Go to " + nameOfSection);
        }
    }

    public void goToSupplement(String nameOfSupp) {
        WebElement element =
                testClass
                        .getDriver()
                        .findElement(
                                By.xpath(
                                        "//div[@class='assessment-supplement-box']//a[contains(@class,'assessment-supplement') and text()='"
                                                + nameOfSupp
                                                + "']"));
        if (!element.getAttribute("class").contains("active")) {
            testClass.findElementAndClick(
                    "//div[@class='assessment-supplement-box']//a[contains(@class,'assessment-supplement') and text()='"
                            + nameOfSupp
                            + "']");
            testClass.waitTillElementIsVisible(loadingWrapper);
            testClass.waitTillElementNotVisible(wrapXpath);
            testClass.log("Go to " + nameOfSupp);
        }
    }

    public void elementClear(String varName) {
        testClass.waitTillXpathElementIsVisible(
                "//div[@varname='" + varName + "']//div[@class='element-options']");
        testClass.findElementAndClick(
                "//div[@varname='" + varName + "']//div[@class='element-options']");
        testClass.waitTillXpathElementIsVisible(
                "//div[@varname='" + varName + "']//a[@element-action='clear']");
        testClass.findElementAndClick(
                "//div[@varname='" + varName + "']//a[@element-action='clear']");
    };

    public void fillRadioButton(String varName, String value) {
        try {
            testClass.findElementAndClick(
                    "//div[@varname='" + varName + "']//label[@value='" + value + "']");
        } catch (Exception e) {
            scrollToTop();
            testClass.findElementAndClick(
                    "//div[@varname='" + varName + "']//label[@value='" + value + "']");
        }
    }

    public void fillDropdown(String varName, String value) {
        try {
            testClass.findElementAndClick(
                    "//div[@varname='" + varName + "']//button[@type='button']");
        } catch (Exception e) {
            scrollToTop();
            testClass.findElementAndClick(
                    "//div[@varname='" + varName + "']//button[@type='button']");
        }
        testClass.waitTillXpathElementIsVisible(
                "//div[@varname='" + varName + "']//button[@aria-expanded='true']");
        testClass.findElementAndClick(
                "//div[@varname='" + varName + "']//li[@data-original-index='" + value + "']");
        testClass.waitTillElementNotVisible(
                "//div[@varname='" + varName + "']//button[@aria-expanded='true']");
        testClass.log("Dropdown: " + varName + " Value: " + value + " filled");
    }

    public void fillInput(String varName, String value) {
        elementClear(varName);
        try {
            testClass.findElementAndSendKeys("//div[@varname='" + varName + "']//input", value);
        } catch (Exception e) {
            scrollToTop();
            testClass.findElementAndSendKeys("//div[@varname='" + varName + "']//input", value);
        }
        testClass.log("TextField: " + varName + " Text: " + value + " filled");
    }

    /**
     *
     *
     * @param varName element which will be populated with value
     * @param value value which should be chosen
     */
    public void fillElement(String varName, String value) {
        WebElement element =
                testClass.getDriver().findElement(By.xpath("//div[@varname='" + varName + "']"));
        // Fill radiobutton
        if (element.findElements(
                                By.xpath(
                                        "//div[@varname='"
                                                + varName
                                                + "']//div[contains(@class,'checkbox')]"))
                        .size()
                > 0) {
            fillRadioButton(varName, value);
            // Fill dropdown
        } else if (element.findElements(
                                By.xpath(
                                        "//div[@varname='"
                                                + varName
                                                + "']//button[@data-toggle='dropdown']"))
                        .size()
                > 0) {
            fillDropdown(varName, value);
            // Fill input
        } else if (element.findElements(By.xpath("//div[@varname='" + varName + "']//input")).size()
                > 0) {
            fillInput(varName, value);
        }
    }

    /**
     * Find element is assessment map and procced to it through proper supplement and section
     *
     * @param varname element which will be found in map af assessment and then go to
     * @param value value  of element which should be chosen
     */
    public void findAndGoToElement(String varname, String value) {
        String assessmentName = "";
        String sectionName = "";
        outerloop:
        for (Object suppKey : this.assessmentMap.keySet()) {
            JSONObject section = (JSONObject) this.assessmentMap.get(suppKey);
            for (Object sectionKey : section.keySet()) {
                JSONArray varnames = (JSONArray) section.get(sectionKey);
                if (varnames.contains(varname)) {
                    assessmentName = suppKey.toString();
                    sectionName = sectionKey.toString();
                    break outerloop;
                }
            }
        }
        goToSupplement(assessmentName);
        goToSection(sectionName);
        fillElement(varname, value);
    }

    /**
     *
     *
     * @param formulaName name of formula which is currently calculating
     *
     * @param formulaValue value of formula which is currently calculating
     * @throws IOException
     * @throws ParseException
     */
    public void formulaCalculation(String formulaName, String formulaValue)
            throws IOException, ParseException {
        Object object =
                testClass.jsonParser.parse(
                                new FileReader(
                                        "src/main/java/com/qa/pom/formulas/"
                                                + formulaName
                                                + ".json"));
        JSONObject formulaJson = (JSONObject) object;

        if (formulaValue != "All") {
            JSONObject formulaTestCase = (JSONObject) formulaJson.get(formulaValue);
            formulaJson.clear();
            formulaJson.put(formulaValue, formulaTestCase);
        }

        formulaJson
                .keySet()
                .forEach(
                        key -> {
                            JSONObject testCase = (JSONObject) formulaJson.get(key);
                            JSONObject teststeps = (JSONObject) testCase.get("data");

                            teststeps
                                    .keySet()
                                    .forEach(
                                            varname -> {
                                                findAndGoToElement(
                                                        varname.toString(),
                                                        teststeps.get(varname).toString());
                                            });
                            JSONObject dependency = (JSONObject) testCase.get("dependencies");
                            if (!dependency.isEmpty()) {
                                dependency
                                        .keySet()
                                        .forEach(
                                                dependencyName -> {
                                                    try {
                                                        formulaCalculation(
                                                                dependencyName.toString(),
                                                                dependency
                                                                        .get(dependencyName)
                                                                        .toString());
                                                    } catch (IOException e) {
                                                        e.printStackTrace();
                                                    } catch (ParseException e) {
                                                        e.printStackTrace();
                                                    }
                                                });
                            }
                            if (formulaValue == "All") {
                                JSONObject expected = (JSONObject) testCase.get("expected");
                                if (formulaName.contains("CAP")) {
                                    checkCapTrigger(
                                            expected.get("nameOfFormula").toString(),
                                            expected.get("value").toString(),
                                            expected.get("description").toString());
                                } else {
                                    checkScaleTrigger(
                                            expected.get("nameOfFormula").toString(),
                                            expected.get("value").toString(),
                                            expected.get("description").toString());
                                }
                            }
                        });
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
            testClass.log("" + nameOfFormula + "  Value Correct");
        } catch (AssertionError e) {
            testClass.logWarn("Please check value of triggered formula");
            testClass.logError(e.getMessage() + " " + e.getCause());
        }
        try {
            Assert.assertEquals(
                    "Description of: " + nameOfFormula + " is not as expected",
                    expectedFormulaDescription,
                    formulaDescription);
            testClass.log("" + nameOfFormula + "  Description Correct");
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
            testClass.log("" + nameOfFormula + "  Value Correct");
        } catch (AssertionError e) {
            testClass.logWarn("Please check value of triggered formula");
            testClass.logError(e.getMessage() + " " + e.getCause());
        }
        try {
            Assert.assertEquals(
                    "Description of: " + nameOfFormula + " is not as expected",
                    expectedFormulaDescription,
                    formulaDescription);
            testClass.log("" + nameOfFormula + " Description Correct");
        } catch (AssertionError e) {
            testClass.logWarn("Please check Description of triggered formula");
            testClass.logError(e.getMessage() + " " + e.getCause());
        }

        closeFormulasPage.click();
    }
}
