package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasicPage{
    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public WebElement getEmailInput () {
        return driver.findElement(By.id("email"));
    }
    public String getEmailInputType () {
        return getEmailInput().getAttribute("type");
    }
    public WebElement getPasswordInput () {
        return driver.findElement(By.id("password"));
    }
    public String getPasswordInputType () {
        return getPasswordInput().getAttribute("type");
    }
    public WebElement getLoginButton () {
        return driver.findElement(By.cssSelector("button[type='submit']"));
    }
    public void clickOnLoginButton () {
        getLoginButton().click();
    }
    public void clearAndTypeEmail (String email) {
        getEmailInput().clear();
        getEmailInput().sendKeys(email);
    }
    public void clearAndTypePassword (String password) {
        getPasswordInput().clear();
        getPasswordInput().sendKeys(password);
    }
    public void login (String email, String password) {
        clearAndTypeEmail(email);
        clearAndTypePassword(password);
        clickOnLoginButton();
    }
}
