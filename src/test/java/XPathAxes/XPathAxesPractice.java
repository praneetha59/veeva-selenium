package XPathAxes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesPractice {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");

        // Login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();


        // 1. Parent
        driver.findElement(By.xpath("//input[@id='user-name']/parent::div"));


        // 2. Child
        driver.findElement(By.xpath("//div[@class='login-box']/child::form"));


        // 3. Ancestor
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']/ancestor::div[@class='inventory_item']"));


        // 4. Descendant
        driver.findElement(By.xpath("//div[@class='inventory_item']/descendant::button"));


        // 5. Following-sibling
        driver.findElement(By.xpath("//div[@class='inventory_item_name ']/following-sibling::div"));


        // 6. Preceding-sibling
        driver.findElement(By.xpath("//div[@class='inventory_item_price']/preceding-sibling::button"));


        // 7. Following
        driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']/following::button[1]"));


        // 8. Preceding
        driver.findElement(By.xpath("//div[@class='inventory_item_price']/preceding::div[1]"));


        // 9. Self
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']/self::button"));


        // 10. Ancestor-or-self
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']/ancestor-or-self::button"));


        // 11. Descendant-or-self
        driver.findElement(By.xpath("//div[@class='inventory_item']/descendant-or-self::div"));


        // 12. Following-sibling with index
        driver.findElement(By.xpath("(//div[@class='inventory_item_name '])[1]/following-sibling::div[1]"));


        // 13. Preceding-sibling with index
        driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[1]/preceding-sibling::*[1]"));


        driver.quit();
    }
}
