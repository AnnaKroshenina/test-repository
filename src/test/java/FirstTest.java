
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class FirstTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeAll
    public void start() {
    driver = new ChromeDriver() ;
    wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void FirstTest() {
        driver.get("https://www.google.com");
    }

    @AfterAll
    public void stop() {
        driver.quit();
        driver = null;
    }
}
