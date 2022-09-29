package com.cydeo.tests.day2_selenium_locators_getText_getAttribute.shortvideo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PO5_LocateElementsByID {

    public static void main(String[] args) {


        // set up chrome and create WebDriver instance

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // make the window maximized
        driver.manage().window().maximize();

        // navigate to google.com
        driver.get("https://google.com");

        // identify "I'm Felling Lucky" element and save the element

        WebElement luckyText = driver.findElement(By.id("gbqfbb"));

        // find value of attribute

        String text = luckyText.getAttribute("value");

        // verify if value is "I'm Feeling Lucky"
        if(text.equals("I'm Feeling Lucky")){
            System.out.println("Test is pass");
        } else {
            System.out.println("Test is fail");
        }

        driver.close();
    }
}
