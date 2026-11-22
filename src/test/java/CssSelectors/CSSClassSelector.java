package CssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSClassSelector {
    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        System.out.println(driver.getTitle());

        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("#login-button")).click();

        WebElement name = driver.findElement(By.cssSelector(".inventory_item_name"));
        System.out.println("Product name: " + name.getText());
        WebElement price = driver.findElement(By.cssSelector(".inventory_item_price"));
        System.out.println("Price: " + price.getText());

        WebElement cart = driver.findElement(By.cssSelector(".btn_inventory"));
        cart.click();

        driver.quit();

    }
}
