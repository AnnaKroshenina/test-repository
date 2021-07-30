
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

public class Third {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeAll
    public void start() {
        driver = new ChromeDriver() ;
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void Third() {
        driver.get("http://localhost/litecart/admin/");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
        wait.until(visibilityOf(driver.findElement(By.id("app-"))));
    }

    @AfterAll
    public void stop() {
        driver.quit();
        driver = null;
    }
}