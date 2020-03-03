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
        interRAIChaFsMh.fillElement("FS", "1");
        interRAIChaFsMh.formulaCalculation("CAP_Undernutrition", "All", "InterRAIChaFsMh");
        interRAIChaFsMh.formulaCalculation("SCALE_Communication", "All", "InterRAIChaFsMh");
        Thread.sleep(10000);
        closeSite();
    }
}
