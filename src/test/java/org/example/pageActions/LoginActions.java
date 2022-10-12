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
    public void newcustomer() throws InterruptedException {
        loginElements.newcustomer.click();
        Thread.sleep(5000);

        }
        public void name(String customername){
        loginElements.name.sendKeys(customername);
        }
    public void g(){
        loginElements.gender.click();
    }
    public void d(String date){
        loginElements.date.sendKeys(date);
    }
    public void addr(String addre){
        loginElements.addresses.sendKeys(addre);
    }
    public void ci(String citi){
        loginElements.citi.sendKeys(citi);
    }
    public void s(String state){
        loginElements.states.sendKeys(state);
    }
    public void pincode(String pinco){
        loginElements.pin.sendKeys(pinco);
    }
    public void phone(String telephone){
        loginElements.telephone.sendKeys(telephone);
    }
    public void email(String emails) throws InterruptedException {
        loginElements.email.sendKeys(emails);
        Thread.sleep(3000);
    }
    public void sub()  {

     loginElements.submit.click();
    }







}
