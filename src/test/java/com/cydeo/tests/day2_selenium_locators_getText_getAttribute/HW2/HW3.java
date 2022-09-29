package com.cydeo.tests.day2_selenium_locators_getText_getAttribute.HW2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3 {
    public static void main(String[] args) throws InterruptedException {

//        1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        2- Go to: https://google.com
        driver.get("https://google.com");
        Thread.sleep(2000);

//        3- Click to Gmail from top right.
        WebElement gmailButton = driver.findElement(By.linkText("Gmail"));
        gmailButton.click();

//        4- Verify title contains:  Expected: Gmail
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle.contains(expectedTitle) ? "Title verification Passed!" : "Title verification Failed!" + "Expected: " + expectedTitle + "Actual: " + actualTitle);

//        5- Go back to Google by using the .back();
        driver.navigate().back();
        Thread.sleep(2000);

//        6- Verify title equals:  Expected: Google
        String expectTitle = "Google";
        String realTitle = driver.getTitle();
        System.out.println(realTitle.equals(expectTitle) ? "Title verification Passed!" : "Title verification Failed!" + "Expect Title: " + expectTitle + "Real title: " + realTitle);


        driver.quit();
    }

}
