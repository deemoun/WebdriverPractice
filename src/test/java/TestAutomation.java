import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestAutomation {

    static WebDriver driver = WebDriverSetUp.initializeChromeDriver();
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Tests have started to run!");
    }


    @BeforeSuite
    public static void setUp(){
        driver.get("https://www.saucedemo.com/");
    }

    @Test(description = "Check the page title")
    public void checkTitle(){
        driver.get("https://www.saucedemo.com/");
        Assert.assertEquals(driver.getTitle(), "Swag Labs");
    }

    @Test(description = "Login into Application")
    public void loginIntoApp(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
    }

    @Test(dependsOnMethods = "loginIntoApp",description = "Add item to cart")
    public void addToCart() throws InterruptedException{
        ProductPage productPage = new ProductPage(driver);
        productPage.addToCart();
    }

    @AfterSuite
    public static void tearDown(){
        driver.quit();
    }
}