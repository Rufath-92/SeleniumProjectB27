package com.cydeo.tests.day4_xpath_findElements_checkbox;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {
    public static void main(String[] args) {



//    1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

//     2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://mail.google.com/mail/u/0/#inbox");


//     3. Locate all the WebElements on the page using XPATH and/or CSS
//    locator only (total of 6)
//    a. “Home” link- cssSelector(gmail Button)
        WebElement gmailButtonCssSelector = driver.findElement(By.cssSelector("img[class='gb_yc']"));
        WebElement gmailButton2CssSelector = driver.findElement(By.cssSelector("img.gb_yc"));
        WebElement gmailButton3CssSelector = driver.findElement(By.cssSelector("a[title='Почта']>img"));


        // a. “Home” link- xPath (gmail Button)
        WebElement gmailButtonXpath = driver.findElement(By.xpath("//img[@src='https://ssl.gstatic.com/ui/v1/icons/mail/google_workspace_2x.png']"));
        WebElement gmailButtonXpath1 = driver.findElement(By.xpath("//img[contains(@width,'256')]"));
        WebElement gmailButtonXpath2 = driver.findElement(By.xpath("//*[@height='34']"));



//    b. “Forgot password” header (search Button)
        WebElement searchButtonCssSelector = driver.findElement(By.cssSelector("input[class='gb_df aJh']"));
        WebElement searchButton2CssSelector = driver.findElement(By.cssSelector("input[class='gb_df aJh']"));

//    c. “E-mail” text
//    d. E-mail input box
//    e. “Retrieve password” button
//    f. “Powered by Cydeo text
//      4. Verify all web elements are displayed.
}
}
