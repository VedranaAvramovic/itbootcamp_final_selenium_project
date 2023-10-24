package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavPage extends BasicPage{
    public NavPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getLanguagesButton () {
        return driver.findElement(By.className("btnLocaleActivation"));
    }
    public void clickOnLanguagesButton () {
        getLanguagesButton().click();
    }
    public WebElement getEnLanguageButton () {
        return driver.findElement(By.className("btnEN"));
    }
    public void clickOnEnLanguageButton () {
        getEnLanguageButton().click();
    }
    public WebElement getLoginButton () {
        return driver.findElement(By.cssSelector("[href='/login'].btnLogin"));
    }
    public void clickOnLoginButton () {
        getLoginButton().click();
    }
    public WebElement getLogoutButton () {
        return driver.findElement(By.className("btnLogout"));
    }
    public void clickOnLogoutButton () {
        getLogoutButton().click();
    }
    public WebElement getSignUpButton () {
        return driver.findElement(By.cssSelector("[href='/signup'].btnLogin"));
    }
    public void clickOnSignUpButton () {
        getSignUpButton().click();
    }
    public WebElement getAdminButton () {
        return driver.findElement(By.className("btnAdmin"));
    }
    public void clickOnAdminButton () {
        getAdminButton().click();
    }
    public WebElement getAdminCitiesButton () {
        return driver.findElement(By.className("btnAdminCities"));
    }
    public void clickOnAdminCitiesButton () {
        getAdminCitiesButton().click();
    }
    public WebElement getEsLanguageButton () {
        return driver.findElement(By.className("btnES"));
    }
    public void clickOnEsLanguageButton () {
        getEsLanguageButton().click();
    }
}
