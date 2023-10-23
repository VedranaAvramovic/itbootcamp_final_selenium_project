package helper;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Helper {
    public static void takeScreenshot(WebDriver driver, String path) throws IOException {
        File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Files.copy(f, new File(path));
    }

    public static void takeScreenshotWithDateAndTime(WebDriver driver, String testName) throws IOException {

        File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        Date date = Calendar.getInstance().getTime();
        String strDate = new SimpleDateFormat("dd-MM-yyyy hh-mm-ss").format(date);
        String path = "screenshots/" + testName + " " + strDate + ".jpg";

        Helper.takeScreenshot(driver, path);
        Files.copy(f, new File(path));
    }
}
