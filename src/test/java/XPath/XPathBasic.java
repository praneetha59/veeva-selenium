package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathBasic {
    public static void main(String[] args) throws InterruptedException {

        // Open Chrome
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("praneetha");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret");
    }
}
