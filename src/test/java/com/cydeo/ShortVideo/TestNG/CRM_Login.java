package com.cydeo.ShortVideo.TestNG;

import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CRM_Login {

    @Test
    public void crm_Login(){
        Driver.getDriver().get(ConfigReader.getProperty("crm.url"));

        // Enter valid username
        WebElement inputUsername = Driver.getDriver().findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUsername.sendKeys(ConfigReader.getProperty("username"));

        // Enter valid password
        WebElement inputPassword = Driver.getDriver().findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys(ConfigReader.getProperty("password"));

        // click to Login button
        WebElement loginBth = Driver.getDriver().findElement(By.xpath("//input[@value='Log In']"));
        loginBth.click();

        Driver.closeDriver();
    }
}
