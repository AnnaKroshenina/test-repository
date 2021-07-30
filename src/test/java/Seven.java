
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class Seven {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeAll
    public void start() {
        driver = new ChromeDriver() ;
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void Seven() {
        driver.get("http://localhost/litecart/admin/");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
        wait.until(visibilityOf(driver.findElement(By.id("app-"))));
        driver.findElement(By.linkText("Appearence")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Logotype")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Catalog")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Product Groups")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Option Groups")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Manufacturers")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Suppliers")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Delivery Statuses")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Sold Out Statuses")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Quantity Units")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("CSV Import/Export")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Countries")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Currencies")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Customers")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Newsletter")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Geo Zones")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Languages")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Storage Encoding")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Modules")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Customer")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Shipping")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Payment")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Order Total")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Order Success")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Order Action")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Orders")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Order Statuses")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Pages")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Reports")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Most Sold Products")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Most Shopping Customers")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Settings")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Defaults")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("General")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Listings")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Images")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Checkout")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Advanced")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Security")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Slides")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Tax")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Tax Rates")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Translations")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("Users")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
        driver.findElement(By.linkText("vQmods")).click();
        wait.until(visibilityOf(driver.findElement(By.tagName("h1"))));
    }

    @AfterAll
    public void stop() {
        driver.quit();
        driver = null;
    }
}