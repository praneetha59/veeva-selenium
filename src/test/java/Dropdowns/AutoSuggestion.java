package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutoSuggestion {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.google.com");

        driver.findElement(By.name("q")).sendKeys("Selenium");
        Thread.sleep(5000);

        List<WebElement> options = driver.findElements(
                By.xpath("//ul[@role='listbox']//li")
        );

        for (WebElement option : options) {
            if (option.getText().contains("selenium")) {
                option.click();
                break;
            }
        }

        driver.quit();
    }
}
