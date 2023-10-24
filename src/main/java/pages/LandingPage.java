package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage extends BasicPage{
    public String expectedEsHeaderText = "Página de aterrizaje";
    public LandingPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getLandingPageHeader () {
        return driver.findElement(By.tagName("h1"));
    }
    public String getHeaderText () {
        return getLandingPageHeader().getText();
    }
}
