package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import retry.RetryAnalyzer;

public class LocaleTests extends BasicTest {

    @Test(priority = 1, retryAnalyzer = RetryAnalyzer.class)
    public void setLocaleToEs () {
        navPage.clickOnLanguagesButton();
        navPage.clickOnEsLanguageButton();

        Assert.assertEquals(landingPage.getHeaderText(), landingPage.expectedEsHeaderText,
                "Text in header should be " + landingPage.expectedEsHeaderText);
    }
}
