package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoubleClickElement_W3schools {


    public DoubleClickElement_W3schools() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "iframeResult")
    public static WebElement iframe;

    @FindBy(id = "demo")
    public WebElement doubleClickText;
}
