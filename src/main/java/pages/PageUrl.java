package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageUrl extends BasicPage{
    public String loginPage = "/login";
    public PageUrl(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public boolean isPage (String url) {
        return driver.getCurrentUrl().contains(url);
    }
    public boolean isLoginPage () {
        return isPage(loginPage);
    }
}
