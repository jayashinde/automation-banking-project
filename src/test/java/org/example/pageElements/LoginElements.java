package org.example.pageElements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginElements {
    WebDriver driver;

    @FindBy(xpath = "//input[@name='uid']")
    public WebElement user;
    @FindBy(xpath = "//td/input[@name='password']")
    public WebElement passwoord;

    @FindBy(xpath = "//td/input[@name='btnLogin']")
    public WebElement login;

    @FindBy(xpath = "//a[@href='addcustomerpage.php']")
    public WebElement newerclick;





    public LoginElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }
}
