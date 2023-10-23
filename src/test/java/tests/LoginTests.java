package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import retry.RetryAnalyzer;

public class LoginTests extends BasicTest{
    @Test(priority = 1, retryAnalyzer = RetryAnalyzer.class)
    public void visitsTheLoginPage () {
        navPage.clickOnLanguagesButton();
        navPage.clickOnEnLanguageButton();
        navPage.clickOnLoginButton();

        Assert.assertTrue(pageUrl.isLoginPage(),
                "Should be redirected to the Login page.");
    }
}
