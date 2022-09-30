package com.cydeo.tests.day5_selenium_testNG_dropdown.shortvideo;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P17_LocatingDropdownList_Multiple {
    public static void main(String[] args) throws InterruptedException {

        // set up chrome driver and open chrome
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cydeo.com/dropdown");

        // identify the dropdown with multiple select options
        WebElement multiItemDropdown = driver.findElement(By.name("Languages"));

        // wrap this element into Select object
        Select multiItemSelect = new Select(multiItemDropdown);

        // check if this element has multi select option
        System.out.println("multiItemSelect.isMultiple() = " + multiItemSelect.isMultiple());


        // select items
        multiItemSelect.selectByIndex(2);
        multiItemSelect.selectByValue("ruby");
        multiItemSelect.selectByVisibleText("Python");

        Thread.sleep(2000);

        // deselect items
//        multiItemSelect.deselectByIndex(2);
//        multiItemSelect.deselectByValue("ruby");
//        multiItemSelect.deselectByVisibleText("Python");
        multiItemSelect.deselectAll();


        driver.quit();

    }
}
