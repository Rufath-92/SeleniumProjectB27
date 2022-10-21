package com.cydeo.HomeWork.Day5;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HW1 {

//    TC #4: Selecting state from State dropdown and verifying
//            result

    WebDriver driver;

    //  1. Open Chrome browser
    @BeforeMethod
    public void setUpMethod(){
         driver = WebDriverFactory.getDriver("chrome");
    }


    @Test
    public void stateDropDown (){
        //  2. Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");



        //            3. Select Illinois
        //            4. Select Virginia
        //            5. Select California
        Select selectState = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        selectState.selectByIndex(14);
        selectState.selectByValue("VA");
        selectState.selectByVisibleText("California");


        //  6. Verify
        //    final selected option is California.
        String actualStateSelect = selectState.getFirstSelectedOption().getText();
        String exceptedStateSelect = "California";
        Assert.assertEquals(actualStateSelect,exceptedStateSelect,"California is not selected");


        //    Use all Select options. (visible text, value, index)

    }

   @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
