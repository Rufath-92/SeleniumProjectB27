package com.cydeo.tests.day6_selenium_alerts_iframe_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownPractices {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
         driver = WebDriverFactory.getDriver("chrome");
         driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test(priority = 2)
    public void dropDownTask4(){
//        1. Open Chrome browser
//        2. Go to http://practice.cybertekschool.com/dropdown
//        3. Select Illinois
//        4. Select Virginia
//        5. Select California
//        6. Verify final selected option is California.
//        Use all Select options. (visible text, value, index)

        WebElement dropDown = driver.findElement(By.xpath("//select[@id='state']"));
        Select selectDropdown = new Select(dropDown);
        selectDropdown.selectByValue("IL");
        selectDropdown.selectByVisibleText("Virginia");
        selectDropdown.selectByIndex(5);

        String expected = "California";
        String actual = selectDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actual,expected,"Test passed");


        //finding index number from option
        int index = -1;
        for(WebElement eachState : selectDropdown.getOptions()){
            index++;
            if(eachState.getText().equals("California")){
                System.out.println(index);
            }
        }
    }


    @Test(priority = 1)
    public void dropDownTask7() throws InterruptedException {
//        1. Open Chrome browser
//        2. Go to https://practice.cydeo.com/dropdown
//        3. Select all the options from multiple select dropdown.
//        4. Print out all selected values.
//        5. Deselect all values.

        WebElement multipleLanguages = driver.findElement(By.xpath("//select[@name='Languages']"));
        Select selectMultipleLanguages = new Select(multipleLanguages);

        for (WebElement eachLanguages : selectMultipleLanguages.getOptions()) {
            eachLanguages.click();
            System.out.println("eachLanguages.getText() = " + eachLanguages.getText());
            Thread.sleep(2000);
        }

        Thread.sleep(2000);

        selectMultipleLanguages.deselectAll();

    }

    @AfterMethod
    public void tearMethod(){
        driver.quit();
    }

}
