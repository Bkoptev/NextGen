package com.qa.pom.test;

import com.qa.pom.base.BaseTest;
import com.qa.pom.pages.Dashboard;
import com.qa.pom.pages.InterRAIChaFsMh;
import com.qa.pom.pages.Login;
import com.qa.pom.pages.Pathways;
import org.json.simple.parser.ParseException;
import org.junit.Test;

import java.io.IOException;

public class AcutenetTestChaChaFSFormulasCAPs extends BaseTest {

    @Test
    public void testOpenSiteAndTestCAPs() throws IOException, InterruptedException, ParseException {
        Login login = openSite();
        log("Click Submit and login ");
        Dashboard dashboard = login.logIn();
        log("On Dashboard");
        Pathways pathways = dashboard.existedPatient();
        log("On Pathways");
        InterRAIChaFsMh interRAIChaFsMh = pathways.chooseInterraiChaFsMh();
        interRAIChaFsMh.formulaCalculation("CAP_Behavior", "All");
        interRAIChaFsMh.formulaCalculation("CAP_BowelConditions_BigSet", "All");
        interRAIChaFsMh.formulaCalculation("CAP_CardioRespiratory", "All");
        interRAIChaFsMh.formulaCalculation("CAP_CodnitiveLoss_BigSet", "All");
        interRAIChaFsMh.formulaCalculation("CAP_Communication", "All");
        interRAIChaFsMh.formulaCalculation("CAP_Dehydration_BigSet", "All");
        interRAIChaFsMh.formulaCalculation("CAP_Delirium", "All");
        interRAIChaFsMh.formulaCalculation("CAP_PressureUlcer_BigSet", "All");
        interRAIChaFsMh.formulaCalculation("CAP_Undernutrition", "All");
        interRAIChaFsMh.formulaCalculation("SCALE_ADL_Short", "All");
        interRAIChaFsMh.formulaCalculation("SCALE_ADL_Short_BigSet", "All");
        interRAIChaFsMh.formulaCalculation("SCALE_BMI", "All");
        interRAIChaFsMh.formulaCalculation("SCALE_Communication", "All");
        interRAIChaFsMh.formulaCalculation("SCALE_DRS", "All");
        interRAIChaFsMh.formulaCalculation("SCALE_Pain", "All");
        interRAIChaFsMh.formulaCalculation("SCALE_Pain_Old", "All");
        closeSite();
    }
}
