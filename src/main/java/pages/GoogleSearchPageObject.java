package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObject {

    WebDriver driver = null;

    By textBoxSearch = By.name("q");
    By Btnsearch = By.xpath("//input[@name='btnK'][@type='submit']");

    public GoogleSearchPageObject(WebDriver driver){
        this.driver = driver;
    }

    public void setTextInTextBox(String inputText){
        driver.findElement(textBoxSearch).sendKeys(inputText);
    }

    public void clickSearchBtn(){
        driver.findElement(Btnsearch).submit();
    }
}
