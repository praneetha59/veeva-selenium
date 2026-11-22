package core.basis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Topic: Browser window size
 * Methods covered: maximize(), fullscreen(), getSize()
 */
public class BrowserWindowTest {

    @Test
    public void maximizeWindow() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");

        driver.manage().window().maximize();   // make the window full size
        System.out.println("Window size: " + driver.manage().window().getSize());

        driver.quit();
    }

    @Test
    public void fullscreenWindow() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");

        driver.manage().window().fullscreen(); // like pressing F11
        System.out.println("Window size: " + driver.manage().window().getSize());

        driver.quit();
    }
}


