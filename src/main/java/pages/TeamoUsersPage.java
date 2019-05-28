package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TeamoUsersPage {

    WebDriver driver = null;
    By createUsersBtnSearch = By.xpath("//button[@class='mat-raised-button ng-star-inserted']");

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
