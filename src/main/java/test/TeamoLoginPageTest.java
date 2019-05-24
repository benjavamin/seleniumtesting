package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.TeamoHomePage;
import pages.TeamoLoginPage;

import java.util.concurrent.TimeUnit;

public class TeamoLoginPageTest {

    private static WebDriver driver = null;
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";


    public static void main(String[] args) {
        teamoLoginTest();
    }


    public static void teamoLoginTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        TeamoLoginPage teamoLoginPage = new TeamoLoginPage(driver);
        TeamoHomePage teamoHomePage = new TeamoHomePage(driver);

        driver.get("http://localhost:4200/login");
        teamoLoginPage.enterUsername("benjaminbajic@mail.com");
        teamoLoginPage.enterPassword("12345");
        teamoLoginPage.signIn();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        boolean pass = teamoHomePage.iconDisplayCheck();

        if (pass) {
            System.out.println("Teamo Login Test: " + ANSI_GREEN + "PASS");
        } else {
            System.out.println("Teamo Login Test: " + ANSI_RED + " FAIL");
        }
        driver.close();

    }
}
