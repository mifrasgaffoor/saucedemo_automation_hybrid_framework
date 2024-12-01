package pageObject;

import base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  {

    WebDriver driver;

    // Constructor to initialize WebElements
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locators using @FindBy annotation
    @FindBy(xpath = "//input[@id='user-name']")
    WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @FindBy(xpath = "//input[@id='login-button']")
    WebElement loginBtn;

    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
    WebElement menu;

    @FindBy(xpath = "//a[@id='logout_sidebar_link']")
    WebElement logout_btn;


    @FindBy(xpath = "//h3[@data-test=\"error\"]")
    WebElement errMessage;

    // Methods to interact with elements
    public void setUsername(String userName) {
        username.sendKeys(userName);
    }

    public void setPassword(String pwd) {
        password.sendKeys(pwd);
    }

    public void clickLoginButton() {
        loginBtn.click();
    }


    public void clickLogout(){
        menu.click();
        logout_btn.click();
    }


    public String getErrorMessage() {
        return errMessage.getText();
    }

    // Method to clear username field
    public void clearUsername() {
        username.clear();
    }

    // Method to clear password field
    public void clearPassword() {
        password.clear();
    }


}
