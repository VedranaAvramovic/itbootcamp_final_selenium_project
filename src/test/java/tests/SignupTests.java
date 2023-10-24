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
    @Test (priority = 3, retryAnalyzer = RetryAnalyzer.class)
    public void displaysErrorsWhenUserAlreadyExists () {
        String name = "Another User";
        String email = "admin@admin.com";
        String password = "12345";
        String confirmPassword = "12345";

        navPage.clickOnSignUpButton();
        Assert.assertTrue(pageUrl.isSignUpPage(),
                "Should be redirected to the Sign Up page.");

        signupPage.signMeUp(name,email,password,confirmPassword);

        messagePopUpPage.waitForErrorPopUpToBeVisible();
        Assert.assertEquals(messagePopUpPage.getErrorMessageText(), "E-mail already exists",
                "Error message should be 'E-mail already exists'.");

        Assert.assertTrue(pageUrl.isSignUpPage(),
                "Should be redirected to the Sign Up page.");
    }
}