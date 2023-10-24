package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CitiesPage extends BasicPage{
    public CitiesPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getNewItemButton () {
        return driver.findElement(By.className("btnNewItem"));
    }
    public void clickOnNewItemButton () {
        getNewItemButton().click();
    }
    public WebElement getCreateNewItemDialog () {
        return driver.findElement(By.className("v-dialog--active"));
    }
    public void waitForCreateOrEditDialog () {
        wait
                .withMessage("Create new item dialog should be visible.")
                .until(ExpectedConditions.visibilityOf(getCreateNewItemDialog()));
    }
    public WebElement getNameInput () {
        return driver.findElement(By.id("name"));
    }
    public String getNameInputType () {
        return getNameInput().getAttribute("type");
    }
    public void clearAndTypeName (String cityName) {
        getNameInput().clear();
        getNameInput().sendKeys(cityName);
    }
    public WebElement getSaveButton () {
        return driver.findElement(By.className("btnSave"));
    }
    public void clickOnSaveButton () {
        getSaveButton().click();
    }
}
