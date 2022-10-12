package org.example.pageDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageActions.LoginActions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class Logindefinitions {
  WebDriver driver;
  LoginActions loginActions;

    public Logindefinitions(CommonSteps commonSteps, LoginActions loginActions) {
        this.driver =commonSteps.getDriver();
        this.loginActions = loginActions;
    }

    @When("Enter {string} And  {string} And click on login")
    public void enter_and_and_click_on_login(String username, String passwords) throws InterruptedException {
   loginActions.log(username);
   loginActions.pass(passwords);
   loginActions.logo();

    }
    @When("click on new customer")
    public void click_on_new_customer() throws InterruptedException {

       loginActions.newcustomer();

    }

    @When("enter {string} And click on gender")
    public void enter_and_click_on_gender(String nameuser) {
       loginActions.name(nameuser);
       loginActions.g();
    }

    @When("Enter {string} And enter address {string} And city {string}")
    public void enter_and_enter_address_and_city(String date, String address, String city) {
      loginActions.d(date);
      loginActions.addr(address);
      loginActions.ci(city);

    }
    @When("Enter state {string} And pin {string} and telephone {string}")
    public void enter_state_and_pin_and_telephone(String statea, String pin, String telephones) {
  loginActions.s(statea);
  loginActions.pincode(pin);
  loginActions.phone(telephones);

    }
    @When("Enter email {string} And click on submit")
    public void enter_email_and_click_on_submit(String email) throws InterruptedException {
   loginActions.email(email);
   loginActions.sub();
    }
    @When("click on ok")
    public void click_on_ok() throws InterruptedException {
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        loginActions.alert();
    }
    @When("click on edit customer And enter {string}")
    public void click_on_edit_customer_and_enter(String id) throws InterruptedException {


    }
    @When("enter {string} and click on submit")
    public void enter_and_click_on_submit(String newnmae) throws InterruptedException {




    }



    @When("click on delete button")
    public void click_on_delete_button() throws InterruptedException {



    }
    @When("Enter {string} And click on submmit")
    public void enter_and_click_on_submmit(String delteedid) throws InterruptedException {


    }
    @When("click on newaccount And enter {string}")
    public void click_on_newaccount_and_enter() throws InterruptedException {


    }


    @Then("login should be successful")
    public void login_should_be_successful() {

        System.out.println("login should be successful");
    }

}
