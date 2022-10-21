package com.cydeo.tests.day6_alerts_iframe_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T5_WindowsPractice {

//    1. Create a new class called: T5_WindowsPractice


    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        //     2. Create new test and make set up
        //     3. Go to : https://practice.cydeo.com/windows
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/windows");
    }

    @Test
    public void windowsTask(){
        //     4. Assert: Title is “Windows”
        String actualTitle = driver.getTitle();
        String expectedTitle = "Windows";
        Assert.assertEquals(actualTitle,expectedTitle);

        System.out.println("Before opening new window " + actualTitle);


        //     5. Click to: “Click Here” link
        WebElement clickBtn = driver.findElement(By.xpath("//a[.='Click Here']"));
        clickBtn.click();

        System.out.println("After opening new window " + actualTitle);

        //     6. Switch to new Window.
        for (String eachWindow : driver.getWindowHandles()) {
            driver.switchTo().window(eachWindow);
            System.out.println("eachWindow = " + eachWindow);
            System.out.println("driver.getTitle() = " + driver.getTitle());
        }

        //     7. Assert: Title is “New Window”
        String actualTitle1 = driver.getTitle();
        String expectedTitle1 = "New Window";

        Assert.assertEquals(actualTitle1,expectedTitle1);
    }

    @AfterMethod
    public void tearMethod(){
        driver.quit();
    }
}
