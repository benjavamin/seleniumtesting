package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TeamoUsersPage {

    WebDriver driver = null;
    By createUsersBtnSearch = By.xpath("/html[1]/body[1]/teamo-root[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/teamo-list-user[1]/div[1]/button[1]");

    public TeamoUsersPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickCreateUserBtn(){
        driver.findElement(createUsersBtnSearch).click();
    }

    public boolean createBtnIsDisplayed(){
        return driver.findElement(createUsersBtnSearch).isDisplayed();
    }


}
