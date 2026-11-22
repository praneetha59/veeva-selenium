package core.basis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchBrowserTest {

    @Test
    public void launchBrowserAndVerifyPage() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        System.out.println("Page title : " + title);
        System.out.println("Current URL: " + url);
        System.out.println("Page source length: " + driver.getPageSource().length());

        // 4. Verify with assertions (this is what makes it a real test)
        Assert.assertEquals(title, "Swag Labs");
        Assert.assertTrue(url.contains("saucedemo"));
        driver.quit();
    }
}
