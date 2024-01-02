package org.deemoun;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAutomation {

    static WebDriver driver = WebDriverSetUp.initializeChromeDriver();

    public static void loadPage(){
        driver.get("https://www.wildberries.ru/");
    }

    public static void login(){
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

    public static void addToCart(){
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/button[2]")).click();
    }

    public static void inputForm(){
        driver.findElement(By.id("searchInput")).sendKeys("игрушки");
    }

    public static void findTickets(){
        driver.findElement(By.className("s__cQ6neS4ccCunOu9Ydn0k s__tkvB9amX28GXeWxPcrad s__eEClvAD7BnPrQbwBW5zC s__p0epgEYgBbKyjc8MfJPw s__l8E4THP5kjzMoqMOT7mY")).click();
    }
    public static void main(String[] args) throws InterruptedException {
        loadPage();
        inputForm();
        Thread.sleep(1000);
    }

}