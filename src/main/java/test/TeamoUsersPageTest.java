package test;

import org.testng.annotations.Test;
import pages.TeamoUsersPage;

import java.util.concurrent.TimeUnit;

import static test.TeamoLoginPageTest.driver;

public class TeamoUsersPageTest {

    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";


    @Test
    public static void clickCreateButton(){
        TeamoUsersPage teamoUsersPage = new TeamoUsersPage(driver);
        teamoUsersPage.clickCreateUserBtn();
        driver.manage().timeouts().pageLoadTimeout(10 , TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


}
