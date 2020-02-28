package com.qa.pom.test;

import com.qa.pom.base.BaseTest;
import com.qa.pom.pages.Dashboard;
import com.qa.pom.pages.InterraiChaFsMh;
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
        InterraiChaFsMh interraiChaFsMh = pathways.chooseInterraiChaFsMh();
        interraiChaFsMh.fillElement("FS","1");
        interraiChaFsMh.formulaCalculation("CAP_Undernutrition", "True", interraiChaFsMh.interraiChaFsMh);
        Thread.sleep(10000);
        //closeSite();
    }
}
