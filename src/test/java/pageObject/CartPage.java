package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {


    WebDriver driver;

    // Locators
    @FindBy(xpath = "//div[@class='inventory_item_name']")
    WebElement productName;

    @FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
    WebElement removeButton;

    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkoutButton;

    // Constructor
    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Actions
    public String getProductName() {
        return productName.getText();
    }

    public void removeProduct() {
        removeButton.click();
    }

    public void proceedToCheckout() {
        checkoutButton.click();
    }
}