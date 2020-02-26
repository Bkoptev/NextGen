package com.qa.pom.test;

import com.qa.pom.base.BaseTest;
import com.qa.pom.pages.ChaChaFsChamhFormulas;
import com.qa.pom.pages.Dashboard;
import com.qa.pom.pages.Login;
import com.qa.pom.pages.Pathways;
import java.io.IOException;
import org.junit.Test;

public class AcutenetTestChaChaFsScales extends BaseTest {

    @Test
    public void testOpenSiteAndTestScales() throws IOException, InterruptedException {

        Login login = openSite();
        log("Click Submit and login ");
        Dashboard dash = login.logIn();
        log("On Dashboard");
        Pathways path = dash.existedPatient();
        log("On Pathways");
        ChaChaFsChamhFormulas cha = path.chooseInterRaiChaChafsChamh();
        cha.formulasTestScales();

        Thread.sleep(20000);
        closeSite();
    }
}
