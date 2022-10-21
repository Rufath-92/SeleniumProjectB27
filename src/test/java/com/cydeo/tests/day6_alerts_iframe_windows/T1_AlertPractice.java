package com.cydeo.tests.day6_alerts_iframe_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T1_AlertPractice {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        //    1. Open browser
        //    2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void alertTask1(){

        //    3. Click to “Click for JS Alert” button
        WebElement informationAlertBtn = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        informationAlertBtn.click();


        //    4. Click to OK button from the alert     // we have to use Alert for switching driver to alert form
        Alert alert = driver.switchTo().alert();

        // If you want to get the text of alert window you can use getText()
        System.out.println("alert.getText() = " + alert.getText());

        alert.accept();


        //5. Verify "You successfully clicked an alert" text is displayed
        WebElement textMessage = driver.findElement(By.xpath("//p[@id='result']"));

        String actualTextMessage = textMessage.getText();
        String expectedTextMessage = "You successfully clicked an alert";
        Assert.assertEquals(actualTextMessage,expectedTextMessage,"Passed!");
        Assert.assertTrue(textMessage.isDisplayed());

    }

    @AfterMethod
    public void tearMethod(){
        driver.quit();
    }
}
