package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import retry.RetryAnalyzer;

public class AuthRoutesTests extends BasicTest{

    @Test(priority = 1, retryAnalyzer = RetryAnalyzer.class)
    public void forbidsVisitsToHomeUrlIfNotAuthenticated () {
        driver.navigate().to(baseUrl + pageUrl.homePage);

        Assert.assertTrue(pageUrl.isLoginPage(),
                "Should be redirected to the Login page.");
    }
    @Test (priority = 2, retryAnalyzer = RetryAnalyzer.class)
    public void forbidsVisitsToProfileUrlIfNotAuthenticated () {
        driver.navigate().to(baseUrl + pageUrl.profilePage);

        Assert.assertTrue(pageUrl.isLoginPage(),
                "Should be redirected to the Login page.");
    }
    @Test (priority = 3,retryAnalyzer = RetryAnalyzer.class)
    public void forbidsVisitsToAdminCitiesUrlIfNotAuthenticated () {
        driver.navigate().to(baseUrl + pageUrl.adminCitiesPage);

        Assert.assertTrue(pageUrl.isLoginPage(),
                "Should be redirected to the Login page.");
    }
}
