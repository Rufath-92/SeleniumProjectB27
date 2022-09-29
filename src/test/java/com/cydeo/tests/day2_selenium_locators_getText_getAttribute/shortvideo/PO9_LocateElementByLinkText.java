package com.cydeo.tests.day2_selenium_locators_getText_getAttribute.shortvideo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PO9_LocateElementByLinkText {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        // identify and save the About link element on the top

        WebElement link = driver.findElement(By.linkText("About"));

        // Click on the Link
        link.click();


        // close the browser
        driver.quit();
    }
}
