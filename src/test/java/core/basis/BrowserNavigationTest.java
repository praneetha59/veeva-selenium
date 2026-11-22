package core.basis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Topic: Browser navigation commands.
 * Methods covered: navigate().to(), back(), forward(), refresh()
 * Also shows the difference between get() and navigate().to()
 */
public class BrowserNavigationTest {

    @Test
    public void navigateBetweenPages() {
        WebDriver driver = new ChromeDriver();

        // Open the first site
        driver.get("https://www.saucedemo.com");
        Assert.assertTrue(driver.getCurrentUrl().contains("saucedemo"));

        // Open a second site using navigate().to()
        driver.navigate().to("https://the-internet.herokuapp.com");
        Assert.assertTrue(driver.getCurrentUrl().contains("herokuapp"));
        System.out.println("On second site: " + driver.getTitle());

        // Go back to the first site
        driver.navigate().back();
        Assert.assertTrue(driver.getCurrentUrl().contains("saucedemo"));
        System.out.println("After back()   : " + driver.getCurrentUrl());

        // Go forward to the second site again
        driver.navigate().forward();
        Assert.assertTrue(driver.getCurrentUrl().contains("herokuapp"));
        System.out.println("After forward(): " + driver.getCurrentUrl());

        // Reload the current page
        driver.navigate().refresh();
        System.out.println("After refresh(): " + driver.getTitle());

        driver.quit();
    }

    /*
     * NOTE:
     * driver.get(url)         -> waits for the page to load fully, simple and common
     * driver.navigate().to()  -> same effect, but gives access to back/forward/refresh
     */
}
