package com.cydeo.tests.day3_selenium_cssSelector_xPath.shortvideo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P12_LocateElementByCSS {
    public static void main(String[] args) throws InterruptedException {

        // setup chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // navigate to google.com
        driver.get("https://www.google.com");

        // search for cydeo
        WebElement searchBox = driver.findElement(By.cssSelector("input[name=\"q\"]"));
        searchBox.sendKeys("cydeo" + Keys.ENTER);

        Thread.sleep(2000);


        //verify Cydeo linkText is appeared in the results
        WebElement cydeoText = driver.findElement(By.cssSelector("a[href=\"https://cydeo.com/\"]>h3"));
        if(cydeoText.getText().equals("Cydeo")){
            System.out.println("Cydeo text test is passed");
        } else {
            System.out.println("Cydeo text is failed");
        }


        //close the browser
        driver.quit();
    }
}
