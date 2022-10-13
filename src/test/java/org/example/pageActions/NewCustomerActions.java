package org.example.pageActions;

import org.example.pageDefinitions.CommonSteps;
import org.example.pageElements.NewAccountElements;
import org.openqa.selenium.WebDriver;

public class NewCustomerActions {
    private WebDriver driver;
    NewAccountElements newAccountElements;

    public NewCustomerActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.newAccountElements = new NewAccountElements(driver);
    }
   public void name(String name){
        newAccountElements.name.sendKeys(name);
   }
    public void gender(){
        newAccountElements.gender.click();
    }

    public void date(String dateofbday){
        newAccountElements.date.sendKeys(dateofbday);
    }
    public void address(String address){
        newAccountElements.addresses.sendKeys(address);
    }
    public void city(String custcity){
        newAccountElements.city.sendKeys(custcity);
    }
    public void sate(String state){
        newAccountElements.states.sendKeys(state);
    }
    public void pin(String pincode){
        newAccountElements.pin.sendKeys(pincode);
    }

    public void mobileno(String mobileno){
        newAccountElements.telephone.sendKeys(mobileno);
    }
    public void mail(String email){
        newAccountElements.email.sendKeys(email);
    }
    public void submit(){
        newAccountElements.submit.click();
    }







}
