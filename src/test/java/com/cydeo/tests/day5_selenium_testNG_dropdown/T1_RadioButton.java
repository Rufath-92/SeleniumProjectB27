package com.cydeo.tests.day5_selenium_testNG_dropdown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class T1_RadioButton {
    public static void main(String[] args) {

//        1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");


//        2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

//        3. Click to “Hockey” radio button
        WebElement clickRadioButton = driver.findElement(By.xpath("//input[@id='hockey']"));
        clickRadioButton.click();


//        4. Verify “Hockey” radio button is selected after clicking.

     /*
           if(clickRadioButton.isSelected()){
              System.out.println("Hockey button is Selected!");
           } else {
               System.out.println("Hockey button is not selected!");
           }
      */


        System.out.println("clickRadioButton.isSelected() = " + clickRadioButton.isSelected());

        // Test all radio buttons if they are working

        List<WebElement> sportRadioBtns = driver.findElements(By.xpath("//input[@name='sport']"));

        for (WebElement eachSport : sportRadioBtns){
            eachSport.click();
           if (eachSport.isSelected()){
               System.out.println(eachSport.getAttribute("id") + "Radio button is selected");
           } else {
               System.out.println("Is not selected failed");
           }

        }


        driver.quit();
    }
}
