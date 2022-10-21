package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarInsuranceAppVerification {
    public static void main(String[] args) {

        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2. go to https://www.qa1.excelsorinsurance.com/login
        driver.get("https://www.qa1.excelsoirinsurance.com/login");
        //3. Verify URL contains Excepted: "excelsoirinsurance"
        String exceptedURL = "excelsoirinsurance";  // comes from requirement
        String actualURL = driver.getCurrentUrl();  // comes from browser
        if(actualURL.contains(exceptedURL)){
            System.out.println("URL verification is  passed");
        } else {
            System.out.println("URL verification is failed");
        }

        //4. Verify title: Excepted: "Login | Excelsoir Insurance"
        String exceptedTitle = "Login | Excelsoir Insurance";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(exceptedTitle)){
            System.out.println("Title verification passed");
        } else {
            System.out.println("Title verification failed");
        }



        driver.quit();


    }
}
