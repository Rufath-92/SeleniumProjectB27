package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryAppLogin {
    public static void main(String[] args) throws InterruptedException {

//        1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


//        2. Go to http://library2.cydeoschool.com/login.html
        driver.get("https://library2.cydeo.com/login.html");

//        3. Enter username: “incorrect@email.com”
        WebElement userNameInput = driver.findElement(By.className("form-control"));
        userNameInput.sendKeys("incorrect@email.com");

//        4. Enter password: “incorrect password”
        WebElement userPasswordInput = driver.findElement(By.id("inputPassword"));
        userPasswordInput.sendKeys("incorrect password" + Keys.ENTER);

        Thread.sleep(3000);

        //5. Click to Sign button
        WebElement signInButton = driver.findElement(By.tagName("button"));
        signInButton.click();

        Thread.sleep(2000);


//        6. Displayed Verify: visually “Sorry, Wrong Email or Password”

        driver.quit();

    }
}
