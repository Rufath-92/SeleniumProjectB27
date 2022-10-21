package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicallyLoadedPage_1 {

    public DynamicallyLoadedPage_1() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[.='Start']")
   public WebElement startBtn;

    @FindBy(id = "loading")
    public WebElement loadingBar;

    @FindBy(id = "username")
   public WebElement username_inputBox;

    @FindBy(id = "pwd")
   public WebElement password_inputBox;

    @FindBy(xpath = "//button[.='Submit']")
    WebElement submitBtn;

    @FindBy(id = "flash")
   public WebElement errorMessage;

    public void login(String username,String password){
        username_inputBox.sendKeys(username);
        password_inputBox.sendKeys(password);
        submitBtn.click();
    }
}
