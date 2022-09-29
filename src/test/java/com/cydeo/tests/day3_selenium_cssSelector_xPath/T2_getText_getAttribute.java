package com.cydeo.tests.day3_selenium_cssSelector_xPath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    public static void main(String[] args) {

        //        1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

//        2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

//        3- Verify “remember me” label text is as expected:
//        Expected: Remember me on this computer
        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));
        String expectedRememberMeLabel = "Remember me on this computer";
        String actualRememberMeLabel = rememberMeLabel.getText();

        System.out.println(actualRememberMeLabel.equals(expectedRememberMeLabel) ? "Remember me label text verification passed!" : "Remember me label text verification failed!");

//        4- Verify “forgot password” link text is as expected:
//        Expected: FORGOT YOUR PASSWORD?
        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));
        String expectedForgotPasswordLink = "FORGOT YOUR PASSWORD?";
        String actualForgotPasswordLink = forgotPasswordLink.getText();

        System.out.println(actualForgotPasswordLink.equals(expectedForgotPasswordLink) ? "Forgot password link text verification passed!" : "Forgot password link text verification failed!");
        System.out.println("actualForgotPasswordLink = " + actualForgotPasswordLink);
        System.out.println("expectedForgotPasswordLink = " + expectedForgotPasswordLink);

//                5- Verify “forgot password” href attribute’s value contains expected:
//        Expected: forgot_password=yes
        String expectedInHref = "forgot_password=yes";
        String actualInHref = forgotPasswordLink.getAttribute("href");
        System.out.println(actualInHref.contains(expectedInHref) ? "Href attribute value verification passed!" : "Href attribute value verification failed!");

        driver.quit();
    }
}
