package testCase;

import base.BaseClass;
import dataProvider.ExcelDataProvider;

import lisiterns.ITestLisinerClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObject.LoginPage;

@Listeners(ITestLisinerClass.class) // Corrected class name 'ITestListenerClass' instead of 'ITestLisinerClass'
public class LoginTest extends BaseClass {

    // Helper method to perform login and error checking
    private void loginAndVerifyErrorMessage(String username, String password, String expectedErrorMessage) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clearUsername();
        loginPage.clearPassword();
        loginPage.setUsername(username);
        loginPage.setPassword(password);
        loginPage.clickLoginButton();
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
    }

    @Test(dataProvider = "loginData", dataProviderClass = ExcelDataProvider.class)
    public void testLogin(String testCaseId, String username, String password, String expectedResult) {
        switch (testCaseId) {
            case "TC001":
                LoginPage loginPage = new LoginPage(driver);
                loginPage.clearUsername();
                loginPage.clearPassword();
                loginPage.setUsername(username);
                loginPage.setPassword(password);
                loginPage.clickLoginButton();
                WebElement logo = driver.findElement(By.xpath("//div[@class='app_logo']"));
                Assert.assertEquals(logo.getText(), "Swag Labs");
                loginPage.clickLogout();
                break;

            case "TC002":
            case "TC003":
            case "TC004":
            case "TC005":
            case "TC006":
            case "TC007":
            case "TC008":
            case "TC009":
            case "TC010":
            case "TC011":
            case "TC012":
                loginAndVerifyErrorMessage(username, password, expectedResult);
                break;
        }
    }
}
