import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {


    public static void main(String[] args) {

        WebDriver webDriver = new ChromeDriver();

        webDriver.get("http://google.ba");
    }
}
