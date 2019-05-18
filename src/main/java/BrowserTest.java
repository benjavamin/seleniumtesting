import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {


    public static void main(String[] args) {

        String projectPath = System.getProperty("user.dir");

        System.setProperty("webdriver.chrome.driver", projectPath + "\\Drivers\\Chromedriver\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://warmane.com");
    }
}
