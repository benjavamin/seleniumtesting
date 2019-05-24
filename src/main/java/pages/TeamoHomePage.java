package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TeamoHomePage {
    WebDriver driver = null;
    By iconSearch = By.xpath("//mat-icon[contains(text(),'account_circle')]");



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


}
