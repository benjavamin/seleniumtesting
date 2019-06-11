package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TeamoUsersPage extends BasePage{

    By createUsersBtnSearch = By.xpath("//button[@class='mat-raised-button ng-star-inserted']");

    public TeamoUsersPage(WebDriver driver){
        super(driver);
    }

    public void clickCreateUserBtn(){
        click(createUsersBtnSearch);
    }

    public boolean createBtnIsDisplayed(){
        return driver.findElement(createUsersBtnSearch).isDisplayed();
    }


}
