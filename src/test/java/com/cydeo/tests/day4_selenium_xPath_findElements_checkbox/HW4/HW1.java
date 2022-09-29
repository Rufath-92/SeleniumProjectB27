package com.cydeo.tests.day4_selenium_xPath_findElements_checkbox.HW4;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HW1 {
    public static void main(String[] args) {


//        XPATH Practice
//        DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
//        TC #6:  XPATH LOCATOR practice
//        1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

//        2. Go to http://practice.cydeo.com/multiple_buttons
        driver.get("https://practice.cydeo.com/multiple_buttons");


//        3. Click on Button 1
        WebElement clickButton = driver.findElement(By.xpath("//button[.='Button 1']"));
        clickButton.click();

//        4. Verify text displayed is as expected:
//        Expected: “Clicked on button one!”
        WebElement buttonText = driver.findElement(By.xpath("//p[@id='result']"));
        String expectedResult = "Clicked on button one!";
        String actualResult = buttonText.getText();

        if(actualResult.equals(expectedResult)){
            System.out.println("Button 1 verification text passed!");
        } else {
            System.out.println("Button 1 verification text failed!");
        }
//
//        USE XPATH LOCATOR FOR ALL WEB-ELEMENT LOCATORS

        driver.quit();
    }
}
