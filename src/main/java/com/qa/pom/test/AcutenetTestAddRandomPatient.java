package com.qa.pom.test;

import com.qa.pom.base.BaseTest;
import com.qa.pom.pages.*;
import java.io.IOException;
import org.junit.Test;

public class AcutenetTestAddRandomPatient extends BaseTest {

    /** Open site and log in. Verify name. Log put and check the log in page. */
    @Test
    public void testOpenSiteAndClickPythonLinkTest() throws IOException, InterruptedException {

        // Initialize HomePage
        Login login = openSite();
        log("Click Submit and login ");
        Dashboard dash = login.logIn();
        log("On Dashboard");
        AddnewClient newclient = dash.addnewClientclick();
        log("Add new client");
        Pathways path = newclient.FillinNewpatientInformation();

        Thread.sleep(6000);
        closeSite();
    }
}
