package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class NavigationMethods {
    public static void main(String[] args) throws MalformedURLException {
            WebDriver driver = new ChromeDriver();
            //driver.navigate().to("https://the-internet.herokuapp.com/?utm_source=chatgpt.com");

            //URL myurl=new URL("https://the-internet.herokuapp.com/?utm_source=chatgpt.com");
            // driver.navigate().to(myurl);

            driver.navigate().to("https://www.saucedemo.com/?utm_source=chatgpt.com");
            driver.navigate().to("https://the-internet.herokuapp.com/?utm_source=chatgpt.com");

            driver.navigate().back();
            System.out.println(driver.getCurrentUrl());

            driver.navigate().forward();
            System.out.println(driver.getCurrentUrl());

            driver.navigate().refresh();




    }
}
