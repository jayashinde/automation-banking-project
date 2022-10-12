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




}
