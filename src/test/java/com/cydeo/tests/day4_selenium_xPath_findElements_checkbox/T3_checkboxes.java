package com.cydeo.tests.day4_selenium_xPath_findElements_checkbox;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_checkboxes {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

//        1. Go to https://practice.cydeo.com/checkboxes
        driver.get("https://practice.cydeo.com/checkboxes");

        WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='box1']"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@id='box2']"));


//        2. Confirm checkbox #1 is NOT selected by default
        System.out.println("checkbox1.isSelected(), expecting false = " + checkbox1.isSelected());

//        3. Confirm checkbox #2 is SELECTED by default.
        System.out.println("checkbox2.isSelected(), expecting true = " + checkbox2.isSelected());

//        4. Click checkbox #1 to select it.
        checkbox1.click();

//        5. Click checkbox #2 to deselect it.
        checkbox2.click();

//        6. Confirm checkbox #1 is SELECTED.
        System.out.println("checkbox1.isSelected(), expecting true = " + checkbox1.isSelected());

//        7. Confirm checkbox #2 is NOT selected.
        System.out.println("checkbox2.isSelected(), expecting false = " + checkbox2.isSelected());

        driver.quit();
    }
}
