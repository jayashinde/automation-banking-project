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
    @FindBy(id = "card")
    public WebElement aler;

    @FindBy(xpath = "//a[@href='addcustomerpage.php']")
    public WebElement newcustomer;

  @FindBy(xpath = "//input[@name='name']")
  public WebElement name;

  @FindBy(xpath = "//input[@name='rad1']")
  public WebElement gender;
  @FindBy(xpath = "//input[@id='dob']")
  public WebElement date;
    @FindBy(xpath = "//textarea[@name='addr']")
    public WebElement addresses;
    @FindBy(xpath = "//input[@name='city']")
    public WebElement citi;
    @FindBy(xpath = "//input[@name='state']")
    public WebElement states;
    @FindBy(xpath = "//input[@name='pinno']")
    public WebElement pin;
    @FindBy(xpath = "//input[@name='telephoneno']")
    public WebElement telephone;

    @FindBy(xpath = "//input[@name='emailid']")
    public WebElement email;
    @FindBy(xpath = "//input[@name='sub']")
    public WebElement submit;

   // @FindBy(xpath = )





    public LoginElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }
}
