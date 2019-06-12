package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.CreateNewUserPage;
import pages.TeamoUsersPage;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import static test.TeamoLoginPageTest.driver;

public class TeamoCreateUserTest extends BaseTest{

    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";


    @Test
    public void createUser(){
        CreateNewUserPage createNewUserPage = new CreateNewUserPage(driver);
        TeamoUsersPage teamoUsersPage = new TeamoUsersPage(driver);
        Random r = new Random();
        String generatedMail = "testing" + ((char)r.nextInt(255)) + "@mail.com";
        createNewUserPage.enterEmail(generatedMail);
        createNewUserPage.enterName("Automated");
        createNewUserPage.enterLastName("Testing");
        createNewUserPage.enterPassword("12345");
        createNewUserPage.expandRolesSection();
        createNewUserPage.openRoleSelect();
        createNewUserPage.selectRole();
        createNewUserPage.openOrgSelect();
        createNewUserPage.selectOrganisation();
        createNewUserPage.clickAddRoleBtn();
        createNewUserPage.clickCreateBtn();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

    }


}
