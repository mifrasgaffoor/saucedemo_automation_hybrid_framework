package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utility.ConfigUtility;
import utility.ExcelUtility;

import java.io.IOException;

import static utility.BrowserFactory.openBrowser;
import static utility.BrowserFactory.quitBrowser;

public class BaseClass {


    public WebDriver driver;
    ConfigUtility configUtility;

    @BeforeTest
    public void setUp() throws IOException {
        configUtility = new ConfigUtility();
        String browserName = configUtility.getBrowserName();
        String appUrl = configUtility.getUrl();
        System.out.println(appUrl);
        System.out.println(browserName);
        driver = openBrowser(driver, browserName, appUrl, true);
    }


    @AfterTest
    public void tearDown() {
        quitBrowser(driver);
    }


}
