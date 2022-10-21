package com.cydeo.ShortVideo.TestNG;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DataProviderExample {

    WebDriver driver;

    @Test(dataProvider = "searchData")
    public void test1(String keyword,String expectedTitle){
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://google.com");

        
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(keyword + Keys.ENTER);
        assertEquals(driver.getTitle(),expectedTitle);

        driver.quit();
    }

    @DataProvider(name = "searchData")
    public Object [][] testData(){
        return new Object[][]{
                {"selenium","selenium - Google Search"},
                {"java","java - Google Search"},
                {"job","job - Google Search"},
                {"cydeo","cydeo - Google Search"}
        };

    }
}
