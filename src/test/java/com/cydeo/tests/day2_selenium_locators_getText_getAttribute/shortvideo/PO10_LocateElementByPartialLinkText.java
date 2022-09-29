package com.cydeo.tests.day2_selenium_locators_getText_getAttribute.shortvideo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PO10_LocateElementByPartialLinkText {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        Thread.sleep(3000);

        // identify and save the "Helpful tips to fact check information online" element
        WebElement helpfulText = driver.findElement(By.partialLinkText("Helpful tips"));

        //printout
        System.out.println(helpfulText.getText());

        driver.quit();


    }
}
