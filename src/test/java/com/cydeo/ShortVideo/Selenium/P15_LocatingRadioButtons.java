package com.cydeo.ShortVideo.Selenium;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P15_LocatingRadioButtons {
    public static void main(String[] args) {

        // set up chrome driver and open chrome
        WebDriver driver = WebDriverFactory.getDriver("chrome");


        // navigate to checkbox page from practice site
        driver.get("https://practice.cydeo.com/radio_buttons");

        WebElement blueRadioButton = driver.findElement(By.id("blue"));
        System.out.println("Before click blueRadioButton.isSelected() = " + blueRadioButton.isSelected());
        blueRadioButton.click();
        System.out.println("After click blueRadioButton.isSelected() = " + blueRadioButton.isSelected());


        // click on red button
        WebElement redRadiButton = driver.findElement(By.id("red"));
        System.out.println("Before click redRadiButton.isSelected() = " + redRadiButton.isSelected());
        redRadiButton.click();
        System.out.println(" After click redRadiButton.isSelected() = " + redRadiButton.isSelected());

        // check blue button is not selected
        System.out.println("After selecting red blueRadioButton.isSelected() = " + blueRadioButton.isSelected());

        // identify green radio button
        WebElement greenRadioButton = driver.findElement(By.id("green"));
        greenRadioButton.click();

        System.out.println("greenRadioButton.isSelected() = " + greenRadioButton.isSelected());
        System.out.println("greenRadioButton.isEnabled() = " + greenRadioButton.isEnabled());



        // Select your favorite color
        List<WebElement> allColors = driver.findElements(By.name("color"));
        System.out.println("allColors.size() = " + allColors.size());

        for (WebElement eachColor : allColors){
            System.out.println("Current radio button is " + eachColor.getAttribute("id"));
            System.out.println("Is it enable " + eachColor.isEnabled());
            System.out.println("Is it selected? " + eachColor.isSelected());
        }


        // Select your favorite sport

        WebElement footballRadioButton = driver.findElement(By.id("football"));
        footballRadioButton.click();

        
        List<WebElement> allSport = driver.findElements(By.name("sport"));
        System.out.println("allSport.size() = " + allSport.size());

        for (WebElement eachSport : allSport){
            System.out.println("Current radio button is: " + eachSport.getAttribute("id"));
            System.out.println("Is it enable: " + eachSport.isEnabled());
            System.out.println("Is it selected: " + eachSport.isSelected());
        }


        driver.quit();
    }
}
