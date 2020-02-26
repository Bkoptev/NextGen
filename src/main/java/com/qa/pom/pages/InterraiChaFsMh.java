package com.qa.pom.pages;

import com.qa.pom.base.BaseTest;
import com.qa.pom.pages.AbstractAssessmentPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InterraiChaFsMh extends AbstractAssessmentPage {

    @FindBy(xpath = "//div[@varname='FS']")
    private WebElement waitForElemUpload;


    /**
     * Constructor
     *
     * @param testClass
     */
    InterraiChaFsMh(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(loadingWrapper);
        testClass.waitTillElementNotVisible(wrapXpath);
        testClass.waitTillElementIsVisible(waitForElemUpload);
    }


    String[][] interraiChaFsMh = {
            {"CHA", "A.", "FS", "MH", "iA1a", "iA1b", "iA1c", "iA1d", "cihiA2a", "iA2", "cihiA2c", "iA3", "iA4", "iA5a", "iA6d", "iA5d", "iA6a", "iA7a", "iA7b", "iA7j", "iA7d", "iA7i", "iA7k", "iA7e", "iA7l", "iA7f", "iA7n", "iA7m", "iA8", "iA9", "iA38a", "iA38b", "iB1a", "iB1", "iA10", "iA11b", "iA12a", "iA12b", "iA12c", "cihiB2", "iA14", "iA15", "iA16", "iA17a", "iA17b", "iA17d", "iA17e", "iA17f", "iA17g", "iA17h", "iA17i", "iA17j", "iA18a", "iA18b", "iA18d", "iA18e", "iA18f", "iA18g", "iA18h", "iA18i", "iA19a", "iA19b", "iA19d", "iA19e", "iA19f", "iA19g", "iA19h", "iA19i", "iA20a", "iA20b", "iA20d", "iA20e", "iA20f", "iA20g", "iA20h", "iA20i", "iA21", "ANotesRule"},
            {"CHA", "B.", "iB2", "iB3h", "iB3i", "iB3j", "iB4", "iB5a", "iB5b", "iB5e", "iB5c", "iB5d", "caB5h", "BNotesRule"},
            {"CHA", "C.", "iC1", "iC2a", "iC5", "CNotesRule"},
            {"CHA", "D.", "iD1", "iD2", "iD3a", "iD4a", "DNotesRule"},
            {"CHA", "E.", "iE1a", "iE1b", "iE1c", "iE1d", "iE1e", "iE1f", "iE1g", "iE1i", "iE1j", "iE2a", "iE2b", "iE2c", "ENotesRule"},
            {"CHA", "F.", "iF1a", "iF1b", "iF1c", "iF1e", "iF1f", "iF1g", "iF1d", "iF2", "iF3", "iF4", "FNotesRule"},
            {"CHA", "G.", "iG1aa", "iG1ab", "iG1ba", "iG1bb", "iG1ca", "iG1cb", "iG1da", "iG1db", "iG1ea", "iG1eb", "iG1fa", "iG1fb", "iG1ga", "iG1gb", "iG1ha", "iG1hb", "iG2a", "iG2b", "iG2c", "iG2d", "iG2e", "iG2f", "iG3", "iG6a", "iG6b", "iG8a2", "iG9a", "iG9b", "GNotesRule"},
            {"CHA", "H.", "iH1", "HNotesRule"},
            {"CHA", "I.", "iI1a", "iI1b", "iI1c", "iI1d", "iI1j", "iI1k", "iI1m", "iI1l", "iI1n", "iI1w", "iI1o", "iI1p", "iI1s", "iI1t", "data-table-i2", "INotesRule"},
            {"CHA", "J.", "iJ1g", "iJ1h", "iJ1i", "iJ2c", "iJ2d", "iJ2e", "iJ2g", "iJ2h", "iJ2i", "iJ2m", "iJ2k", "iJ2l", "iJ2n", "iJ2o", "iJ2p", "iJ3", "iJ4", "iJ5a", "iJ5b", "iJ5c", "iJ5d", "iJ5e", "iJ6a", "iJ6b", "iJ6c", "iJ7", "iJ8a", "iJ8b", "JNotesRule"},
            {"CHA", "K.", "iK2a", "iK2c", "iK2b", "iK2h", "iK2g", "iK2e", "KNotesRule"},
            {"CHA", "L.", "data-table-l1", "iM2", "iM3", "iM14", "iM15", "iM16", "iM17", "iM19a", "iM19b", "iM19c", "iM19d", "iM20", "LNotesRule"},
            {"CHA", "M.", "iN1d", "iN1h", "iN1e", "iN1g", "iN1f", "iN1a", "iN1c", "iN1b", "iN5a", "iN5b", "iN5c", "MNotesRule"},
            {"CHA", "N.", "iF8a", "NNotesRule"},
            {"CHA", "O.", "iQ4", "ONotesRule"},
            {"CHA", "P.", "iT1", "iT2", "PNotesRule"},
            {"CHA", "Q.", "iU1", "iU2", "QNotesRule"},
            {"FS", "A.", "iA1a", "iA1b", "iA1c", "iA1d", "iA5a", "iA6d", "iA5d", "iA6a", "iA9", "iA12b", "iA12c", "iA13", "FSANotesRule"},
            {"FS", "B.", "iC2b", "iC2c", "iC3a", "iC3b", "iC3c", "iC4", "FSBNotesRule"},
            {"FS", "C.", "iE1h", "iE1k", "iE3a", "iE3b", "iE3c", "iE3d", "iE3f", "iE3e", "FSCNotesRule"},
            {"FS", "D.", "iG2g", "iG2h", "iG2i", "iG2j", "iG12", "iG4", "iG5", "iG7a", "iG7b", "FSDNotesRule"},
            {"FS", "E.", "iH2", "iH3", "iH4", "FSENotesRule"},
            {"FS", "F.", "iI1e", "iI1f", "iI1g", "iI1h", "iI1i", "iI1q", "iI1r", "FSFNotesRule"},
            {"FS", "G.", "iJ2a", "iJ2b", "iJ2f", "iJ2j", "iJ2t", "iJ2q", "iJ2r", "iJ2mm", "iJ2s", "FSGNotesRule"},
            {"FS", "H.", "iK1ab", "iK1bb", "iK3", "iK4a", "iK4b", "iK4d", "iK4c", "FSHNotesRule"},
            {"FS", "I.", "iL1", "iL2", "iL3", "iL4", "iL5", "iL6", "iL7", "FSINotesRule"},
            {"FS", "K.", "iN2a", "iN2b", "iN2c", "iN2d", "iN2e", "iN2f", "iN2g", "iN2h", "iN2i", "iN2j", "iN2k", "iN2l", "iN2m", "iN2n", "iN3aa", "iN3ab", "iN3ba", "iN3bb", "iN3ca", "iN3cb", "iN3da", "iN3ea", "iN3eb", "iN3fa", "iN3fb", "iN3ga", "iN3gb", "iN3ha", "iN3hb", "iN4", "FSKNotesRule"},
            {"FS", "L.", "iO1a", "iO1b", "FSLNotesRule"},
            {"FS", "M.", "iP1a1", "iP1a2", "iP1b1", "iP1b2", "iP1c1", "iP1c2", "iP1d1", "iP1d2", "iP2a", "iP2b", "iF7d", "iP3", "FSMNotesRule"},
            {"FS", "N.", "iQ1a", "iQ1b", "iQ1c", "iQ1d", "iQ1e", "iQ2", "iQ3a", "iQ3b", "iQ3c", "FSNNotesRule"},
            {"FS", "O.", "iR1", "iR2", "iR3", "iR4", "iR5", "FSONotesRule"},
            {"FS", "P.", "iU1", "iU2", "FSPNotesRule"},
            {"MH", "A.", "iA1a", "iA1b", "iA1c", "iA1d", "iA5a", "iA5d", "iA6a", "iA9", "MH_A_NotesRule"},
            {"MH", "B.", "iE5", "iV4", "MH_B_NotesRule"},
            {"MH", "C.", "iE1m", "iE1n", "iE1o", "iE1p", "iE1r", "iE1t", "iE1u", "iE1v", "iE1w", "iE1x", "iE1y", "iE1z", "iE1ff", "iE1gg", "MH_C_NotesRule"},
            {"MH", "D.", "iW2", "iW6a", "iW6b", "iW6c", "iW6d", "iW6e", "MH_D_NotesRule"},
            {"MH", "E.", "iX1c", "iX1a", "iX1b", "iX1d", "iX2b", "iX2a", "iB29a", "iB29b", "MH_E_NotesRule"},
            {"MH", "F.", "iE3b", "iE3c", "iE3d", "iE3f", "MH_F_NotesRule"},
            {"MH", "G.", "iY1ac", "iY1al", "iY1am", "iY1an", "iY1ao", "iY1b", "MH_G_NotesRule"},
            {"MH", "H.", "iM5", "iM6", "MH_H_NotesRule"},
            {"MH", "I.", "iF7j", "MH_I_NotesRule"},
            {"MH", "J.", "iU1", "iU2", "MH_J_NotesRule"}
    };
}