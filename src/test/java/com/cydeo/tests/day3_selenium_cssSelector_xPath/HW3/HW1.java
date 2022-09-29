package com.cydeo.tests.day3_selenium_cssSelector_xPath.HW3;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {

//        TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
//        1- Open a chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");

//        2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

//        3- Enter incorrect username into login box:
        WebElement loginBox = driver.findElement(By.cssSelector("input.login-inp"));
        loginBox.sendKeys("rufath10");

//        4- Click to `Reset password` button
        WebElement resetPassword = driver.findElement(By.cssSelector("button.login-btn"));
        resetPassword.click();

//        5- Verify “error” label is as expected
//        Expected: Login or E-mail not found

        WebElement errorLabel = driver.findElement(By.cssSelector("div.errortext"));
        String expectedErrorLabel = "Login or E-mail not found";
        String actualErrorLabel = errorLabel.getText();
        System.out.println(actualErrorLabel.equals(expectedErrorLabel) ? "Verification label passed" : "Verification label failed");

//        PS: Inspect and decide which locator you should be using to locate web
//        elements.
//        PS2: Pay attention to where to get the text of this button from

        Thread.sleep(2000);

        driver.quit();
    }
}
