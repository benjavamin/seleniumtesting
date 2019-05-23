package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPageObject;

public class GoogleSearchPageTest {

    private static WebDriver driver = null;
    public static void main(String[] args) {
        googleSearchTest();
    }

    public static void googleSearchTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://google.com");


        GoogleSearchPageObject searchPageObj = new GoogleSearchPageObject(driver);
        searchPageObj.setTextInTextBox("Automate testing yes");
        searchPageObj.clickSearchBtn();
        driver.close();

    }
}
