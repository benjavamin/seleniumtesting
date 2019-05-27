package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TeamoHomePage {
    WebDriver driver = null;
    By iconSearch = By.xpath("//mat-icon[text()='account_circle']");
    By userMenuItemSearch = By.xpath("//span[text()='Users'");



    public TeamoHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean iconDisplayCheck(){
        try {
            return driver.findElement(iconSearch).isDisplayed();
        } catch (Exception ex) {
            return false;
        }
    }

    public void clickUserMenuItem(){
        driver.findElement(userMenuItemSearch).click();
    }


}
