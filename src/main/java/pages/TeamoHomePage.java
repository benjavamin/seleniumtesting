package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TeamoHomePage extends BasePage{
    By userMenuItemSearch = By.xpath("//span[text()='Users']");
    By changeLogSearch = By.xpath("//h1[contains(text(),'Changelog')]");


    public TeamoHomePage(WebDriver driver) {
        super(driver);
    }


    public void clickUserMenuItem(){
        click(userMenuItemSearch);
    }


}
