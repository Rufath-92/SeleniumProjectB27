package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    /*
        PageFactory class is a Selenium class that support POM
        It has method called initElements. Once it's called it will store all elements specified using @FindBy
        annotation with locator and it wll give elements to the classes when they called
        initElements method accept 2 arg
        WebDriver instance and Page class instance (this) means current instance of this class
         */

    public LibraryLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "inputEmail")
    public WebElement email;

    @FindBy(id = "inputPassword")
    public WebElement password;
    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInBtn;

    @FindBy(id = "inputEmail-error")
    public WebElement fieldRequiredErrorMsg;

    @FindBy(id = "inputEmail-error")
    public WebElement enterInvalidEmailErrorMsg;

    @FindBy (xpath="//div[.='Sorry, Wrong Email or Password']")
    public WebElement wrongEmailAndPasswordErrorMsg;


//    @FindBy (id="inputEmail")
//    public WebElement inputUsername;
//
//    @FindBy (xpath="//input[@id='inputPassword']")
//    public WebElement inputPassword;
//
//    @FindBy (xpath = "//button[.='Sign in']")
//    public WebElement signInButton;
//
//    @FindBy (xpath = "//div[.='This field is required.']/div")
//    public WebElement fieldRequiredErrorMsg;
//
//    @FindBy (xpath = "//div[.='Please enter a valid email address.']/div")
//    public WebElement enterInvalidEmailErrorMsg;
//
//    @FindBy (xpath="//div[.='Sorry, Wrong Email or Password']")
//    public WebElement wrongEmailAndPasswordErrorMsg;


    public void login(String username,String passWord){
        email.sendKeys(username);
        password.sendKeys(passWord);
        signInBtn.click();

    }
}
