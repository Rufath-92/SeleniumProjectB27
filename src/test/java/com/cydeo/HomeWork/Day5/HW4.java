package com.cydeo.HomeWork.Day5;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class HW4 {

//    TC #7: Selecting value from multiple select dropdown


//            3. Select all the options from multiple select dropdown.
//            4. Print out all selected values.
//            5. Deselect all values.

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //            1. Open Chrome browser
         driver = WebDriverFactory.getDriver("chrome");
    }



    @Test
    public void selectMultiDropdown(){
        //            2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

        WebElement multipleDropdown = driver.findElement(By.xpath("//select[@name='Languages']"));
        Select selectMultipleDropdown = new Select(multipleDropdown);
        selectMultipleDropdown.selectByValue("java");
        selectMultipleDropdown.selectByVisibleText("JavaScript");
        selectMultipleDropdown.selectByIndex(2);
        selectMultipleDropdown.selectByValue("python");
        selectMultipleDropdown.selectByVisibleText("Ruby");
        selectMultipleDropdown.selectByIndex(5);

        List<WebElement> allSelected = selectMultipleDropdown.getAllSelectedOptions();
        for (WebElement each : allSelected) {
            System.out.println(each.getAttribute("text"));
        }



//        WebElement multipleDropdown = driver.findElement(By.xpath("//select[@name='Languages']"));
//        Select selectMultipleDropdown = new Select(multipleDropdown);
//        int num = selectMultipleDropdown.getAllSelectedOptions().size();
//        for (int i = 0; i<num; i++){
//            selectMultipleDropdown.selectByIndex(i);
//        }
//
//        List<WebElement> allSelected = selectMultipleDropdown.getAllSelectedOptions();
//        for (WebElement each : allSelected) {
//            System.out.println(each.getAttribute("text"));
//        }



    }


    @AfterMethod
    public void tearMethod(){
        driver.quit();
    }

}
