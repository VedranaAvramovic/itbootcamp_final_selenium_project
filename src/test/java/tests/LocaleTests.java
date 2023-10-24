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
    @Test (priority = 2, retryAnalyzer = RetryAnalyzer.class)
    public void setLocaleToEn () {
        navPage.clickOnLanguagesButton();
        navPage.clickOnEnLanguageButton();

        Assert.assertEquals(landingPage.getHeaderText(), landingPage.expectedEnHeaderText,
                "Text in header should be " + landingPage.expectedEnHeaderText);
    }
    @Test (priority = 3, retryAnalyzer = RetryAnalyzer.class)
    public void setLocaleToCn () {
        navPage.clickOnLanguagesButton();
        navPage.clickOnCnLanguageButton();

        Assert.assertEquals(landingPage.getHeaderText(), landingPage.expectedCnHeaderText,
                "Text in header should be " + landingPage.expectedCnHeaderText);
    }
    @Test (priority = 4, retryAnalyzer = RetryAnalyzer.class)
    public void setLocaleToFr () {
        navPage.clickOnLanguagesButton();
        navPage.clickOnFrLanguageButton();

        Assert.assertEquals(landingPage.getHeaderText(), landingPage.expectedFrHeaderText,
                "Text in header should be " + landingPage.expectedFrHeaderText);
    }
}
