package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage_utility_vytrack {


     public static void login(WebDriver driver,String userName,String password){

          driver.findElement(By.xpath("//input[@id='prependedInput']")).sendKeys(userName);
          driver.findElement(By.xpath("//input[@id='prependedInput2']")).sendKeys(password);
          driver.findElement(By.xpath("//button[@id='_submit']")).click();

     }
     public static void logOut(WebDriver driver){

          WebElement clickUserMenu = driver.findElement(By.id("user-menu"));
          clickUserMenu.click();
          WebElement logOut = driver.findElement(By.linkText("Logout"));
          logOut.click();
     }
}
