package com.qa.pom.pages;

import com.qa.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChaChaFsChamhFormulas extends AbstractAssessmentPage {

    @FindBy(xpath = "//div[@varname='FS']")
    private WebElement waitForElemUpload;

    public ChaChaFsChamhFormulas(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(loadingWrapper);
        testClass.waitTillElementNotVisible(wrapXpath);
        testClass.waitTillElementIsVisible(waitForElemUpload);
    }

    // -----------------------------------Scales---------------------------------------------------

    /** Method which includes all levels test of Communication Scale */
    public void communicationScaleTest() {
        communicationScale_0_Intact();
        communicationScale_1_BORDERLINE_INTACT();
        communicationScale_2_MildImpairment();
        communicationScale_3_MildOrModerateImpairment();
        communicationScale_4_ModerateImpairment();
        communicationScale_5_ModerateOrSevereImpairment();
        communicationScale_6_SevereImpairment();
        communicationScale_7_SevereOrVerySevereImpairment();
        communicationScale_8_VerySevereImpairment();
    }

    public void communicationScale_0_Intact() {
        goToNewSection("D. COMMUNICATION");
        fillInDropdown("iD1", "0");
        fillInDropdown("iD2", "0");
        checkScaleTrigger("Communication Scale (CS)", "0 out of 8", "Intact");
    }

    public void communicationScale_1_BORDERLINE_INTACT() {
        fillInDropdown("iD1", "1");
        fillInDropdown("iD2", "0");
        checkScaleTrigger("Communication Scale (CS)", "1 out of 8", "Borderline intact");
    }

    public void communicationScale_2_MildImpairment() {
        fillInDropdown("iD1", "2");
        fillInDropdown("iD2", "0");
        checkScaleTrigger("Communication Scale (CS)", "2 out of 8", "Mild impairment");
    }

    public void communicationScale_3_MildOrModerateImpairment() {
        fillInDropdown("iD1", "3");
        fillInDropdown("iD2", "0");
        checkScaleTrigger("Communication Scale (CS)", "3 out of 8", "Mild/moderate impairment");
    }

    public void communicationScale_4_ModerateImpairment() {
        fillInDropdown("iD1", "4");
        fillInDropdown("iD2", "0");
        checkScaleTrigger("Communication Scale (CS)", "4 out of 8", "Moderate impairment");
    }

    public void communicationScale_5_ModerateOrSevereImpairment() {
        fillInDropdown("iD1", "4");
        fillInDropdown("iD2", "1");
        checkScaleTrigger("Communication Scale (CS)", "5 out of 8", "Moderate/severe impairment");
    }

    public void communicationScale_6_SevereImpairment() {
        fillInDropdown("iD1", "4");
        fillInDropdown("iD2", "2");
        checkScaleTrigger("Communication Scale (CS)", "6 out of 8", "Severe impairment");
    }

    public void communicationScale_7_SevereOrVerySevereImpairment() {
        fillInDropdown("iD1", "4");
        fillInDropdown("iD2", "3");
        checkScaleTrigger(
                "Communication Scale (CS)", "7 out of 8", "Severe/very severe impairment");
    }

    public void communicationScale_8_VerySevereImpairment() {
        fillInDropdown("iD1", "4");
        fillInDropdown("iD2", "4");
        checkScaleTrigger("Communication Scale (CS)", "8 out of 8", "Very severe impairment");
    }

    public void aDLScale_ShortFormTest_SmallSet() {
        testClass.log("Start test of aDLScale_ShortForm");
        testClass.log("Small Set");
        aDLScale_ShortForm_0_Out_Of_8();
        aDLScale_ShortForm_1_Out_Of_8();
        aDLScale_ShortForm_2_Out_Of_8();
        aDLScale_ShortForm_3_Out_Of_8();
        aDLScale_ShortForm_4_Out_Of_8();
        aDLScale_ShortForm_5_Out_Of_8();
        aDLScale_ShortForm_6_Out_Of_8();
        aDLScale_ShortForm_7_Out_Of_8();
        aDLScale_ShortForm_8_Out_Of_8();
    }

    public void aDLScale_ShortForm_0_Out_Of_8() {

        goToNewSection("G. FUNCTIONAL");
        fillInDropdown("iG2b", "0");
        fillInDropdown("iG2f", "0");
        checkScaleTrigger(
                "Activities of Daily Living (ADL) Scale - Short Form",
                "0 out of 16",
                "No ADL Impairment");
    }

    public void aDLScale_ShortForm_1_Out_Of_8() {

        fillInDropdown("iG2b", "2");
        fillInDropdown("iG2f", "0");
        checkScaleTrigger(
                "Activities of Daily Living (ADL) Scale - Short Form",
                "1 out of 16",
                "Higher values indicate greater difficulty in performing activities");
    }

    public void aDLScale_ShortForm_2_Out_Of_8() {

        fillInDropdown("iG2b", "2");
        fillInDropdown("iG2f", "2");
        checkScaleTrigger(
                "Activities of Daily Living (ADL) Scale - Short Form",
                "2 out of 16",
                "Higher values indicate greater difficulty in performing activities");
    }

    public void aDLScale_ShortForm_3_Out_Of_8() {

        fillInDropdown("iG2b", "3");
        fillInDropdown("iG2f", "2");
        checkScaleTrigger(
                "Activities of Daily Living (ADL) Scale - Short Form",
                "3 out of 16",
                "Higher values indicate greater difficulty in performing activities");
    }

    public void aDLScale_ShortForm_4_Out_Of_8() {

        fillInDropdown("iG2b", "4");
        fillInDropdown("iG2f", "2");
        checkScaleTrigger(
                "Activities of Daily Living (ADL) Scale - Short Form",
                "4 out of 16",
                "Higher values indicate greater difficulty in performing activities");
    }

    public void aDLScale_ShortForm_5_Out_Of_8() {

        fillInDropdown("iG2b", "6");
        fillInDropdown("iG2f", "2");
        checkScaleTrigger(
                "Activities of Daily Living (ADL) Scale - Short Form",
                "5 out of 16",
                "Higher values indicate greater difficulty in performing activities");
    }

    public void aDLScale_ShortForm_6_Out_Of_8() {

        fillInDropdown("iG2b", "6");
        fillInDropdown("iG2f", "3");
        checkScaleTrigger(
                "Activities of Daily Living (ADL) Scale - Short Form",
                "6 out of 16",
                "Higher values indicate greater difficulty in performing activities");
    }

    public void aDLScale_ShortForm_7_Out_Of_8() {

        fillInDropdown("iG2b", "6");
        fillInDropdown("iG2f", "4");
        checkScaleTrigger(
                "Activities of Daily Living (ADL) Scale - Short Form",
                "7 out of 16",
                "Higher values indicate greater difficulty in performing activities");
    }

    public void aDLScale_ShortForm_8_Out_Of_8() {

        fillInDropdown("iG2b", "6");
        fillInDropdown("iG2f", "6");
        checkScaleTrigger(
                "Activities of Daily Living (ADL) Scale - Short Form",
                "8 out of 16",
                "Higher values indicate greater difficulty in performing activities");

    }


    public void aDLScale_ShortFormTest_Long(){
        aDLScale_ShortForm_0_Out_Of_16();
        aDLScale_ShortForm_1_Out_Of_16();
        aDLScale_ShortForm_2_Out_Of_16();
        aDLScale_ShortForm_3_Out_Of_16();
        aDLScale_ShortForm_4_Out_Of_16();
        aDLScale_ShortForm_5_Out_Of_16();
        aDLScale_ShortForm_6_Out_Of_16();
        aDLScale_ShortForm_7_Out_Of_16();
        aDLScale_ShortForm_8_Out_Of_16();
        aDLScale_ShortForm_9_Out_Of_16();
        aDLScale_ShortForm_10_Out_Of_16();
        aDLScale_ShortForm_11_Out_Of_16();
        aDLScale_ShortForm_12_Out_Of_16();
        aDLScale_ShortForm_13_Out_Of_16();
        aDLScale_ShortForm_14_Out_Of_16();
        aDLScale_ShortForm_15_Out_Of_16();
        aDLScale_ShortForm_16_Out_Of_16();
    }

    public void aDLScale_ShortForm_0_Out_Of_16() {

    goToNewSection("A. IDENTIFICATION");
    fillInRadioButton("FS","1");
    goToNewSection("G. FUNCTIONAL");
    fillInDropdown("iG2b", "0");
    fillInDropdown("iG2f", "0");
    goToSupplement("CHA-FS");
    goToNewSection("D. FUNCTIONAL");
    fillInDropdown("iG2h", "0");
    fillInDropdown("iG2j", "0");
    checkScaleTrigger("Activities of Daily Living (ADL) Scale - Short Form","0 out of 16","No ADL Impairment");
    goToSupplement("CHA");

    }

    public void aDLScale_ShortForm_1_Out_Of_16() {

        fillInRadioButton("FS","1");
        goToNewSection("G. FUNCTIONAL");
        fillInDropdown("iG2b", "2");
        fillInDropdown("iG2f", "0");
        goToSupplement("CHA-FS");
        goToNewSection("D. FUNCTIONAL");
        fillInDropdown("iG2h", "0");
        fillInDropdown("iG2j", "0");
        checkScaleTrigger("Activities of Daily Living (ADL) Scale - Short Form","1 out of 16","Higher values indicate greater difficulty in performing activities");
        goToSupplement("CHA");

    }

    public void aDLScale_ShortForm_2_Out_Of_16() {

        fillInRadioButton("FS","1");
        goToNewSection("G. FUNCTIONAL");
        fillInDropdown("iG2b", "3");
        fillInDropdown("iG2f", "0");
        goToSupplement("CHA-FS");
        goToNewSection("D. FUNCTIONAL");
        fillInDropdown("iG2h", "0");
        fillInDropdown("iG2j", "0");
        checkScaleTrigger("Activities of Daily Living (ADL) Scale - Short Form","2 out of 16","Higher values indicate greater difficulty in performing activities");
        goToSupplement("CHA");

    }

    public void aDLScale_ShortForm_3_Out_Of_16() {

        fillInRadioButton("FS","1");
        goToNewSection("G. FUNCTIONAL");
        fillInDropdown("iG2b", "4");
        fillInDropdown("iG2f", "0");
        goToSupplement("CHA-FS");
        goToNewSection("D. FUNCTIONAL");
        fillInDropdown("iG2h", "0");
        fillInDropdown("iG2j", "0");
        checkScaleTrigger("Activities of Daily Living (ADL) Scale - Short Form","3 out of 16","Higher values indicate greater difficulty in performing activities");
        goToSupplement("CHA");

    }

    public void aDLScale_ShortForm_4_Out_Of_16() {

        fillInRadioButton("FS","1");
        goToNewSection("G. FUNCTIONAL");
        fillInDropdown("iG2b", "6");
        fillInDropdown("iG2f", "0");
        goToSupplement("CHA-FS");
        goToNewSection("D. FUNCTIONAL");
        fillInDropdown("iG2h", "0");
        fillInDropdown("iG2j", "0");
        checkScaleTrigger("Activities of Daily Living (ADL) Scale - Short Form","4 out of 16","Higher values indicate greater difficulty in performing activities");
        goToSupplement("CHA");

    }
    public void aDLScale_ShortForm_5_Out_Of_16() {

        fillInRadioButton("FS","1");
        goToNewSection("G. FUNCTIONAL");
        fillInDropdown("iG2b", "6");
        fillInDropdown("iG2f", "2");
        goToSupplement("CHA-FS");
        goToNewSection("D. FUNCTIONAL");
        fillInDropdown("iG2h", "0");
        fillInDropdown("iG2j", "0");
        checkScaleTrigger("Activities of Daily Living (ADL) Scale - Short Form","5 out of 16","Higher values indicate greater difficulty in performing activities");
        goToSupplement("CHA");

    }

    public void aDLScale_ShortForm_6_Out_Of_16() {

        fillInRadioButton("FS","1");
        goToNewSection("G. FUNCTIONAL");
        fillInDropdown("iG2b", "6");
        fillInDropdown("iG2f", "3");
        goToSupplement("CHA-FS");
        goToNewSection("D. FUNCTIONAL");
        fillInDropdown("iG2h", "0");
        fillInDropdown("iG2j", "0");
        checkScaleTrigger("Activities of Daily Living (ADL) Scale - Short Form","6 out of 16","Higher values indicate greater difficulty in performing activities");
        goToSupplement("CHA");

    }

    public void aDLScale_ShortForm_7_Out_Of_16() {

        fillInRadioButton("FS","1");
        goToNewSection("G. FUNCTIONAL");
        fillInDropdown("iG2b", "6");
        fillInDropdown("iG2f", "4");
        goToSupplement("CHA-FS");
        goToNewSection("D. FUNCTIONAL");
        fillInDropdown("iG2h", "0");
        fillInDropdown("iG2j", "0");
        checkScaleTrigger("Activities of Daily Living (ADL) Scale - Short Form","7 out of 16","Higher values indicate greater difficulty in performing activities");
        goToSupplement("CHA");

    }

    public void aDLScale_ShortForm_8_Out_Of_16() {

        fillInRadioButton("FS","1");
        goToNewSection("G. FUNCTIONAL");
        fillInDropdown("iG2b", "6");
        fillInDropdown("iG2f", "6");
        goToSupplement("CHA-FS");
        goToNewSection("D. FUNCTIONAL");
        fillInDropdown("iG2h", "0");
        fillInDropdown("iG2j", "0");
        checkScaleTrigger("Activities of Daily Living (ADL) Scale - Short Form","8 out of 16","Higher values indicate greater difficulty in performing activities");
        goToSupplement("CHA");

    }

    public void aDLScale_ShortForm_9_Out_Of_16() {

        fillInRadioButton("FS","1");
        goToNewSection("G. FUNCTIONAL");
        fillInDropdown("iG2b", "6");
        fillInDropdown("iG2f", "6");
        goToSupplement("CHA-FS");
        goToNewSection("D. FUNCTIONAL");
        fillInDropdown("iG2h", "2");
        fillInDropdown("iG2j", "0");
        checkScaleTrigger("Activities of Daily Living (ADL) Scale - Short Form","9 out of 16","Higher values indicate greater difficulty in performing activities");
        goToSupplement("CHA");

    }



    public void aDLScale_ShortForm_10_Out_Of_16() {

        fillInRadioButton("FS","1");
        goToNewSection("G. FUNCTIONAL");
        fillInDropdown("iG2b", "6");
        fillInDropdown("iG2f", "6");
        goToSupplement("CHA-FS");
        goToNewSection("D. FUNCTIONAL");
        fillInDropdown("iG2h", "3");
        fillInDropdown("iG2j", "0");
        checkScaleTrigger("Activities of Daily Living (ADL) Scale - Short Form","10 out of 16","Higher values indicate greater difficulty in performing activities");
        goToSupplement("CHA");

    }


    public void aDLScale_ShortForm_11_Out_Of_16() {

        fillInRadioButton("FS","1");
        goToNewSection("G. FUNCTIONAL");
        fillInDropdown("iG2b", "6");
        fillInDropdown("iG2f", "6");
        goToSupplement("CHA-FS");
        goToNewSection("D. FUNCTIONAL");
        fillInDropdown("iG2h", "4");
        fillInDropdown("iG2j", "0");
        checkScaleTrigger("Activities of Daily Living (ADL) Scale - Short Form","11 out of 16","Higher values indicate greater difficulty in performing activities");
        goToSupplement("CHA");

    }


    public void aDLScale_ShortForm_12_Out_Of_16() {

        fillInRadioButton("FS","1");
        goToNewSection("G. FUNCTIONAL");
        fillInDropdown("iG2b", "6");
        fillInDropdown("iG2f", "6");
        goToSupplement("CHA-FS");
        goToNewSection("D. FUNCTIONAL");
        fillInDropdown("iG2h", "6");
        fillInDropdown("iG2j", "0");
        checkScaleTrigger("Activities of Daily Living (ADL) Scale - Short Form","12 out of 16","Higher values indicate greater difficulty in performing activities");
        goToSupplement("CHA");

    }

    public void aDLScale_ShortForm_13_Out_Of_16() {

        fillInRadioButton("FS","1");
        goToNewSection("G. FUNCTIONAL");
        fillInDropdown("iG2b", "6");
        fillInDropdown("iG2f", "6");
        goToSupplement("CHA-FS");
        goToNewSection("D. FUNCTIONAL");
        fillInDropdown("iG2h", "6");
        fillInDropdown("iG2j", "2");
        checkScaleTrigger("Activities of Daily Living (ADL) Scale - Short Form","13 out of 16","Higher values indicate greater difficulty in performing activities");
        goToSupplement("CHA");

    }

    public void aDLScale_ShortForm_14_Out_Of_16() {

        fillInRadioButton("FS","1");
        goToNewSection("G. FUNCTIONAL");
        fillInDropdown("iG2b", "6");
        fillInDropdown("iG2f", "6");
        goToSupplement("CHA-FS");
        goToNewSection("D. FUNCTIONAL");
        fillInDropdown("iG2h", "6");
        fillInDropdown("iG2j", "3");
        checkScaleTrigger("Activities of Daily Living (ADL) Scale - Short Form","14 out of 16","Higher values indicate greater difficulty in performing activities");
        goToSupplement("CHA");

    }


    public void aDLScale_ShortForm_15_Out_Of_16() {

        fillInRadioButton("FS","1");
        goToNewSection("G. FUNCTIONAL");
        fillInDropdown("iG2b", "6");
        fillInDropdown("iG2f", "6");
        goToSupplement("CHA-FS");
        goToNewSection("D. FUNCTIONAL");
        fillInDropdown("iG2h", "6");
        fillInDropdown("iG2j", "4");
        checkScaleTrigger("Activities of Daily Living (ADL) Scale - Short Form","15 out of 16","Higher values indicate greater difficulty in performing activities");
        goToSupplement("CHA");

    }


    public void aDLScale_ShortForm_16_Out_Of_16() {

        fillInRadioButton("FS","1");
        goToNewSection("G. FUNCTIONAL");
        fillInDropdown("iG2b", "6");
        fillInDropdown("iG2f", "6");
        goToSupplement("CHA-FS");
        goToNewSection("D. FUNCTIONAL");
        fillInDropdown("iG2h", "6");
        fillInDropdown("iG2j", "6");
        checkScaleTrigger("Activities of Daily Living (ADL) Scale - Short Form","16 out of 16","High ADL Impairment");
        goToSupplement("CHA");

    }


    public void painScaleTest(){

        painScale_0_Out_Of_4();
        painScale_1_Out_Of_4();
        painScale_2_Out_Of_4();
        painScale_3_Out_Of_4();
        painScale_4_Out_Of_4();
    }


    public void painScale_0_Out_Of_4() {

        goToNewSection("J. HEALTH");
        fillInDropdown("iJ5a", "0");
        fillInDropdown("iJ5b", "0");
        checkScaleTrigger("Pain Scale (PS)","0 out of 4","No pain");
    }

    public void painScale_1_Out_Of_4() {
        fillInDropdown("iJ5a", "1");
        fillInDropdown("iJ5b", "0");
        checkScaleTrigger("Pain Scale (PS)","1 out of 4","Less than daily pain");

    }
    public void painScale_2_Out_Of_4() {
        fillInDropdown("iJ5a", "3");
        fillInDropdown("iJ5b", "0");
        checkScaleTrigger("Pain Scale (PS)","2 out of 4","Daily pain but not severe");

    }

    public void painScale_3_Out_Of_4() {
        fillInDropdown("iJ5a", "3");
        fillInDropdown("iJ5b", "3");
        checkScaleTrigger("Pain Scale (PS)","3 out of 4","Daily severe pain");

    }

    public void painScale_4_Out_Of_4() {
        fillInDropdown("iJ5a", "3");
        fillInDropdown("iJ5b", "4");
        checkScaleTrigger("Pain Scale (PS)","4 out of 4","Daily excruciating pain");

    }

    public void painScaleTest_Old(){
        painScale_0_Out_Of_3();
        painScale_1_Out_Of_3();
        painScale_2_Out_Of_3();
        painScale_3_Out_Of_3();
        painScale_3_Out_Of_3_Old();
    }


    public void painScale_0_Out_Of_3() {

        fillInDropdown("iJ5a", "0");
        fillInDropdown("iJ5b", "0");
        checkScaleTrigger("Pain Scale (PS) - Old Version","0 out of 3","No pain");
    }

    public void painScale_1_Out_Of_3() {
        fillInDropdown("iJ5a", "1");
        fillInDropdown("iJ5b", "0");
        checkScaleTrigger("Pain Scale (PS) - Old Version","1 out of 3","Less than daily pain");

    }
    public void painScale_2_Out_Of_3() {
        fillInDropdown("iJ5a", "3");
        fillInDropdown("iJ5b", "0");
        checkScaleTrigger("Pain Scale (PS) - Old Version","2 out of 3","Daily pain but not severe");

    }

    public void painScale_3_Out_Of_3() {
        fillInDropdown("iJ5a", "3");
        fillInDropdown("iJ5b", "3");
        checkScaleTrigger("Pain Scale (PS) - Old Version","3 out of 3","Daily severe pain");

    }

    public void painScale_3_Out_Of_3_Old() {
        fillInDropdown("iJ5a", "3");
        fillInDropdown("iJ5b", "4");
        checkScaleTrigger("Pain Scale (PS) - Old Version","3 out of 3","Daily severe pain");

    }

    public void dRsScaleTest(){
        dRsScaleTest0_Out_Of_14();
        dRsScaleTest1_Out_Of_14();
        dRsScaleTest2_Out_Of_14();
        dRsScaleTest3_Out_Of_14();
        dRsScaleTest4_Out_Of_14();
        dRsScaleTest5_Out_Of_14();
        dRsScaleTest6_Out_Of_14();
        dRsScaleTest7_Out_Of_14();
        dRsScaleTest8_Out_Of_14();
        dRsScaleTest9_Out_Of_14();
        dRsScaleTest10_Out_Of_14();
        dRsScaleTest11_Out_Of_14();
        dRsScaleTest12_Out_Of_14();
        dRsScaleTest13_Out_Of_14();
        dRsScaleTest14_Out_Of_14();
    }


    public void dRsScaleTest0_Out_Of_14(){
        goToNewSection("E. MOOD");
        fillInDropdown("iE1a", "0");
        fillInDropdown("iE1b", "0");
        fillInDropdown("iE1c", "0");
        fillInDropdown("iE1d", "0");
        fillInDropdown("iE1e", "0");
        fillInDropdown("iE1f", "0");
        fillInDropdown("iE1g", "0");
        checkScaleTrigger("Depression Rating Scale (DRS)","0 out of 14","Scores of 3 or greater indicate major and minor depressive disorders");
    }

    public void dRsScaleTest1_Out_Of_14(){

        fillInDropdown("iE1a", "1");
        fillInDropdown("iE1b", "0");
        fillInDropdown("iE1c", "0");
        fillInDropdown("iE1d", "0");
        fillInDropdown("iE1e", "0");
        fillInDropdown("iE1f", "0");
        fillInDropdown("iE1g", "0");
        checkScaleTrigger("Depression Rating Scale (DRS)","1 out of 14","Scores of 3 or greater indicate major and minor depressive disorders");
    }

    public void dRsScaleTest2_Out_Of_14(){

        fillInDropdown("iE1a", "3");
        fillInDropdown("iE1b", "0");
        fillInDropdown("iE1c", "0");
        fillInDropdown("iE1d", "0");
        fillInDropdown("iE1e", "0");
        fillInDropdown("iE1f", "0");
        fillInDropdown("iE1g", "0");
        checkScaleTrigger("Depression Rating Scale (DRS)","2 out of 14","Scores of 3 or greater indicate major and minor depressive disorders");
    }

    public void dRsScaleTest3_Out_Of_14(){

        fillInDropdown("iE1a", "3");
        fillInDropdown("iE1b", "1");
        fillInDropdown("iE1c", "0");
        fillInDropdown("iE1d", "0");
        fillInDropdown("iE1e", "0");
        fillInDropdown("iE1f", "0");
        fillInDropdown("iE1g", "0");
        checkScaleTrigger("Depression Rating Scale (DRS)","3 out of 14","Scores of 3 or greater indicate major and minor depressive disorders");
    }

    public void dRsScaleTest4_Out_Of_14(){

        fillInDropdown("iE1a", "3");
        fillInDropdown("iE1b", "3");
        fillInDropdown("iE1c", "0");
        fillInDropdown("iE1d", "0");
        fillInDropdown("iE1e", "0");
        fillInDropdown("iE1f", "0");
        fillInDropdown("iE1g", "0");
        checkScaleTrigger("Depression Rating Scale (DRS)","4 out of 14","Scores of 3 or greater indicate major and minor depressive disorders");
    }



    public void dRsScaleTest5_Out_Of_14(){

        fillInDropdown("iE1a", "3");
        fillInDropdown("iE1b", "3");
        fillInDropdown("iE1c", "1");
        fillInDropdown("iE1d", "0");
        fillInDropdown("iE1e", "0");
        fillInDropdown("iE1f", "0");
        fillInDropdown("iE1g", "0");
        checkScaleTrigger("Depression Rating Scale (DRS)","5 out of 14","Scores of 3 or greater indicate major and minor depressive disorders");
    }


    public void dRsScaleTest6_Out_Of_14(){

        fillInDropdown("iE1a", "3");
        fillInDropdown("iE1b", "3");
        fillInDropdown("iE1c", "3");
        fillInDropdown("iE1d", "0");
        fillInDropdown("iE1e", "0");
        fillInDropdown("iE1f", "0");
        fillInDropdown("iE1g", "0");
        checkScaleTrigger("Depression Rating Scale (DRS)","6 out of 14","Scores of 3 or greater indicate major and minor depressive disorders");
    }


    public void dRsScaleTest7_Out_Of_14(){

        fillInDropdown("iE1a", "3");
        fillInDropdown("iE1b", "3");
        fillInDropdown("iE1c", "3");
        fillInDropdown("iE1d", "1");
        fillInDropdown("iE1e", "0");
        fillInDropdown("iE1f", "0");
        fillInDropdown("iE1g", "0");
        checkScaleTrigger("Depression Rating Scale (DRS)","7 out of 14","Scores of 3 or greater indicate major and minor depressive disorders");
    }

    public void dRsScaleTest8_Out_Of_14(){

        fillInDropdown("iE1a", "3");
        fillInDropdown("iE1b", "3");
        fillInDropdown("iE1c", "3");
        fillInDropdown("iE1d", "3");
        fillInDropdown("iE1e", "0");
        fillInDropdown("iE1f", "0");
        fillInDropdown("iE1g", "0");
        checkScaleTrigger("Depression Rating Scale (DRS)","8 out of 14","Scores of 3 or greater indicate major and minor depressive disorders");
    }
    public void dRsScaleTest9_Out_Of_14(){

        fillInDropdown("iE1a", "3");
        fillInDropdown("iE1b", "3");
        fillInDropdown("iE1c", "3");
        fillInDropdown("iE1d", "3");
        fillInDropdown("iE1e", "1");
        fillInDropdown("iE1f", "0");
        fillInDropdown("iE1g", "0");
        checkScaleTrigger("Depression Rating Scale (DRS)","9 out of 14","Scores of 3 or greater indicate major and minor depressive disorders");
    }
    public void dRsScaleTest10_Out_Of_14(){

        fillInDropdown("iE1a", "3");
        fillInDropdown("iE1b", "3");
        fillInDropdown("iE1c", "3");
        fillInDropdown("iE1d", "3");
        fillInDropdown("iE1e", "3");
        fillInDropdown("iE1f", "0");
        fillInDropdown("iE1g", "0");
        checkScaleTrigger("Depression Rating Scale (DRS)","10 out of 14","Scores of 3 or greater indicate major and minor depressive disorders");
    }

    public void dRsScaleTest11_Out_Of_14(){

        fillInDropdown("iE1a", "3");
        fillInDropdown("iE1b", "3");
        fillInDropdown("iE1c", "3");
        fillInDropdown("iE1d", "3");
        fillInDropdown("iE1e", "3");
        fillInDropdown("iE1f", "1");
        fillInDropdown("iE1g", "0");
        checkScaleTrigger("Depression Rating Scale (DRS)","11 out of 14","Scores of 3 or greater indicate major and minor depressive disorders");
    }

    public void dRsScaleTest12_Out_Of_14(){

        fillInDropdown("iE1a", "3");
        fillInDropdown("iE1b", "3");
        fillInDropdown("iE1c", "3");
        fillInDropdown("iE1d", "3");
        fillInDropdown("iE1e", "3");
        fillInDropdown("iE1f", "3");
        fillInDropdown("iE1g", "0");
        checkScaleTrigger("Depression Rating Scale (DRS)","12 out of 14","Scores of 3 or greater indicate major and minor depressive disorders");
    }

    public void dRsScaleTest13_Out_Of_14(){

        fillInDropdown("iE1a", "3");
        fillInDropdown("iE1b", "3");
        fillInDropdown("iE1c", "3");
        fillInDropdown("iE1d", "3");
        fillInDropdown("iE1e", "3");
        fillInDropdown("iE1f", "3");
        fillInDropdown("iE1g", "1");
        checkScaleTrigger("Depression Rating Scale (DRS)","13 out of 14","Scores of 3 or greater indicate major and minor depressive disorders");
    }

    public void dRsScaleTest14_Out_Of_14(){

        fillInDropdown("iE1a", "3");
        fillInDropdown("iE1b", "3");
        fillInDropdown("iE1c", "3");
        fillInDropdown("iE1d", "3");
        fillInDropdown("iE1e", "3");
        fillInDropdown("iE1f", "3");
        fillInDropdown("iE1g", "3");
        checkScaleTrigger("Depression Rating Scale (DRS)","14 out of 14","Scores of 3 or greater indicate major and minor depressive disorders");
    }

    public void formulasTestScales () {

        communicationScaleTest();
        aDLScale_ShortFormTest_SmallSet();
        aDLScale_ShortFormTest_Long();
        painScaleTest();
        painScaleTest_Old();
        dRsScaleTest();
    }

    // -----------------------------------Caps------------------------------------------------------

    public void formulasTestCaps() throws InterruptedException {
        behaviorCapTest();
        deliriumCapTest();
        cardioRespiratoryCapTest();
        pressureUlcerCapTest();
        bowelConditionsCapTest();
        cognitiveLossCapTest();
        communicationCapTest();
        dehydrationCapTest();
    }

    public void behaviorCapTest() {
        testClass.log("Start test of Behavior Cap");
        testClass.log("Small Set");
        behaviorCap_0();
        behaviorCap_1();
        behaviorCap_2();

    }

    public void behaviorCap_0() {
        fillInRadioButton("FS", "1");
        goToSupplement("CHA-FS");
        goToNewSection("C. MOOD");
        fillInDropdown("iE3a", "0");
        fillInDropdown("iE3b", "1");
        fillInDropdown("iE3c", "0");
        fillInDropdown("iE3d", "1");
        fillInDropdown("iE3e", "0");
        fillInDropdown("iE3f", "1");
        checkCapTrigger("Behavior CAP", "0", "Not triggered");
    }

    public void behaviorCap_1() {
        fillInDropdown("iE3a", "2");
        fillInDropdown("iE3b", "1");
        fillInDropdown("iE3c", "0");
        fillInDropdown("iE3d", "1");
        fillInDropdown("iE3e", "0");
        fillInDropdown("iE3f", "1");
        checkCapTrigger("Behavior CAP", "1", "Triggered - prevent almost daily behavior");
    }

    public void behaviorCap_2() {
        fillInDropdown("iE3a", "2");
        fillInDropdown("iE3b", "3");
        fillInDropdown("iE3c", "0");
        fillInDropdown("iE3d", "1");
        fillInDropdown("iE3e", "0");
        fillInDropdown("iE3f", "1");
        checkCapTrigger("Behavior CAP", "2", "Triggered - reduce daily behavior");
    }

    public void deliriumCapTest() {
        testClass.log("Start test of Delirium Cap");
        testClass.log("Small Set");
        deliriumCap_0();
        deliriumCap_1();
    }

    public void deliriumCap_0() {
        goToNewSection("B. COGNITION");
        fillInDropdown("iC3a", "0");
        fillInDropdown("iC3b", "0");
        fillInDropdown("iC3c", "0");
        fillInRadioButton("iC4", "0");
        checkCapTrigger("DELIRIUM CAP", "0", "Not triggered");
    }

    public void deliriumCap_1() {
        fillInDropdown("iC3a", "0");
        fillInDropdown("iC3b", "2");
        fillInDropdown("iC3c", "0");
        fillInRadioButton("iC4", "0");
        checkCapTrigger("DELIRIUM CAP", "1", "Triggered");
    }

    public void cardioRespiratoryCapTest() {
        testClass.log("Start test of Cardio Respiratory Cap");
        testClass.log("Small Set");
        cardioRespiratoryCap_0();
        cardioRespiratoryCap_1();
    }

    public void cardioRespiratoryCap_0() {
        goToSupplement("CHA");
        goToNewSection("J. HEALTH");
        fillInDropdown("iJ2c", "0");
        fillInDropdown("iJ2e", "0");
        fillInDropdown("iJ3", "0");
        checkCapTrigger("Cardiorespiratory Conditions CAP", "0", "Not triggered");
    }

    public void cardioRespiratoryCap_1() {
        fillInDropdown("iJ2c", "0");
        fillInDropdown("iJ2e", "2");
        fillInDropdown("iJ3", "0");
        checkCapTrigger("Cardiorespiratory Conditions CAP", "1", "Triggered");
    }

    public void pressureUlcerCapTest() {
        testClass.log("Start test of Pressure Ulcer Cap");
        testClass.log("Full Set");
        pressureUlcerCap_0();
        pressureUlcerCap_1();
        pressureUlcerCap_2();
        pressureUlcerCap_3();
    }

    public void pressureUlcerCap_0() {
        goToSupplement("CHA-FS");
        goToNewSection("D. FUNCTIONAL");
        fillInDropdown("iG2g", "0");
        fillInDropdown("iG2i", "0");
        goToNewSection("E. CONTINENCE");
        fillInDropdown("iH2", "0");
        goToNewSection("I. SKIN");
        fillInDropdown("iL1", "0");
        fillInRadioButton("iL2", "0");
        fillInRadioButton("iL3", "0");
        goToNewSection("K. TREATMENTS");
        fillInDropdown("iN2k", "0");
        goToSupplement("CHA");
        goToNewSection("H. CONTINENCE");
        fillInDropdown("iH1", "0");
        checkCapTrigger("Pressure Ulcer CAP", "0", "Not Triggered");
    }

    public void pressureUlcerCap_1() {
        goToSupplement("CHA-FS");
        goToNewSection("D. FUNCTIONAL");
        fillInDropdown("iG2g", "0");
        fillInDropdown("iG2i", "0");
        goToNewSection("E. CONTINENCE");
        fillInDropdown("iH2", "0");
        goToNewSection("I. SKIN");
        fillInDropdown("iL1", "2");
        fillInRadioButton("iL2", "0");
        fillInRadioButton("iL3", "0");
        goToNewSection("K. TREATMENTS");
        fillInDropdown("iN2k", "0");
        goToSupplement("CHA");
        goToNewSection("H. CONTINENCE");
        fillInDropdown("iH1", "0");
        checkCapTrigger("Pressure Ulcer CAP", "1", "Triggered - Has Stage 2 Ulcer");
    }

    public void pressureUlcerCap_2() {
        goToSupplement("CHA-FS");
        goToNewSection("D. FUNCTIONAL");
        fillInDropdown("iG2g", "0");
        fillInDropdown("iG2i", "0");
        goToNewSection("E. CONTINENCE");
        fillInDropdown("iH2", "0");
        goToNewSection("I. SKIN");
        fillInDropdown("iL1", "1");
        fillInRadioButton("iL2", "0");
        fillInRadioButton("iL3", "0");
        goToNewSection("K. TREATMENTS");
        fillInDropdown("iN2k", "0");
        goToSupplement("CHA");
        goToNewSection("H. CONTINENCE");
        fillInDropdown("iH1", "0");
        checkCapTrigger("Pressure Ulcer CAP", "2", "Triggered - At Risk, has Stage 1 Ulcer");
    }

    public void pressureUlcerCap_3() {
        goToSupplement("CHA-FS");
        goToNewSection("D. FUNCTIONAL");
        fillInDropdown("iG2g", "6");
        fillInDropdown("iG2i", "0");
        goToNewSection("E. CONTINENCE");
        fillInDropdown("iH2", "2");
        goToNewSection("I. SKIN");
        fillInDropdown("iL1", "0");
        fillInRadioButton("iL2", "0");
        fillInRadioButton("iL3", "0");
        goToNewSection("K. TREATMENTS");
        fillInDropdown("iN2k", "0");
        goToSupplement("CHA");
        goToNewSection("H. CONTINENCE");
        fillInDropdown("iH1", "0");
        checkCapTrigger("Pressure Ulcer CAP", "3", "Triggered - At Risk, No Ulcer Now");
    }

    public void bowelConditionsCapTest() {
        testClass.log("Start test of Bowel Conditions Cap");
        testClass.log("Full Set");
        bowelConditionsCap_0();
        bowelConditionsCap_1();
        bowelConditionsCap_2();
    }

    public void bowelConditionsCap_0() {
        goToNewSection("C. COGNITION");
        fillInDropdown("iC1", "0");
        goToNewSection("H. CONTINENCE");
        fillInDropdown("iH1", "0");
        goToNewSection("I. DIAGNOSES");
        fillInDropdown("iI1a", "0");
        goToSupplement("CHA-FS");
        goToNewSection("B. COGNITION");
        fillInDropdown("iC3a", "0");
        fillInDropdown("iC3b", "0");
        fillInDropdown("iC3c", "0");
        fillInRadioButton("iC4", "0");
        goToNewSection("D. FUNCTIONAL");
        fillInDropdown("iG2h", "0");
        fillInDropdown("iG2i", "0");
        fillInDropdown("iG2j", "0");
        fillInRadioButton("iG7b", "0");
        goToNewSection("E. CONTINENCE");
        fillInDropdown("iH3", "0");
        goToNewSection("F. DIAGNOSES");
        fillInDropdown("iI1q", "0");
        goToNewSection("O. DISCHARGE");
        fillInRadioButton("iR2", "0");
        goToSupplement("CHA");
        checkCapTrigger("Bowel Conditions CAP", "0", "Not triggered");
    }

    public void bowelConditionsCap_1() {
        goToNewSection("C. COGNITION");
        fillInDropdown("iC1", "0");
        goToNewSection("H. CONTINENCE");
        fillInDropdown("iH1", "0");
        goToNewSection("I. DIAGNOSES");
        fillInDropdown("iI1a", "0");
        goToSupplement("CHA-FS");
        goToNewSection("B. COGNITION");
        fillInDropdown("iC3a", "2");
        fillInDropdown("iC3b", "2");
        fillInDropdown("iC3c", "0");
        fillInRadioButton("iC4", "0");
        goToNewSection("D. FUNCTIONAL");
        fillInDropdown("iG2h", "0");
        fillInDropdown("iG2i", "0");
        fillInDropdown("iG2j", "0");
        fillInRadioButton("iG7b", "0");
        goToNewSection("E. CONTINENCE");
        fillInDropdown("iH3", "1");
        goToNewSection("F. DIAGNOSES");
        fillInDropdown("iI1q", "0");
        goToNewSection("O. DISCHARGE");
        fillInRadioButton("iR2", "0");
        goToSupplement("CHA");
        checkCapTrigger("Bowel Conditions CAP", "1", "Triggered - risk of decline");
    }

    public void bowelConditionsCap_2() {
        goToNewSection("C. COGNITION");
        fillInDropdown("iC1", "0");
        goToNewSection("H. CONTINENCE");
        fillInDropdown("iH1", "0");
        goToNewSection("I. DIAGNOSES");
        fillInDropdown("iI1a", "0");
        goToSupplement("CHA-FS");
        goToNewSection("B. COGNITION");
        fillInDropdown("iC3a", "2");
        fillInDropdown("iC3b", "0");
        fillInDropdown("iC3c", "0");
        fillInRadioButton("iC4", "0");
        goToNewSection("D. FUNCTIONAL");
        fillInDropdown("iG2h", "0");
        fillInDropdown("iG2i", "0");
        fillInDropdown("iG2j", "0");
        fillInRadioButton("iG7b", "0");
        goToNewSection("E. CONTINENCE");
        fillInDropdown("iH3", "2");
        goToNewSection("F. DIAGNOSES");
        fillInDropdown("iI1q", "0");
        goToNewSection("O. DISCHARGE");
        fillInRadioButton("iR2", "0");
        goToSupplement("CHA");
        checkCapTrigger("Bowel Conditions CAP", "2", "Triggered - facilitate improvement");
    }

    public void cognitiveLossCapTest() {
        testClass.log("Start test of Cognitive Loss Cap");
        testClass.log("Full Set");
        cognitiveLossCap_0();
        cognitiveLossCap_2();
    }

    public void cognitiveLossCap_0() {
        goToNewSection("C. COGNITION");
        fillInDropdown("iC1", "0");
        fillInDropdown("iC5", "0");
        fillInRadioButton("iC2a", "0");
        goToNewSection("D. COMMUNICATION");
        fillInDropdown("iD1", "0");
        fillInDropdown("iD2", "0");
        goToNewSection("E. MOOD");
        fillInDropdown("iE1e", "0");
        goToNewSection("I. DIAGNOSES");
        fillInDropdown("iI1c", "0");
        fillInDropdown("iI1d", "0");
        goToNewSection("J. HEALTH");
        fillInRadioButton("iJ6c", "0");
        goToSupplement("CHA-FS");
        goToNewSection("B. COGNITION");
        fillInDropdown("iC3a", "0");
        fillInDropdown("iC3b", "0");
        fillInDropdown("iC3c", "0");
        fillInRadioButton("iC4", "0");
        goToNewSection("C. MOOD");
        fillInDropdown("iE1h", "0");
        fillInDropdown("iE3a", "0");
        fillInDropdown("iE3c", "0");
        goToNewSection("D. FUNCTIONAL");
        fillInRadioButton("iG7b", "0");
        fillInDropdown("iG2j", "0");
        goToNewSection("O. DISCHARGE");
        fillInRadioButton("iR2", "0");
        goToSupplement("CHA");
        checkCapTrigger("Cognitive Loss CAP", "0", "Not triggered");
    }

    public void cognitiveLossCap_2() {
        goToNewSection("C. COGNITION");
        fillInDropdown("iC1", "0");
        fillInDropdown("iC5", "0");
        fillInRadioButton("iC2a", "0");
        goToNewSection("D. COMMUNICATION");
        fillInDropdown("iD1", "0");
        fillInDropdown("iD2", "0");
        goToNewSection("E. MOOD");
        fillInDropdown("iE1e", "0");
        goToNewSection("I. DIAGNOSES");
        fillInDropdown("iI1c", "0");
        fillInDropdown("iI1d", "0");
        goToNewSection("J. HEALTH");
        fillInRadioButton("iJ6c", "0");
        goToSupplement("CHA-FS");
        goToNewSection("B. COGNITION");
        fillInDropdown("iC3a", "2");
        fillInDropdown("iC3b", "2");
        fillInDropdown("iC3c", "2");
        fillInRadioButton("iC4", "0");
        goToNewSection("C. MOOD");
        fillInDropdown("iE1h", "0");
        fillInDropdown("iE3a", "0");
        fillInDropdown("iE3c", "0");
        goToNewSection("D. FUNCTIONAL");
        fillInRadioButton("iG7b", "0");
        fillInDropdown("iG2j", "0");
        goToNewSection("O. DISCHARGE");
        fillInRadioButton("iR2", "0");
        goToSupplement("CHA");
        checkCapTrigger("Cognitive Loss CAP", "2", "Triggered - prevent decline");
    }

    public void communicationCapTest() {
        testClass.log("Start test of Communication Cap");
        testClass.log("Small Set");
        communicationCap_0();
        communicationCap_1();
        communicationCap_2();
    }

    public void communicationCap_0() {
        goToNewSection("C. COGNITION");
        fillInDropdown("iC1", "0");
        goToNewSection("D. COMMUNICATION");
        fillInDropdown("iD1", "0");
        fillInDropdown("iD2", "0");
        checkCapTrigger("Communication CAP", "0", "Not triggered");
    }

    public void communicationCap_1() {
        goToNewSection("C. COGNITION");
        fillInDropdown("iC1", "1");
        goToNewSection("D. COMMUNICATION");
        fillInDropdown("iD1", "4");
        fillInDropdown("iD2", "3");
        checkCapTrigger("Communication CAP", "1", "Triggered - potential for improvement");
    }

    public void communicationCap_2() {
        goToNewSection("C. COGNITION");
        fillInDropdown("iC1", "2");
        goToNewSection("D. COMMUNICATION");
        fillInDropdown("iD1", "2");
        fillInDropdown("iD2", "0");
        checkCapTrigger("Communication CAP", "2", "Triggered - risk of decline");
    }

    public void dehydrationCapTest() {
        testClass.log("Start test of Dehydration Cap");
        testClass.log("Big Set");
        dehydrationCap_0();
        dehydrationCap_1();
        dehydrationCap_2();
    }

    public void dehydrationCap_0() {
        goToNewSection("J. HEALTH");
        fillInDropdown("iJ2c", "0");
        fillInDropdown("iJ2k", "0");
        fillInDropdown("iJ2l", "0");
        fillInDropdown("iJ2n", "0");
        goToNewSection("K. NUTRITIONAL");
        fillInRadioButton("iK2a", "0");
        fillInRadioButton("iK2c", "0");
        fillInRadioButton("iK2b", "0");
        goToSupplement("CHA-FS");
        goToNewSection("B. COGNITION");
        fillInDropdown("iC3a", "0");
        fillInDropdown("iC3b", "0");
        fillInDropdown("iC3c", "0");
        fillInRadioButton("iC4", "0");
        goToNewSection("G. HEALTH");
        fillInDropdown("iJ2q", "0");
        goToSupplement("CHA");
        checkCapTrigger("Dehydration CAP", "0", "Not triggered");
    }

    public void dehydrationCap_1() {
        goToNewSection("J. HEALTH");
        fillInDropdown("iJ2c", "0");
        fillInDropdown("iJ2k", "0");
        fillInDropdown("iJ2l", "0");
        fillInDropdown("iJ2n", "0");
        goToNewSection("K. NUTRITIONAL");
        fillInRadioButton("iK2a", "0");
        fillInRadioButton("iK2c", "0");
        fillInRadioButton("iK2b", "1");
        goToSupplement("CHA-FS");
        goToNewSection("B. COGNITION");
        fillInDropdown("iC3a", "0");
        fillInDropdown("iC3b", "0");
        fillInDropdown("iC3c", "0");
        fillInRadioButton("iC4", "0");
        goToNewSection("G. HEALTH");
        fillInDropdown("iJ2q", "0");
        goToSupplement("CHA");
        checkCapTrigger("Dehydration CAP", "1", "Triggered - low level");
    }

    public void dehydrationCap_2() {
        goToNewSection("J. HEALTH");
        fillInDropdown("iJ2c", "1");
        fillInDropdown("iJ2k", "0");
        fillInDropdown("iJ2l", "0");
        fillInDropdown("iJ2n", "0");
        goToNewSection("K. NUTRITIONAL");
        fillInRadioButton("iK2a", "0");
        fillInRadioButton("iK2c", "0");
        fillInRadioButton("iK2b", "1");
        goToSupplement("CHA-FS");
        goToNewSection("B. COGNITION");
        fillInDropdown("iC3a", "0");
        fillInDropdown("iC3b", "0");
        fillInDropdown("iC3c", "0");
        fillInRadioButton("iC4", "0");
        goToNewSection("G. HEALTH");
        fillInDropdown("iJ2q", "0");
        goToSupplement("CHA");
        checkCapTrigger("Dehydration CAP", "2", "Triggered - high level");
    }
}
