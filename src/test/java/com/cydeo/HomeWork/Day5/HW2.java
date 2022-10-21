package com.cydeo.HomeWork.Day5;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HW2 {
    //        TC #5: Selecting date on dropdown and verifying

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        //    1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
    }

    @Test
    public void dateDropDown(){
        //    2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");


        //         3. Select “December 1st, 1923” and verify it is selected.
        //        Select year using   : visible text
        //        Select month using    : value attribute Select
        //        day using : index number
        WebElement selectYearDrop = driver.findElement(By.xpath("//select[@id='year']"));
        Select selectYear = new Select(selectYearDrop);
        selectYear.selectByVisibleText("1923");

        String exceptedYear = "1923";
        String actualYear = selectYear.getFirstSelectedOption().getText();
        Assert.assertEquals(actualYear,exceptedYear);


        WebElement selectMonthDrop = driver.findElement(By.xpath("//select[@id='month']"));
        Select selectMonth = new Select(selectMonthDrop);
        selectMonth.selectByIndex(11);

        String expectedMonth = "December";
        String actualMonth = selectMonth.getFirstSelectedOption().getText();
        Assert.assertEquals(actualMonth,expectedMonth);


        WebElement selectDayDrop = driver.findElement(By.xpath("//select[@id='day']"));
        Select selectDay = new Select(selectDayDrop);
        selectDay.selectByValue("1");

        String expectedDay = "1";
        String actualDay = selectDay.getFirstSelectedOption().getText();
        Assert.assertEquals(actualDay,expectedDay);



    }

    @AfterMethod
    public void tearMethod(){
        driver.quit();
    }
}
