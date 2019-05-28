package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.TeamoHomePage;
import pages.TeamoUsersPage;

import java.util.concurrent.TimeUnit;

import static test.TeamoLoginPageTest.driver;

public class TeamoHomePageTest {

    //private static WebDriver driver = null;
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";

    /*@BeforeTest
    public void setUpTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }*/

    @Test
    public static void clickUsers(){
        TeamoHomePage teamoHomePage = new TeamoHomePage(driver);
        teamoHomePage.clickUserMenuItem();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterTest
    public void tearDownTest(){
        TeamoUsersPage teamoUsersPage = new TeamoUsersPage(driver);
        boolean pass = teamoUsersPage.createBtnIsDisplayed();

        if (pass){
            System.out.println("Teamo Open Users Page: " + ANSI_GREEN + "PASS");
        } else {
            System.out.println("Teamo Open Users Page: " + ANSI_RED + "FAIL");
        }
        //driver.close();
    }
}
