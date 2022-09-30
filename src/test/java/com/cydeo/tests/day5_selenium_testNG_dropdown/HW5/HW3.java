package com.cydeo.tests.day5_selenium_testNG_dropdown.HW5;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HW3 {


//    TC #6: Selecting value from non-select dropdown
    WebDriver driver;


    @BeforeMethod
    public void setupMethod(){
        //1. Open Chrome browser
         driver = WebDriverFactory.getDriver("chrome");

    }

    @Test
    public void linkDropDown(){
        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

        //            3. Click to non-select dropdown
        WebElement nonSelectDropdown = driver.findElement(By.xpath("//a[@id='dropdownMenuLink']"));
        nonSelectDropdown.click();

        //4. Select Facebook from dropdown
        WebElement  selectFacebook = driver.findElement(By.xpath("//a[.='Facebook']"));
        selectFacebook.click();


        //5. Verify title is “Facebook - Log In or Sign Up”
        String actualFacebookTitle = driver.getTitle();
        String expectedFacebookTitle = "Facebook - Log In or Sign Up";
        Assert.assertEquals(actualFacebookTitle,expectedFacebookTitle, "Title doesn't matching");




    }

    @AfterMethod
    public void tearMethod(){
        driver.quit();
    }
}
