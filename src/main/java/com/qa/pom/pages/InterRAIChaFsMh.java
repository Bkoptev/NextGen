package com.qa.pom.pages;

import com.qa.pom.base.BaseTest;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.FileReader;
import java.io.IOException;

public class InterRAIChaFsMh extends AbstractAssessmentPage {

    @FindBy(xpath = "//div[@varname='FS']")
    private WebElement waitForElemUpload;

    private String[] formulas = {""};

    public JSONArray assessmentMap;
    /**
     * Constructor
     *
     * @param testClass
     */
    InterRAIChaFsMh(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(loadingWrapper);
        testClass.waitTillElementNotVisible(wrapXpath);
        testClass.waitTillElementIsVisible(waitForElemUpload);
        loadAssessmentMap();
    }

    public void loadAssessmentMap() {
        try {
            assessmentMap =
                    (JSONArray)
                            testClass.jsonParser.parse(
                                    new FileReader(
                                            "src/main/java/com/qa/pom/maps/"
                                                    + InterRAIChaFsMh.class.getSimpleName()
                                                    + ".json"));
            setAssessmentMap(assessmentMap);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
