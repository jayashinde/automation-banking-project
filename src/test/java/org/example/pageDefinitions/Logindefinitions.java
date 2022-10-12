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



    @Then("login should be successful")
    public void login_should_be_successful() {

        System.out.println("login should be successful");
    }

}
