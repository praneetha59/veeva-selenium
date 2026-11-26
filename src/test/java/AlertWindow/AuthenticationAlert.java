package AlertWindow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationAlert {
    public static void main(String[] args) throws Exception  {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/basic_auth");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        //https://username:password@website_URL
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");


    }
}
