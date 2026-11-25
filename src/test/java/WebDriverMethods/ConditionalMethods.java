
package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        // 1. isDisplayed()
        WebElement username = driver.findElement(By.id("user-name"));
        System.out.println("Username Displayed: " + username.isDisplayed());


        // 2. isEnabled()
        WebElement loginButton = driver.findElement(By.id("login-button"));
        System.out.println("Login Button Enabled: " + loginButton.isEnabled());


        // 3. isSelected()
        WebElement loginField = driver.findElement(By.id("login-button"));
        System.out.println("Login Button Selected: " + loginField.isSelected());

        loginField.click();
        System.out.println("Login Button Selected: " + loginField.isSelected());


        // Enter username and password
        username.sendKeys("standard_user");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        loginButton.click();

        WebElement addToCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));

        System.out.println("Add To Cart Button Displayed: " + addToCart.isDisplayed());

        System.out.println("Add To Cart Button Enabled: " + addToCart.isEnabled());

    }
}
