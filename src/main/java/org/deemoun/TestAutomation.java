package org.deemoun;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

    // WebElement element = driver.findElement(By.tagName("h1"));
    // System.out.println("Page Title: " + element.getText());

public class TestAutomation {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverSetUp.initializeChromeDriver();
        driver.get("https://www.saucedemo.com/");

    }
}