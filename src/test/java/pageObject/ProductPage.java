package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

    WebDriver driver;

    // Locators
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    WebElement addToCartButton;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement cartIcon;

    // Constructor
    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Actions
    public void addToCart() {
        addToCartButton.click();
    }

    public void goToCart() {
        cartIcon.click();
    }
}
