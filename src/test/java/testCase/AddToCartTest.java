package testCase;

import base.BaseClass;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;

import org.testng.annotations.Test;
import pageObject.CartPage;
import pageObject.LoginPage;
import pages.ProductPage;

public class AddToCartTest extends BaseClass {

    WebDriver driver;
    ProductPage productPage;
    CartPage cartPage;
    LoginPage loginPage;

    @Test
    public void testAddToCart() {
        // Initialize Page Objects
        loginPage = new LoginPage(driver);
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);

        // Perform Login
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickLoginButton();

        // Add product to cart
        productPage.addToCart();
        productPage.goToCart();

        // Verify product in cart
        String expectedProductName = "Sauce Labs Backpack";
        Assert.assertEquals(cartPage.getProductName(), expectedProductName, "Product name in cart does not match!");
    }
}
