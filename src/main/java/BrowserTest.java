import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();


        webDriver.get("http://google.com");

        WebElement textBox = webDriver.findElement(By.name("q"));
        WebElement submitButton = webDriver.findElement(By.name("btnK"));
        textBox.sendKeys("Automation step by step");
        submitButton.submit();
        Thread.sleep(3000);
        webDriver.close();
    }
}
