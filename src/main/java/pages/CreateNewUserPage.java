package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateNewUserPage {

    WebDriver driver = null;
    By emailTextFieldSearch = By.id("mat-input-0");
    By nameTextFieldSearch = By.xpath("mat-input-2");
    By lastNameTextFieldSearch = By.id("mat-input-3");
    By pwTextFieldSearch = By.id("autogeneratedPassword");
    By rolesSectionSearch = By.className("mat-content");
    By rolesDropDownFieldSearch = By.xpath("/html[1]/body[1]/teamo-root[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/teamo-create-user[1]/div[1]/mat-card[1]/mat-card-content[1]/form[1]/mat-expansion-panel[1]/div[1]/div[1]/form[1]/p[1]/mat-form-field[1]/div[1]/div[1]");
    By orgDropDownFieldSearch = By.xpath("/html[1]/body[1]/teamo-root[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/teamo-create-user[1]/div[1]/mat-card[1]/mat-card-content[1]/form[1]/mat-expansion-panel[1]/div[1]/div[1]/form[1]/p[2]/mat-form-field[1]/div[1]/div[1]");
    By addRoleBtnSearch = By.xpath("//mat-icon[text()='control_point']");
    By createBtnSearch = By.xpath("//text()[.='Create']/ancestor::button[1]");

    public CreateNewUserPage(WebDriver driver){
        this.driver = driver;
    }

    public boolean formIsDisplayed(){
        return driver.findElement(emailTextFieldSearch).isDisplayed();
    }

    public void enterEmail(String input){
        driver.findElement(emailTextFieldSearch).sendKeys(input);
    }

    public void enterName(String input){
        driver.findElement(nameTextFieldSearch).sendKeys(input);
    }

    public void enterLastName(String input){
        driver.findElement(lastNameTextFieldSearch).sendKeys(input);
    }

    public void enterPassword(String input){
        driver.findElement(pwTextFieldSearch).clear();
        driver.findElement(pwTextFieldSearch).sendKeys(input);
    }

    public void expandRolesSection(){
        driver.findElement(rolesSectionSearch).click();
    }

    public Select getRoleSelect(){
        return new Select(driver.findElement(rolesDropDownFieldSearch));
    }

    public void selectRole(){
        getRoleSelect().selectByIndex(0);
    }

    public Select getOrgSelect(){
        return new Select(driver.findElement(orgDropDownFieldSearch));
    }

    public void selectOrganisation(){
        getOrgSelect().selectByIndex(0);
    }

    public void clickAddRoleBtn(){
        driver.findElement(addRoleBtnSearch).click();
    }

    public void clickCreateBtn(){
        driver.findElement(createBtnSearch).click();
    }
}
