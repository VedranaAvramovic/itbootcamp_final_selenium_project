package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageUrl extends BasicPage{
    public String loginPage = "/login";
    public String homePage = "/home";
    public String signUpPage = "/signup";
    public PageUrl(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public boolean isPage (String url) {
        return driver.getCurrentUrl().contains(url);
    }
    public boolean isLoginPage () {
        return isPage(loginPage);
    }
    public boolean isHomePage () {
        wait
                .withMessage("Should be redirected to the Home page.")
                .until(ExpectedConditions.urlContains(homePage));

        return isPage(homePage);
    }
    public boolean isSignUpPage () {
        return isPage(signUpPage);
    }
}
