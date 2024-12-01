package lisiterns;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utility.ScreenShotUtility;

public class ITestLisinerClass implements ITestListener {

    public void onTestSuccess(ITestResult result) {
        // not implemented
    }


    @Override

    public void onTestFailure(ITestResult result) {
        // not implemented


        Object testClass = result.getInstance();
        WebDriver driver = ((base.BaseClass) testClass).driver;
        ScreenShotUtility screenshotUtility = new ScreenShotUtility();
        String testName = result.getName(); // Get the test method name
        screenshotUtility.takeScreenshot(driver, "Failed_" + testName);

    }


    public void onTestSkipped(ITestResult result) {
        // not implemented
    }

    public void onStart(ITestContext context) {
        // not implemented
    }

    public void onFinish(ITestContext context) {
        // not implemented
    }


}
