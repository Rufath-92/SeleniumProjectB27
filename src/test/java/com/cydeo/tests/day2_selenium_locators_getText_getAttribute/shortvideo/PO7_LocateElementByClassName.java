package com.cydeo.tests.day2_selenium_locators_getText_getAttribute.shortvideo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PO7_LocateElementByClassName {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        // identify and save the "Helpful tips to fact check information online" element
        WebElement helpfulText = driver.findElement(By.className("NKcBbd"));

        // verify the "Helpful tips to fact check information online" text appear correctly
        if(helpfulText.getText().equals("Helpful tips to fact check information online")){
            System.out.println("Text appears correctly");
        } else {
            System.out.println("Text doesn't appear correctly");
        }

        // close the browser

        driver.close();

    }

}
