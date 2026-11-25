package Waitmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class ExplictWaitMeth {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/?utm_source=chatgpt.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));

        wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password")));

        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.className("title"), "Products"));

    }
}
