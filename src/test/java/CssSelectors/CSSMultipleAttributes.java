package CssSelectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSMultipleAttributes {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement username = driver.findElement(By.cssSelector("input[name='user-name'][type='text']"));
        username.sendKeys("standard_user");
        WebElement password = driver.findElement(By.cssSelector("input[name='password'][type='password']"));
        password.sendKeys("secret_sauce");
        WebElement button = driver.findElement(By.cssSelector("input[type='submit'][value='Login']"));
        button.click();
        System.out.println("Multiple attribute selectors used!");

        driver.quit();
    }
}
