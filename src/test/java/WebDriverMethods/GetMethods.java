
package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetMethods {

    public static void main(String[] args) throws Exception{

        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);

        System.out.println("Title: " + driver.getTitle());

        System.out.println("Current URL: " + driver.getCurrentUrl());

        System.out.println(driver.getPageSource());

        String window = driver.getWindowHandle();
        System.out.println("Window Handle: " + window);


        driver.findElement(By.partialLinkText("OrangeHRM")).click();
        Set<String> windows = driver.getWindowHandles();
        System.out.println("Window Handles: " + windows);


    }
}
