package com.cydeo.tests.day7_windows_webtable;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class T1_multipleWindows {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        //    1. Open a chrome browser
        //    2. Go to : https://practice.cydeo.com/windows
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/windows");

    }

    @Test
    public void multiple_windows_test(){

        //    3. Assert: Title is “Windows”
        Assert.assertEquals(driver.getTitle(),"Windows");


        //    4. Click to: “Click Here” link
        WebElement clickHere = driver.findElement(By.xpath("//a[.='Click Here']"));
        clickHere.click();


        //    5. Click to: “CYDEO” link
        WebElement clickCydeo = driver.findElement(By.linkText("CYDEO"));
        clickCydeo.click();


        //    6. Switch to Cydeo page.
        Set<String> allWindows = driver.getWindowHandles();
        for (String eachWindow : allWindows) {
            driver.switchTo().window(eachWindow);
            System.out.println("driver.getTitle() = " + driver.getTitle());

            if(driver.getTitle().equals("Cydeo")){
                break;
            }

        }

        //    7. Assert: Title is “Cydeo”
         Assert.assertEquals(driver.getTitle(),"Cydeo");
    }

    @AfterMethod
    public void tearDown() {
       // driver.close();
        driver.quit();
    }
}
