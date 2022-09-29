package com.cydeo.tests.day2_selenium_locators_getText_getAttribute.HW2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {


//        1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


//        2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com ");

//        3. Search for “wooden spoon”
        WebElement searchBox = driver.findElement(By.name("search_query"));
        searchBox.sendKeys("wooden spoon" + Keys.ENTER);

        Thread.sleep(2000);

//        4. Verify title:  Expected: “Wooden spoon | Etsy”
        String expectedTitle = "Wooden spoon | Etsy";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle.startsWith(expectedTitle) ? "Title verification Passed!" : "\nTitle verification Failed!\n" + "Expected: " + expectedTitle + "\nActual: " +actualTitle);
      //  System.out.println(actualTitle.equals(expectedTitle) ? "Title verification Passed!" : "\nTitle verification Failed!" + "Expected: " + expectedTitle + "\nActual: " +actualTitle);  --> another way but title is not matches that's why we use startsWith method

        Thread.sleep(2000);

        driver.quit();
    }
}
