package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class TagNameLocatorTest {

    @Test
    public void tagNameLocator() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");

        // h1 is the main heading of the page
        String heading = driver.findElement(By.tagName("h1")).getText();
        System.out.println("Heading: " + heading);

        driver.quit();
    }
}