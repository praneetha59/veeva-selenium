
package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingDynamic {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        // 1. Using OR operator
        WebElement e1 = driver.findElement(By.xpath("//*[@id='user-name' or @id='password']"));
        System.out.println("OR: " + e1.getAttribute("id"));

        // 2. Using contains()
        WebElement e2 = driver.findElement(By.xpath("//*[contains(@id,'user')]"));
        System.out.println("Contains: " + e2.getAttribute("id"));

        // 3. Using starts-with()
        WebElement e3 = driver.findElement(By.xpath("//*[starts-with(@id,'user')]"));
        System.out.println("Starts-with: " + e3.getAttribute("id"));

        driver.quit();
    }
}
