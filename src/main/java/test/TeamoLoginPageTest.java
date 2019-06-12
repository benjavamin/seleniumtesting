package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.TeamoHomePage;
import pages.TeamoLoginPage;

import java.util.concurrent.TimeUnit;

public class TeamoLoginPageTest extends BaseTest{

    public static WebDriver driver = null;
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";



    @Test
    public static void teamoLoginTest() {
        TeamoLoginPage teamoLoginPage = new TeamoLoginPage(driver);
        TeamoHomePage teamoHomePage = new TeamoHomePage(driver);
        driver.get("http://localhost:4200/login");
        teamoLoginPage.enterUsername("benjaminbajic@mail.com");
        teamoLoginPage.enterPassword("12345");
        teamoLoginPage.signIn();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

}
