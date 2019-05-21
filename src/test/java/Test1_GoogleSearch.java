import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class Test1_GoogleSearch {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        //googleSearch();
        testLogin();
    }

    public static void googleSearch() throws InterruptedException {

         //setup chromedriver for google chrome
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com"); //open google website
        driver.findElement(By.xpath("//input[@name='q'")).sendKeys("Google this."); //find input field and enter text
        driver.findElement(By.xpath("//input[@name='btnK'][@type='submit']")).submit(); //find google search button and click it
        driver.close(); //close chrome

        System.out.println("Test Completed Successfully");
    }

    public static void testLogin(){
        WebDriver driver = new ChromeDriver();

        driver.get("http://thedemosite.co.uk/login.php");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("user1");
        driver.findElement(By.xpath("//input[@name='password'][@type='password']")).sendKeys("user1");
        driver.findElement(By.xpath("//input[@name='FormsButton2'][@type='button']")).click();

        if (driver.findElement(By.xpath("//b[text()='**Successful Login**']")).isDisplayed()){
            System.out.println("Login successful.");
        }
        driver.close();
    }

}
