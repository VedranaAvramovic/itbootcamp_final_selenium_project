package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
        getNameInput().sendKeys(Keys.chord(Keys.CONTROL, "a"),cityName);
    }
    public WebElement getSaveButton () {
        return driver.findElement(By.className("btnSave"));
    }
    public void clickOnSaveButton () {
        getSaveButton().click();
    }
    public WebElement getSearchInput () {
        return driver.findElement(By.id("search"));
    }
    public void clearAndTypeInSearch (String city) {
        getSearchInput().sendKeys(city);
    }
    public WebElement getEditButtonFromTableRow (int row) {
        return driver.findElements(By.id("edit")).get(row-1);
    }
    public void waitForNumberOfTableRows(int numberOfRows){
        wait
                .withMessage("Number of rows should be " + numberOfRows)
                .until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("tbody > tr"), numberOfRows));
    }
    public void clickOnEditButtonFromTableRow(int row){
        getEditButtonFromTableRow(row).click();
    }
}
