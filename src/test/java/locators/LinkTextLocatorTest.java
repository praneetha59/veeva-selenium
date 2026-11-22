package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class LinkTextLocatorTest {

    @Test
    public void linkTextLocator() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");

        driver.findElement(By.linkText("Checkboxes")).click();

        System.out.println("Opened page: " + driver.getCurrentUrl());

        driver.quit();
    }
}