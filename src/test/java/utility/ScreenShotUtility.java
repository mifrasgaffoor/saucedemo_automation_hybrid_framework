package utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShotUtility {

    public void takeScreenshot(WebDriver driver, String fileName) {
        try {
            // Cast driver to TakesScreenshot
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;

            // Capture the screenshot as a file
            File screenshot = takesScreenshot.getScreenshotAs(OutputType.FILE);

            // Generate a unique file name with timestamp
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            String filePath = System.getProperty("user.dir") + "\\Screenshots\\" + fileName + "_" + timestamp + ".png";

            // Ensure the Screenshots directory exists
            File screenshotDir = new File(System.getProperty("user.dir") + "\\Screenshots");
            if (!screenshotDir.exists()) {
                screenshotDir.mkdir();
            }

            // Save the screenshot to the specified location
            FileHandler.copy(screenshot, new File(filePath));
            System.out.println("Screenshot saved at: " + filePath);

        } catch (IOException e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
        }
    }
}
