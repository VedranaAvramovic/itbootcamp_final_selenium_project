package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import retry.RetryAnalyzer;

public class SignupTests extends BasicTest{

    @Test(priority = 1, retryAnalyzer = RetryAnalyzer.class)
    public void visitsTheSignUpPage () {

        navPage.clickOnSignUpButton();

        Assert.assertTrue(pageUrl.isSignUpPage(),
                "Should be redirected to the Sign Up page.");
    }
}