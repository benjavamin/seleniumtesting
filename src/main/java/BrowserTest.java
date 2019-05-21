import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BrowserTest {


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();


        webDriver.get("http://google.com");
        webDriver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation testing! :)");

        List<WebElement> listOfInputs = webDriver.findElements(By.xpath("//input"));

        int count = listOfInputs.size();
        System.out.println("Count of input elements: " + count);

        webDriver.findElement(By.xpath("//input[@name='btnK'][@type='submit']")).submit();
        Thread.sleep(3000);
        webDriver.close();
    }
}
