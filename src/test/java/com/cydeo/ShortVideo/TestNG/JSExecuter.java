package com.cydeo.ShortVideo.TestNG;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JSExecuter extends TestBase {

    @Test
    public void scrollingTest(){
        driver.get("http://practice.cydeo.com/");

        WebElement cydeoLink = driver.findElement(By.linkText("CYDEO"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        BrowserUtils.sleep(2);
        js.executeScript("arguments[0].scrollIntoView(true);" + "arguments[0].click()",cydeoLink);
        BrowserUtils.sleep(2);

    }
}
