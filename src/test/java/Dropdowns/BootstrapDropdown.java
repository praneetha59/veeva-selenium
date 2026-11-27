
package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class BootstrapDropdown {

    public static void main(String[] args) throws Exception{

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://qapracticehub.com/#selection");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[contains(.,'Select testing frameworks')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//label[contains(.,'Selenium')]")).click();
        Thread.sleep(3000);


        List<WebElement> options = driver.findElements(
                By.xpath("//label[.//input[@type='checkbox']]")
        );

        System.out.println("Number of options: " + options.size());


        for (WebElement op : options) {
            System.out.println(op.getText());
        }

        List<WebElement> checkboxes = driver.findElements(
                By.xpath("//input[@type='checkbox']")
        );

        int count = 0;

        for (WebElement checkbox : checkboxes) {
            if (checkbox.isSelected()) {
                count++;
            }
        }

        System.out.println("Selected options: " + count);

        driver.quit();
    }
}
