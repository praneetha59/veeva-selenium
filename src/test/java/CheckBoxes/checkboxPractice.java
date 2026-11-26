package CheckBoxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
public class checkboxPractice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/?utm_source=chatgpt.com");
        driver.manage().window().maximize();

        //select single checkbox
        driver.findElement(By.id("male")).click();

        //select multiple checkbox
        List<WebElement> checkBoxes =  driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

       /*for(WebElement check : checkBoxes){
            check.click();
        }
        */


        //select last 2 checkBoxes
        for(int i =5;i<checkBoxes.size();i++){
            checkBoxes.get(i).click();
        }
    }

}
