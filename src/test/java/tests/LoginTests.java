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
    @Test (priority = 2, retryAnalyzer = RetryAnalyzer.class)
    public void checksInputTypes () {
        navPage.clickOnLoginButton();

        Assert.assertEquals(loginPage.getEmailInputType(), "email",
                "The attribute type for email field should be 'email'.");

        Assert.assertEquals(loginPage.getPasswordInputType(), "password",
                "The attribute type for email field should be 'password'.");
    }
}
