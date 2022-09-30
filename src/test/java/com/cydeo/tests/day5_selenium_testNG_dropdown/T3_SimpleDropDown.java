package com.cydeo.tests.day5_selenium_testNG_dropdown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T3_SimpleDropDown {


    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        //    1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @Test
    public void simpleDropDown(){
        //     2. Go to https://practice.cydeo.com/dropdown


        //            3. Verify “Simple dropdown” default selected value is correct
        //                                        Expected: “Please select an option”

        Select simpleDropDown = new Select(driver.findElement(By.id("dropdown")));
        String actualSimpleDropDown = simpleDropDown.getFirstSelectedOption().getText();
        String expectedSimpleDropDown = "Please select an option";

        Assert.assertEquals(actualSimpleDropDown,expectedSimpleDropDown);

    }


    @Test
    public void stateSelectionDropDown()  {
//        4. Verify “State selection” default selected value is correct
//        Expected: “Select a State”


        WebElement dropDown = driver.findElement(By.id("state"));
        Select stateSelectionDropDown = new Select(dropDown);
        String actualDropDown = stateSelectionDropDown.getFirstSelectedOption().getText();
        String expectedDropDown = "Select a State";


        Assert.assertEquals(actualDropDown,expectedDropDown);
    }


    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }



}
