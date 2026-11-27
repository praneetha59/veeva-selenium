
package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class SelectDropdown {
    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.manage().window().maximize();

        WebElement drp = driver.findElement(By.id("dropdown"));

        Select drpsel = new Select(drp);
        Thread.sleep(3000);

        drpsel.selectByVisibleText("Option 2");
        //drpsel.selectByIndex(2);

        List<WebElement> Options = drpsel.getOptions();
        System.out.println(Options.size());

        for(int i =0;i<Options.size();i++){
            System.out.println(Options.get(i).getText());
        }

    }
}
