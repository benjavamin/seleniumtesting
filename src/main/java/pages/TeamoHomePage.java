package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TeamoHomePage {
    WebDriver driver = null;
    By iconSearch = By.xpath("//mat-icon[text()='account_circle']");
    By userMenuItemSearch = By.xpath("//span[text()='Users']");
    By changeLogSearch = By.xpath("//h1[contains(text(),'Changelog')]");


    public TeamoHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean changelogDisplayCheck(){
            return driver.findElement(changeLogSearch).isDisplayed();
    }

    public void clickUserMenuItem(){
        driver.findElement(userMenuItemSearch).click();
    }


}
