package core.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Locator 1: id
 * Use it when the element has an id. IDs are usually unique, so this is the best choice.
 */
public class IdLocatorTest {

    @Test
    public void idLocator() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        System.out.println("Page URL after login: " + driver.getCurrentUrl());

        driver.quit();
    }
}