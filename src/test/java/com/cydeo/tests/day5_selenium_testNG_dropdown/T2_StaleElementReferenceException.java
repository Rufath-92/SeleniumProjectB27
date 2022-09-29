package com.cydeo.tests.day5_selenium_testNG_dropdown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_StaleElementReferenceException  {
    public static void main(String[] args) throws InterruptedException {


//        1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");


//        2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/");


//        3. Click to “Add Element” button
        WebElement addElementButton = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        addElementButton.click();

        Thread.sleep(2000);

//        4. Verify “Delete” button is displayed after clicking.
        WebElement deleteButton = driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
       System.out.println("addElementButton.isDisplayed() = " + deleteButton.isDisplayed());


//        5. Click to “Delete” button.
        deleteButton.click();


//        6. Verify “Delete” button is NOT displayed after clicking. USE
    //    System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());

        try{
            System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());

        } catch (StaleElementReferenceException e) {
            System.out.println("Delete button is not here");
        }


        driver.quit();
    }
}
