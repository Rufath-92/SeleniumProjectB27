package com.cydeo.ShortVideo.Selenium;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P16_LocatingDropDownList {
    public static void main(String[] args) {

        // set up chrome driver and open chrome
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // navigate to checkbox page from practice site
        driver.get("http://practice.cydeo.com/dropdown");

        // identify the select element
        WebElement dropDownElement = driver.findElement(By.id("dropdown"));


        //wrap this element inside Select object
        Select selectObj = new Select(dropDownElement);

        //use ready methods to select option
        selectObj.selectByIndex(2);
        selectObj.selectByValue("2");
        selectObj.selectByVisibleText("Option 2");

        // verify determined option is selected
        String expectedOpt = "Option 2";
        String actualOpt = selectObj.getFirstSelectedOption().getText();
        System.out.println(actualOpt.equals(expectedOpt) ? "Option 2 selection passed" : "Option 2 selection failed");


        driver.quit();

    }
}
