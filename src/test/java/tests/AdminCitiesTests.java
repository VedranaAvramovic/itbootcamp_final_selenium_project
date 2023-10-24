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
    @Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
    public void checksInputTypesForCreateOrEditNewCity () {
        navPage.clickOnAdminButton();
        navPage.clickOnAdminCitiesButton();

        citiesPage.clickOnNewItemButton();
        citiesPage.waitForCreateOrEditDialog();

        Assert.assertEquals(citiesPage.getNameInputType(), "text",
                "The attribute type for name field should be 'text'.");
    }
    @Test (priority = 3, retryAnalyzer = RetryAnalyzer.class)
    public void createNewCity () {
        String cityName = "Vedrana Avramovic's city";

        navPage.clickOnAdminButton();
        navPage.clickOnAdminCitiesButton();
        citiesPage.clickOnNewItemButton();
        citiesPage.waitForCreateOrEditDialog();

        citiesPage.clearAndTypeName(cityName);
        citiesPage.clickOnSaveButton();

        messagePopUpPage.waitForSuccessfullyPopUpMessage();
        Assert.assertTrue(messagePopUpPage.getSuccessfullyPopUpMessageText()
                        .contains("Saved successfully"),
                "Success pop-up message should contain 'Saved successfully'");
    }
}
