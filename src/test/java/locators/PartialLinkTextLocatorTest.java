package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PartialLinkTextLocatorTest {

    @Test
    public void partialLinkTextLocator() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");

        // The full link text is "Form Authentication"
        driver.findElement(By.partialLinkText("Form Auth")).click();

        System.out.println("Opened page: " + driver.getCurrentUrl());

        driver.quit();
    }
}
