package com.cydeo.tests.day3_selenium_cssSelector_xPath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_Locators_getText {
    public static void main(String[] args) throws InterruptedException {


//        1- Open a chrome browser
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();

       WebDriver driver = WebDriverFactory.getDriver("chrome");

//        2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

//        3- Enter incorrect username: “incorrect”
        WebElement inputUserName = driver.findElement(By.name("USER_LOGIN"));
        inputUserName.sendKeys("incorrect");


//        4- Enter incorrect password: “incorrect”
        WebElement inputUserPassword = driver.findElement(By.name("USER_PASSWORD"));
       inputUserPassword.sendKeys("incorrect");

       Thread.sleep(2000);

//        5- Click to login button.
        WebElement clickLogin = driver.findElement(By.className("login-btn"));
        clickLogin.click();

//        6- Verify error message text is as expected:  Expected: Incorrect login or password

        WebElement incorrectResult = driver.findElement(By.className("errortext"));
        String expected = "Incorrect login or password";
        String actual = incorrectResult.getText();
        System.out.println(actual.equals(expected) ? "Test passed" : "Test failed");

        Thread.sleep(2000);


        driver.quit();
        
        
    }
}
