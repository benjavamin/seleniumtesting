package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TeamoHomePage {
    WebDriver driver = null;
    By iconSearch = By.xpath("//mat-icon[contains(text(),'account_circle')]");
    By signOutBtnSearch = By.xpath("//span[contains(text(),'Sign out')]");


    public TeamoHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean iconDisplayCheck(){
        return driver.findElement(iconSearch).isDisplayed();
    }

    public WebElement signOutBtn(){
        WebElement signOutBtn = driver.findElement(signOutBtnSearch);
        return signOutBtn;
    }
}
