package org.deemoun;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestAutomation {
    public static void main(String[] args) {
        WebDriver driver = WebDriverSetUp.initializeChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.quit();
    }
}