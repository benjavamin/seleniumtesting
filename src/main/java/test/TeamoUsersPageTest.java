package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.CreateNewUserPage;
import pages.TeamoUsersPage;

import java.util.concurrent.TimeUnit;

import static test.TeamoLoginPageTest.driver;

public class TeamoUsersPageTest {

    //private static WebDriver driver = null;
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";


    /*@BeforeTest
    public void SetUpTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }*/

    @Test
    public static void clickCreateButton(){
        TeamoUsersPage teamoUsersPage = new TeamoUsersPage(driver);
        teamoUsersPage.clickCreateUserBtn();
        driver.manage().timeouts().pageLoadTimeout(10 , TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterTest
    public void tearDownTest(){
        CreateNewUserPage createNewUserPage = new CreateNewUserPage(driver);
        boolean pass = createNewUserPage.formIsDisplayed();

        if (pass){
            System.out.println("Teamo New User Form Test: " + ANSI_GREEN + "PASS");
        } else {
            System.out.println("Teamo New User Form Test: " + ANSI_RED + "FAIL");
        }

        //driver.close();
    }
}
