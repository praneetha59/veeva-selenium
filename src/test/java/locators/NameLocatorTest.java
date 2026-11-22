package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Locator 2: name
 * Use it when the element has a name attribute. Common on input fields.
 */
public class NameLocatorTest {

    @Test
    public void nameLocator() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");

        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();

        System.out.println("Page URL after login: " + driver.getCurrentUrl());

        driver.quit();
    }
}