package com.cydeo.ShortVideo.TestNG;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class Synchronization_Explicit_Wait extends TestBase {

    @Test
    public void test_WaitForExpectedTitle(){
        driver.get("https://practice.cydeo.com/dynamic_loading");

       driver.findElement(By.partialLinkText("Example 7")).click();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(titleIs("Dynamic title"));

        WebElement doneMsg = driver.findElement(By.id("alert"));
        Assert.assertTrue(doneMsg.isDisplayed());


    }
}
