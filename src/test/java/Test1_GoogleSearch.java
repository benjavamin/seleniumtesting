import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class Test1_GoogleSearch {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        //googleSearch();
    }

    public static void googleSearch() throws InterruptedException {

         //setup chromedriver for google chrome
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com"); //open google website
        driver.findElement(By.xpath("//input[@name='q'][@type='text']")).sendKeys("Google this."); //find input field and enter text
        driver.findElement(By.xpath("//input[@name='btnK'][@type='submit']")).submit(); //find google search button and click it
        driver.close(); //close chrome

        System.out.println("Test Completed Successfully");
    }

}
