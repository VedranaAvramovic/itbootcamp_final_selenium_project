package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import retry.RetryAnalyzer;

public class AdminCitiesTests extends BasicTest{

    @Test(priority = 1, retryAnalyzer = RetryAnalyzer.class)
    public void visitsTheAdminCitiesPageAndListCities () {
        String email = "admin@admin.com";
        String password = "12345";

        navPage.clickOnLoginButton();
        loginPage.login(email,password);
        navPage.clickOnAdminButton();
        navPage.clickOnAdminCitiesButton();

        Assert.assertTrue(pageUrl.isAdminCitiesPage(),
                "Should be redirected to the Admin/Cities page.");
    }
}
