
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

public class Twelve {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeAll
    public void start() {
        driver = new ChromeDriver() ;
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void Twelve() {
        driver.get("http://localhost/litecart/admin");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
        wait.until(visibilityOf(driver.findElement(By.id("app-"))));
        driver.findElement(By.linkText("Catalog")).click();
        driver.findElement(By.cssSelector("button[href=http://localhost/litecart/admin/?category_id=0&app=catalog&doc=edit_product]")).click();
        driver.findElement(By.name("name[en]")).sendKeys("Duck");
        driver.findElement(By.name("code")).sendKeys("123");
        driver.findElement(By.cssSelector("[type=checkbox], [value=1-1]")).click();
        driver.findElement(By.name("new_images[]")).sendKeys("\"C:\\Users\\annak\\Documents\\GitHub\\test-repository\\src\\test\\java\\classic-car-150082_1280.png\"");
        driver.findElement(By.name("date_valid_from")).sendKeys("31072021");
        driver.findElement(By.name("date_valid_to")).sendKeys("31072021");
        driver.findElement(By.linkText("Prices")).click();
        wait.until(visibilityOf(driver.findElement(By.id("table-prices"))));
        driver.findElement(By.name("purchase_price")).sendKeys("5");
        driver.findElement(By.name("save")).click();
        driver.findElement(By.linkText("Duck")).click();
    }

    @AfterAll
    public void stop() {
        driver.quit();
        driver = null;
    }
}