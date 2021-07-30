
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class Thirteen {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeAll
    public void start() {
        driver = new ChromeDriver() ;
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void Thirteen() {
        driver.get("http://localhost/litecart");
        wait.until(visibilityOf(driver.findElement(By.className("content"))));
        driver.findElement(By.cssSelector("a.link[title=Blue Duck]")).click();
        driver.findElement(By.name("add_cart_product")).click();
        driver.get("http://localhost/litecart");
        wait.until(visibilityOf(driver.findElement(By.className("content"))));
        driver.findElement(By.cssSelector("a.link[title=Green Duck]")).click();
        driver.findElement(By.name("add_cart_product")).click();
        driver.get("http://localhost/litecart");
        wait.until(visibilityOf(driver.findElement(By.className("content"))));
        driver.findElement(By.cssSelector("a.link[title=Red Duck]")).click();
        driver.findElement(By.name("add_cart_product")).click();
        driver.get("http://localhost/litecart");
        wait.until(visibilityOf(driver.findElement(By.className("content"))));
        driver.findElement(By.linkText("Checkout »")).click();
        driver.findElement(By.cssSelector("a.inact")).click();
        driver.findElement(By.name("remove_cart_item")).click();
        driver.findElement(By.name("remove_cart_item")).click();
        driver.findElement(By.name("remove_cart_item")).click();

    }

    @AfterAll
    public void stop() {
        driver.quit();
        driver = null;
    }
}