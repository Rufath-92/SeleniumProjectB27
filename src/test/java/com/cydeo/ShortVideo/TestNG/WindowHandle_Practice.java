package com.cydeo.ShortVideo.TestNG;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandle_Practice {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/windows");
    }

    @Test
    public void windowTest() throws InterruptedException{

        String currentHandle = driver.getWindowHandle();
        System.out.println("currentHandle = " + currentHandle);

        Set<String> allHandles = driver.getWindowHandles();
        System.out.println("allHandles = " + allHandles);

        WebElement clickBtn = driver.findElement(By.linkText("Click Here"));
        clickBtn.click();

        Thread.sleep(2000);

        System.out.println("After clicking button driver.getWindowHandle() = " + driver.getWindowHandle());
        System.out.println("After clicking button driver.getWindowHandles() = " + driver.getWindowHandles());

        allHandles = driver.getWindowHandles();
        for(String eachHandle : allHandles){
            System.out.println("eachHandle = " + eachHandle);
            driver.switchTo().window(eachHandle);
            System.out.println("driver.getTitle() = " + driver.getTitle());
        }



    }

    @AfterMethod
    public void tearMethod(){
        driver.quit();
    }

}
