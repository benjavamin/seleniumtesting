package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TeamoLoginPage extends BasePage{

    By usernameTextBoxSearch = By.id("username-input-field");
    By pwTextBoxSearch = By.id("mat-input-1");
    By signInBtnSearch = By.id("sign-in-button");

    public TeamoLoginPage(WebDriver driver){
        super(driver);
    }

    public void enterUsername(String input){
        writeText(usernameTextBoxSearch, input);
    }

    public void enterPassword(String input){
        writeText(pwTextBoxSearch, input);
    }

    public void signIn(){
        click(signInBtnSearch);
    }


}
