
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

public class Eleven {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeAll
    public void start() {
        driver = new ChromeDriver() ;
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void Eleven() {
        driver.get("http://localhost/litecart");
        driver.findElement(By.linkText("New customers click here")).click();
        driver.findElement(By.name("firstname")).sendKeys("Anna");
        driver.findElement(By.name("lastname")).sendKeys("Kroshenina");
        driver.findElement(By.name("address1")).sendKeys("Mendeleeva street");
        driver.findElement(By.name("postcode")).sendKeys("11111");
        driver.findElement(By.name("city")).sendKeys("Moscow");
        driver.findElement(By.tagName("select")).click();
        wait.until(visibilityOf(driver.findElement(By.className("select2-search__field"))));
        driver.findElement(By.className("select2-search__field")).sendKeys("United States");
        wait.until(visibilityOf(driver.findElement(By.linkText("United States"))));
        driver.findElement(By.linkText("United States")).click();
        driver.findElement(By.name("email")).sendKeys("aa@mail.ru");
        driver.findElement(By.name("phone")).sendKeys("81111111111");
        driver.findElement(By.name("password")).sendKeys("Anna");
        driver.findElement(By.name("confirmed_password")).sendKeys("Anna");
        driver.findElement(By.name("create_account")).click();
        wait.until(visibilityOf(driver.findElement(By.id("box-account"))));
        driver.findElement(By.name("Logout")).click();
        wait.until(visibilityOf(driver.findElement(By.id("app-"))));
        driver.findElement(By.name("email")).sendKeys("aa@mail.ru");
        driver.findElement(By.name("password")).sendKeys("Anna");
        driver.findElement(By.cssSelector("button.submit[name=login]")).click();
        wait.until(visibilityOf(driver.findElement(By.id("box-account"))));
    }

    @AfterAll
    public void stop() {
        driver.quit();
        driver = null;
    }
}