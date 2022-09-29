package com.cydeo.tests.day2_selenium_locators_getText_getAttribute.shortvideo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
    public static void main(String[] args) {

        // 1 - Setting up the web driver manager
        WebDriverManager.chromedriver().setup();
       // System.setProperty("webdriver.chrome.driver","/Users/rufath/Desktop/chromedriver");  ---> this is another way to get web page without WebDriverManager


        // 2 - Create instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.close();
    }
}
