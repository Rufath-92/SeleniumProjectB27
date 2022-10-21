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

public class HW2 {

//    TC #3: Information alert practice
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        //      1. Open browser
        //      2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void alertTask2() throws InterruptedException {
        //      3. Click to “Click for JS Prompt” button
        WebElement clickBtn = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        clickBtn.click();

        Thread.sleep(2000);

        //      4. Send “hello” text to alert
        Alert alertClickBtnPrompt = driver.switchTo().alert();
        alertClickBtnPrompt.sendKeys("hello");

        //      5. Click to OK button from the alert
        alertClickBtnPrompt.accept();


        //      6. Verify “You entered:hello” text is displayed.
        WebElement verifyResult = driver.findElement(By.xpath("//p[@id='result']"));

//        String actual = verifyResult.getText();
//        String expected = "You entered:hello";
        Assert.assertTrue(verifyResult.isDisplayed());
        System.out.println("verifyResult = " + verifyResult.isDisplayed());
    }

    @AfterMethod
    public void tearMethod(){
        driver.quit();
    }

}
