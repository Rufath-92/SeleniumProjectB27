package com.cydeo.HomeWork.Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) {

//        TC #2: Zero Bank header verification
//        1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement header = driver.findElement(By.tagName("h3"));

//        3. Verify header text: Expected: “Log in to ZeroBank”
        String expectedHeader = "Log in to ZeroBank";
        String actualHeader = header.getText();
        System.out.println(actualHeader.equals(expectedHeader) ? "Header test Passed!" : "Header test Failed!");

        driver.quit();

    }
}
