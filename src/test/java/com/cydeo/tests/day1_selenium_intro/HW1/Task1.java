package com.cydeo.tests.day1_selenium_intro.HW1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");

        Thread.sleep(3000);

        String exceptedTitle = driver.getCurrentUrl();
        //String currentTitle = driver.getTitle();


        if(exceptedTitle.contains("cydeo")){
            System.out.println("Passed URL Test");
        } else {
            System.out.println("Failed URL Test");
        }


        String getTitle = driver.getCurrentUrl();
       // String exceptTitle = driver.getTitle();

        if(getTitle.contains("practice")){
            System.out.println("Title is pass");
        } else {
            System.out.println("Title is fail");
        }


        driver.close();


        }
    }

