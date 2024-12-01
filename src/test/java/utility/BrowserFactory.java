package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class BrowserFactory {

    public static WebDriver openBrowser(WebDriver driver, String browserName, String url, boolean isHeadless) {
        if (browserName.contains("chrome")) {
            ChromeOptions chromeOptions = new ChromeOptions();
            if (isHeadless) {
                chromeOptions.addArguments("--headless", "--disable-gpu", "--window-size=1920,1080");
            }
            chromeOptions.addArguments("--disable-extensions");
            chromeOptions.addArguments("--remote-allow-origins=*"); // Handle CORS issues
            driver = new ChromeDriver(chromeOptions);
        } else if (browserName.contains("edge")) {
            EdgeOptions edgeOptions = new EdgeOptions();

            if (isHeadless) {
                // Enable headless mode for Edge
                edgeOptions.addArguments("--headless", "--disable-gpu", "--window-size=1920,1080");
            }
            edgeOptions.addArguments("--disable-extensions");
            driver = new EdgeDriver(edgeOptions);

        } else {
            System.out.println("Unsupported browser: " + browserName + ". Please check your browser name.");
            return null;
        }
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        return driver;
    }

    public static void quitBrowser(WebDriver driver) {
        driver.quit();
    }
}
