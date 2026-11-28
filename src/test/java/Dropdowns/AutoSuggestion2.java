
package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutoSuggestion2 {

    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.bjs.com/");
        Thread.sleep(3000);
        WebElement input = driver.findElement(
                By.xpath("//input[@type='text']"));
        input.sendKeys("gifts");
        Thread.sleep(5000);
        List<WebElement> options = driver.findElements(
                By.xpath("//div[contains(@class,'search-suggestion')]//div[contains(@class,'list-group-item')]//a"));
        System.out.println("Total suggestions: " + options.size());
        for (WebElement option : options) {
            System.out.println(option.getText());
            if (option.getText().toLowerCase().contains("gifts for women")) {
                option.click();
                break;
            }
        }

        driver.quit();
    }
}
