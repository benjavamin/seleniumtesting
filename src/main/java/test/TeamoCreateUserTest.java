package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.CreateNewUserPage;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import static test.TeamoLoginPageTest.driver;

public class TeamoCreateUserTest {

    //private static WebDriver driver = null;
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";

    /*@BeforeTest
    public void setUpTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }*/

    @Test
    public void createUser(){
        CreateNewUserPage createNewUserPage = new CreateNewUserPage(driver);
        //TeamoLoginPageTest.teamoLoginTest();
        //TeamoHomePageTest.clickUsers();

        Random r = new Random();
        String generatedMail = "testing" + ((char)r.nextInt(255)) + "@mail.com";
        createNewUserPage.enterEmail(generatedMail);
        createNewUserPage.enterName("Automated");
        createNewUserPage.enterLastName("Testing");
        createNewUserPage.enterPassword("12345");
        createNewUserPage.expandRolesSection();
        createNewUserPage.selectRole();
        createNewUserPage.selectOrganisation();
        createNewUserPage.clickAddRoleBtn();
        createNewUserPage.clickCreateBtn();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

    }

    @AfterTest
    public void tearDownTest(){
        driver.close();
    }

}
