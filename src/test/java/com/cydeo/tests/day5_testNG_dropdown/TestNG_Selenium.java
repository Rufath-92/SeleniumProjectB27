package com.cydeo.tests.day5_testNG_dropdown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Selenium {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");

    }

    @Test
    public void googleTitle(){

        driver.get("https://Google.com");

        String actualTitle = driver.getTitle();
        String expected = "Google";

        Assert.assertEquals(actualTitle,expected,"Title is not matching");


    }

    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }
}
