package org.example.pageActions;

import org.example.pageDefinitions.CommonSteps;
import org.example.pageElements.LoginElements;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class LoginActions {
    private WebDriver driver;
    LoginElements loginElements;

    public LoginActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.loginElements = new LoginElements(driver);
    }
    public void log(String user) throws InterruptedException {
        loginElements.user.sendKeys(user);
        Thread.sleep(1000);
    }
    public void pass(String p){
        loginElements.passwoord.sendKeys(p);
    }
    public void logo(){
        loginElements.login.click();
    }
    public void alert(){

    }






}
