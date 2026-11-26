package AlertWindow;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {
    public static void main(String[] args) throws Exception  {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Thread.sleep(2000);
        Alert myalert = driver.switchTo().alert();
        myalert.sendKeys("naisss");
        Thread.sleep(1000);
        myalert.accept();
    }
}
