package XPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleAttributes {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/login");

        // 1. Two attributes with AND (both must match)
        driver.findElement(By.xpath("//input[@type='text' and @name='username']")).sendKeys("praneetha");

        // 2. Three attributes with AND
        driver.findElement(By.xpath("//input[@type='password' and @name='password' and @id='password']")).sendKeys("secret");

        // 3. OR (any one can match)
        // driver.findElement(By.xpath("//input[@id='user' or @name='username']")).sendKeys("praneetha");

        // 4. Another style: chain the brackets (same as AND)
        // driver.findElement(By.xpath("//input[@type='text'][@name='username']")).sendKeys("praneetha");

        Thread.sleep(3000); // just to see the result
        driver.quit();
    }
}