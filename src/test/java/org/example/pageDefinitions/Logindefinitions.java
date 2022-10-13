package org.example.pageDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageActions.LoginActions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class Logindefinitions {
  WebDriver driver;
  LoginActions loginActions;

    public Logindefinitions(CommonSteps commonSteps, LoginActions loginActions) {
        this.driver =commonSteps.getDriver();
        this.loginActions = loginActions;
    }


    @When("enter {string} And {string} And click on login")
    public void enterAndAndClickOnLogin(String userid, String userpass) throws InterruptedException {
        loginActions.userid(userid);
        loginActions.pass(userpass);
        loginActions.click();

     loginActions.newcust();


    }

    @Then("login should be successful")
    public void loginShouldBeSuccessful() {
        System.out.println("login should be successful");
    }

}
