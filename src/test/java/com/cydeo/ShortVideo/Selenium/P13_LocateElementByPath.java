package com.cydeo.ShortVideo.Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P13_LocateElementByPath {
    public static void main(String[] args) {

        // setup chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // navigate to google.com
        driver.get("https://www.google.com");

        //search for cydeo
        WebElement searchBox = driver.findElement(By.xpath("//input[@name=\"q\"]"));
        searchBox.sendKeys("cydeo" + Keys.ENTER);

        // verify Cydeo linkText is appeared in the results
        WebElement cydeoText = driver.findElement(By.xpath("//h3[.='Cydeo']"));
        if(cydeoText.getText().equals("Cydeo")){
            System.out.println("Cydeo text is appeared");
        } else {
            System.out.println("Cydep text is not appeared");
        }


        // close the browser
        driver.quit();
    }
}
