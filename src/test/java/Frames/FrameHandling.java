
package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://qa.randomly.online/practice/frames");
        Thread.sleep(3000);

        // 1. Switch into normal iframe
        String code = driver.findElement(By.id("access-code")).getText();

        driver.switchTo().frame("practice-iframe");

        driver.findElement(By.id("frame-input")).sendKeys(code);

        driver.findElement(By.id("frame-submit")).click();

        // 2. Return to main page
        driver.switchTo().defaultContent();

        driver.findElement(By.id("btn-main-confirm")).click();

        // 3. Handle nested frames
        driver.switchTo().frame("outer-frame");

        driver.switchTo().frame("inner-frame");

        String innerCode = driver.findElement(By.id("inner-code")).getText();

        // Return to main page
        driver.switchTo().defaultContent();

        driver.findElement(By.xpath("//input[@aria-label='Inner code:']")).sendKeys(innerCode);

        driver.quit();
    }
}
