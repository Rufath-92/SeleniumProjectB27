package com.cydeo.tests.day3_locators_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_getText_cssSelector_Practice {
    public static void main(String[] args) {

//        1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

//        2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        WebElement resetPassword = driver.findElement(By.cssSelector("button.login-btn"));

        String expectedText = "Reset password";
        String actualText = resetPassword.getText();
        System.out.println(actualText.equals(expectedText) ? "Text verification passed!" : "Text verification failed!");


//        3- Verify “Reset password” button text is as expected:
//        Expected: Reset password

        driver.quit();
    }
}
