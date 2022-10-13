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
    public void userid(String user) throws InterruptedException {
        loginElements.user.sendKeys(user);
        Thread.sleep(1000);
    }
    public void pass(String p){
        loginElements.passwoord.sendKeys(p);
    }
    public void click(){
        loginElements.login.click();
    }
    public void newcust() throws InterruptedException {
        Thread.sleep(2000);
       loginElements.newerclick.click();
       Thread.sleep(5000);
    }







}
