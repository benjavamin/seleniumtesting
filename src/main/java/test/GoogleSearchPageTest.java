package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;

public class GoogleSearchPageTest {

    private static WebDriver driver = null;
    public static void main(String[] args) {
        googleSearchTest();
    }

    public static void googleSearchTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://google.com");


        GoogleSearchPage searchPageObj = new GoogleSearchPage(driver);
        searchPageObj.setTextInTextBox("Automate testing yes");
        searchPageObj.clickSearchBtn();
        driver.close();

    }
}
