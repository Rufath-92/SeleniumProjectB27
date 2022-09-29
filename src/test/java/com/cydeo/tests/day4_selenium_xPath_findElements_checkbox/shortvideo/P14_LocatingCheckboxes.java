package com.cydeo.tests.day4_selenium_xPath_findElements_checkbox.shortvideo;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P14_LocatingCheckboxes {
    public static void main(String[] args) {

        // setup chrome driver and open chrome
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // navigate to checkbox page from practice site
        driver.get("https://practice.cydeo.com/checkboxes");

        WebElement checkbox1 = driver.findElement(By.id("box1"));
        System.out.println("Before click checkbox1.isSelected() = " + checkbox1.isSelected());
        checkbox1.click();
        System.out.println("After click checkbox1.isSelected() = " + checkbox1.isSelected());


        WebElement checkbox2 = driver.findElement(By.id("box2"));
        System.out.println("Before click checkbox1.getAttribute() = " + checkbox2.getAttribute("checked"));
        checkbox2.click();
        System.out.println("After click checkbox1.getAttribute() = " + checkbox2.getAttribute("checked"));

        // if we want to check the checkbox

        if(checkbox1.isSelected()){
            System.out.println("checkbox1 is already selected");
        } else {
            checkbox1.click();
        }



        driver.quit();
    }

}
