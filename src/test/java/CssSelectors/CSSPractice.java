package CssSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSPractice {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/?utm_source=chatgpt.com");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());

        //tag selector
        WebElement heading=driver.findElement(By.cssSelector("h5"));
        System.out.println("the heading is "+ heading.getText());

        //ID Selector
        WebElement result = driver.findElement(By.cssSelector("#root"));
        System.out.println("Root found: " + result.isDisplayed());

        //class Selector
        WebElement result2 = driver.findElement(By.cssSelector(".card-body"));
        System.out.println(result2.getText());
        result2.click();

    }
}