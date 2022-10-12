package org.example.pageDefinitions;

import io.cucumber.java.en.When;
import org.example.pageActions.LoginActions;
import org.example.pageActions.NewCustomerActions;
import org.openqa.selenium.WebDriver;

public class NewAccountDefinitions {

    WebDriver driver;
    NewCustomerActions newCustomerActions;

    public NewAccountDefinitions(CommonSteps commonSteps, NewCustomerActions newCustomerActions) {
        this.driver = commonSteps.getDriver();
        this.newCustomerActions = newCustomerActions;
    }


}
