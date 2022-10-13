package org.example.pageDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageActions.NewCustomerActions;
import org.openqa.selenium.WebDriver;

public class NewCustomerDefinitions {

  private   WebDriver driver;
    NewCustomerActions newCustomerActions;

    public NewCustomerDefinitions(CommonSteps commonSteps, NewCustomerActions newCustomerActions) {
        this.driver = commonSteps.getDriver();
        this.newCustomerActions = newCustomerActions;
    }

    @When("click on new customer  And enter {string} And click on gender")
    public void click_on_new_customer_and_enter_and_click_on_gender(String names) throws InterruptedException {

   newCustomerActions.name(names);
   newCustomerActions.gender();
    }
    @When("Enter {string} And enter address {string} And city {string}")
    public void enter_and_enter_address_and_city(String dateofbday, String address, String city) {
        newCustomerActions.date(dateofbday);
        newCustomerActions.address(address);
        newCustomerActions.city(city);


    }
    @When("Enter state {string} And pin {string} and telephone {string}")
    public void enter_state_and_pin_and_telephone(String satate, String pin, String telephone) {
        newCustomerActions.sate(satate);
        newCustomerActions.pin(pin);
        newCustomerActions.mobileno(telephone);


    }
    @When("Enter email {string} And click on submit")
    public void enter_email_and_click_on_submit(String mail) {
   newCustomerActions.mail(mail);

    }
    @When("click on ok")
    public void click_on_ok() throws InterruptedException {
    newCustomerActions.submit();
    Thread.sleep(2000);
    driver.switchTo().alert().accept();
    }
    @Then("new cutomer is added")
    public void new_cutomer_is_added() {
        System.out.println("new cutomer is added");
    }


    @Then("login should be sucessful message should be display")
    public void loginShouldBeSucessfulMessageShouldBeDisplay() {
        System.out.println("login should be sucessful message should be display");
    }
}
