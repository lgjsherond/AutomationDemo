package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.swing.*;

public class loginPage {

    protected WebDriver driver;

    private By txt_username=By.id("name");
    private By txt_password=By.id("password");
    private By btn_Login=By.id("login");
    private By btn_LogOut=By.id("logout");

    public  loginPage(WebDriver driver){
        this.driver=driver;

        //Validate the page before use the page
        System.out.println(driver.getTitle());
    }

    public void enterUsername(String username){
        driver.findElement(txt_username).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(txt_password).sendKeys(password);
    }

    public void clickLogin(){
        driver.findElement(btn_Login).click();
    }

    public void validLogin(String username, String password){
        driver.findElement(txt_username).sendKeys(username);
        driver.findElement(txt_password).sendKeys(password);
        driver.findElement(btn_Login).click();

    }

    public void checkLogoutDisplay(){
        driver.findElement(btn_LogOut).isDisplayed();
    }
}
