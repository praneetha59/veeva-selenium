package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class HandleBrowserWindows {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window ID: " + parentWindow);

        //driver.switchTo().newWindow(WindowType.WINDOW);
        driver.switchTo().newWindow(org.openqa.selenium.WindowType.TAB);
        driver.get("https://www.google.com/");

        Set<String> allWindows = driver.getWindowHandles();
        System.out.println("All Window IDs: " + allWindows);

        for (String window : allWindows) {
            if (window.equals(parentWindow)) {
                driver.switchTo().window(window);
                System.out.println("Parent Window: " + driver.getTitle());
            } else {
                driver.switchTo().window(window);
                System.out.println("Child Window: " + driver.getTitle());
            }
        }

        driver.close();
        driver.switchTo().window(parentWindow);
        driver.quit();
    }
}

