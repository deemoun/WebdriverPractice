package org.deemoun;

import org.openqa.selenium.WebDriver;

public class TestAutomation {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverSetUp.initializeChromeDriver();
        driver.get("https://www.saucedemo.com/");

        // Login Page
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        // Product Page
        ProductPage productPage = new ProductPage(driver);
        productPage.addToCart();
        driver.quit();
    }
}