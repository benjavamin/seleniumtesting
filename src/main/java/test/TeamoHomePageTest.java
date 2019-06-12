package test;

import org.testng.annotations.Test;
import pages.TeamoHomePage;

import java.util.concurrent.TimeUnit;

import static test.TeamoLoginPageTest.driver;

public class TeamoHomePageTest {

    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";


    @Test
    public static void clickUsers(){
        TeamoHomePage teamoHomePage = new TeamoHomePage(driver);
        teamoHomePage.clickUserMenuItem();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

}
