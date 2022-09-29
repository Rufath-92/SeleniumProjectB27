package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CydeoTitleVerification {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://cydeo.com/");

        Thread.sleep(5000);

        String exceptTitle = "Cydeo";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(exceptTitle)){
            System.out.println("Title verification PASSED");
        } else {
            System.out.println("Title verification FAILED");
        }


        driver.quit();


    }
}
