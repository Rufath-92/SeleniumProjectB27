package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SmartBearUtils {

    public static void loginToSmartBear(WebDriver driver){
        WebElement usernameBox = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        usernameBox.sendKeys("Tester");
        WebElement passwordBox = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        passwordBox.sendKeys("test");
        WebElement clickBtn = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']"));
        clickBtn.click();
    }
}
