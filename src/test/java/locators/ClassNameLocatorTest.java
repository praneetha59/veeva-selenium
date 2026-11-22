package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassNameLocatorTest {

    @Test
    public void classNameLocator() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");

        // getText() reads the visible text of the element
        String logoText = driver.findElement(By.className("login_logo")).getText();
        System.out.println("Logo text: " + logoText);

        driver.quit();
    }
}