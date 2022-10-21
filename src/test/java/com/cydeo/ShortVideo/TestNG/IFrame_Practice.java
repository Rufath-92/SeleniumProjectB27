package com.cydeo.ShortVideo.TestNG;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class IFrame_Practice {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/iframe");
    }

    @Test
    public void IFrameTest(){
        WebElement Iframe = driver.findElement(By.id("mce_0_ifr"));

         // driver.switchTo().frame(Iframe);
         // driver.switchTo().frame(0);
            driver.switchTo().frame("mce_0_ifr");

            WebElement textArea = driver.findElement(By.tagName("p"));
            assertTrue(textArea.isDisplayed());

            driver.switchTo().parentFrame();
    }

    @AfterMethod
    public void tearMethod(){
        driver.quit();
    }

}
