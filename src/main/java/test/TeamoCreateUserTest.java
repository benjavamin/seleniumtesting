package test;

import org.testng.annotations.Test;
import pages.CreateNewUserPage;
import pages.TeamoHomePage;
import pages.TeamoLoginPage;
import pages.TeamoUsersPage;

public class TeamoCreateUserTest extends BaseTest{

    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";


    @Test
    public void createUser(){
        TeamoLoginPage teamoLoginPage = new TeamoLoginPage(getDriver());
        TeamoHomePage teamoHomePage = new TeamoHomePage(getDriver());
        TeamoUsersPage teamoUsersPage = new TeamoUsersPage(getDriver());
        CreateNewUserPage createNewUserPage = new CreateNewUserPage(getDriver());

        getDriver().get("http://localhost:4200/login");
        teamoLoginPage.enterUsername("benjaminbajic@mail.com");
        teamoLoginPage.enterPassword("12345");
        teamoLoginPage.signIn();

        teamoHomePage.clickUserMenuItem();


        teamoUsersPage.clickCreateUserBtn();

        createNewUserPage.enterEmail();
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

    }


}
