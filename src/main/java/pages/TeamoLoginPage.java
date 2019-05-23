package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TeamoLoginPage {

    WebDriver driver = null;

    By usernameTextBoxSearch = By.id("username-input-field");
    By pwTextBoxSearch = By.id("mat-input-1");
    By SignInBtnSearch = By.id("sign-in-button");

    public TeamoLoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterUsername(String input){
        driver.findElement(usernameTextBoxSearch).sendKeys(input);
    }

    public void enterPassword(String input){
        driver.findElement(pwTextBoxSearch).sendKeys(input);
    }

    public void signIn(){
        driver.findElement(SignInBtnSearch).click();
    }


}
