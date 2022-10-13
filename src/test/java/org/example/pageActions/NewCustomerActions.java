package org.example.pageActions;

import org.example.pageDefinitions.CommonSteps;
import org.example.pageElements.NewCustomerElements;
import org.openqa.selenium.WebDriver;

public class NewCustomerActions {
    private WebDriver driver;
    NewCustomerElements newCustomerElements;

    public NewCustomerActions(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.newCustomerElements = new NewCustomerElements(driver);
    }
   public void name(String name){
        newCustomerElements.name.sendKeys(name);
   }
    public void gender(){
        newCustomerElements.gender.click();
    }

    public void date(String dateofbday){
        newCustomerElements.date.sendKeys(dateofbday);
    }
    public void address(String address){
        newCustomerElements.addresses.sendKeys(address);
    }
    public void city(String custcity){
        newCustomerElements.city.sendKeys(custcity);
    }
    public void sate(String state){
        newCustomerElements.states.sendKeys(state);
    }
    public void pin(String pincode){
        newCustomerElements.pin.sendKeys(pincode);
    }

    public void mobileno(String mobileno){
        newCustomerElements.telephone.sendKeys(mobileno);
    }
    public void mail(String email){
        newCustomerElements.email.sendKeys(email);
    }
    public void submit(){
        newCustomerElements.submit.click();
    }







}
