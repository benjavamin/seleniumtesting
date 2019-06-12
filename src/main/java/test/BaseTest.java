package test;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    private WebDriver driver;

    @BeforeSuite
    public void beforeSuite(){
        driver = new ChromeDriver();
        ChromeDriverManager.chromedriver().setup();
    }

    @AfterSuite
    public void afterSuite(){
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }

    public WebDriver getDriver(){
        return this.driver;
    }
}
