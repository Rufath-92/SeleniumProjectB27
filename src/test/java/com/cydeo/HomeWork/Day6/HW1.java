package com.cydeo.HomeWork.Day6;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HW1 {


//    TC #2: Confirmation alert practice
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        //      1. Open browser
        //      2. Go to website: http://practice.cydeo.com/javascript_alerts

        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void alertTask1() throws InterruptedException {
        //      3. Click to “Click for JS Confirm” button
        WebElement clickBtn = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        clickBtn.click();

        Thread.sleep(2000);

        //      4. Click to OK button from the alert
        Alert alertClickBtnConfirm = driver.switchTo().alert();

        System.out.println("alertClickBtn = " + alertClickBtnConfirm.getText());

        alertClickBtnConfirm.accept();

        //      5. Verify “You clicked: Ok” text is displayed.
        WebElement verifyText = driver.findElement(By.xpath("//p[@id='result']"));
        String actual = verifyText.getText();
        String expected = "You clicked: Ok";
        Assert.assertEquals(actual,expected,"Test passed!");
        System.out.println(verifyText.isDisplayed());

//        System.out.println("expected = " + expected);
//        System.out.println("actual = " + actual);                 ----> extra practice
//        System.out.println("verifyText = " + verifyText.getText());


    }

    @AfterMethod
    public void tearMethod(){
        driver.quit();
    }

}
