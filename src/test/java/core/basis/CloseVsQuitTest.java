package core.basis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Topic: close() vs quit()
 *
 * close() -> closes the current browser window
 * quit()  -> closes all browser windows and ends the session
 */
public class CloseVsQuitTest {

    @Test
    public void usingClose() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        System.out.println("Opened: " + driver.getTitle());

        driver.close();   // closes the current window
    }

    @Test
    public void usingQuit() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        System.out.println("Opened: " + driver.getTitle());

        driver.quit();    // closes everything and ends the session
    }
}