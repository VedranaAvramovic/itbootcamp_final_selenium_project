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
    @Test (priority = 2, retryAnalyzer = RetryAnalyzer.class)
    public void checksInputTypes () {
        navPage.clickOnSignUpButton();

        Assert.assertEquals(signupPage.getEmailInputType(),"email",
                "The attribute type for email field should be 'email'.");

        Assert.assertEquals(signupPage.getPasswordInputType(),"password",
                "The attribute type for password field should be 'password'.");

        Assert.assertEquals(signupPage.getConfirmPasswordInputType(),"password",
                "The attribute type for confirm password field should be 'password'.");
    }
}