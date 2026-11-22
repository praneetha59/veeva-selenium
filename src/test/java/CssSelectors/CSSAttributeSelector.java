package CssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSAttributeSelector {
    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        System.out.println(driver.getTitle());

        WebElement username = driver.findElement(By.cssSelector("input[name='user-name']"));
        username.sendKeys("standard_user");

        WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
        password.sendKeys("secret_sauce");

}
}