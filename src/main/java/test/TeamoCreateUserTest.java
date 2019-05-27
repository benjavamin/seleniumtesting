package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.CreateNewUserPage;

import java.util.concurrent.TimeUnit;

public class TeamoCreateUserTest {

    private static WebDriver driver = null;
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";

    @BeforeTest
    public void setUpTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void createUser(){
        CreateNewUserPage createNewUserPage = new CreateNewUserPage(driver);

        driver = new ChromeDriver();
        System.out.println(driver);
        TeamoLoginPageTest.teamoLoginTest();
        TeamoHomePageTest.clickUsers();
        TeamoUsersPageTest.clickCreateButton();

        createNewUserPage.enterEmail();
        createNewUserPage.enterName();
        createNewUserPage.enterLastName();
        createNewUserPage.enterPassword();
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
