package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupPage extends BasicPage{
    public SignupPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getEmailInput() {
        return driver.findElement(By.id("email"));
    }
    public String getEmailInputType() {
        return getEmailInput().getAttribute("type");
    }
    public WebElement getPasswordInput(){
        return driver.findElement(By.id("password"));
    }
    public String getPasswordInputType(){
        return getPasswordInput().getAttribute("type");
    }
    public WebElement getConfirmPasswordInput(){
        return driver.findElement(By.id("confirmPassword"));
    }
    public String getConfirmPasswordInputType(){
        return getConfirmPasswordInput().getAttribute("type");
    }
    public WebElement getNameInput () {
        return driver.findElement(By.id("name"));
    }
    public WebElement getSignMeUp () {
        return driver.findElement(By.cssSelector("button[type='submit']"));
    }
    public void clickOnSignMeUp () {
        getSignMeUp().click();
    }
    public void clearAndTypeName (String name) {
        getNameInput().clear();
        getNameInput().sendKeys(name);
    }
    public void clearAndTypeEmail (String email) {
        getEmailInput().clear();
        getEmailInput().sendKeys(email);
    }
    public void clearAndTypePassword (String password) {
        getPasswordInput().clear();
        getPasswordInput().sendKeys(password);
    }
    public void clearAndTypeConfirmPassword (String confirmPassword) {
        getConfirmPasswordInput().clear();
        getConfirmPasswordInput().sendKeys(confirmPassword);
    }
    public void signMeUp (String name, String email, String password, String confirmPassword) {
        clearAndTypeName(name);
        clearAndTypeEmail(email);
        clearAndTypePassword(password);
        clearAndTypeConfirmPassword(confirmPassword);

        clickOnSignMeUp();
    }
}
