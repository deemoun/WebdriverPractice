package org.deemoun;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAutomation {
    public static void main(String[] args) {
        WebDriver driver = WebDriverSetUp.initializeChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }
}