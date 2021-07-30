
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

public class Eight {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeAll
    public void start() {
        driver = new ChromeDriver() ;
        wait = new WebDriverWait(driver, 10);
    }

    @Test

    public void CheckSticker() {
        int n = 0;

        if (driver.findElement(By.cssSelector(".sticker new")).isDisplayed())
            n ++;
        if (driver.findElement(By.cssSelector(".sticker sale")).isDisplayed())
            n ++;
        if (n==0)
            System.out.printf("no stickers on Duck ");
        if (n==2)
            System.out.printf("two stickers on Duck ");
    }

    public void Eight() {
        driver.get("http://localhost/litecart");
        driver.findElement(By.cssSelector("a.link[title=Blue Duck]"));
        CheckSticker();
        driver.findElement(By.cssSelector("a.link[title=Red Duck]"));
        CheckSticker();
        driver.findElement(By.cssSelector("a.link[title=Green Duck]"));
        CheckSticker();
        driver.findElement(By.cssSelector("a.link[title=Purple Duck]"));
        CheckSticker();
        driver.findElement(By.cssSelector("a.link[title=Yellow Duck]"));
        CheckSticker();
    }

    @AfterAll
    public void stop() {
        driver.quit();
        driver = null;
    }
}