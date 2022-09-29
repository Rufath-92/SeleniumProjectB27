package com.cydeo.tests.day1_selenium_intro.shortvideo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {

        // 1- Setting up the Web Driver Manager

        WebDriverManager.chromedriver().setup();

        // 2- Creating instance of Chrome Driver

        WebDriver driver = new ChromeDriver();

        // 3 -Test if Driver is working

        driver.get("https://www.google.com");
    }
}