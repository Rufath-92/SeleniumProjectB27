package com.cydeo.tests.day5_selenium_testNG_dropdown.shortvideo;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P18_HTML_Dropdown {
    public static void main(String[] args) {

        // set up chrome driver and open chrome
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // navigate to checkbox page from practice site
        driver.get("http://practice.cydeo.com/dropdown");

        // Click to open dropDown which has no select tag
        WebElement dropDownLink = driver.findElement(By.id("dropdownMenuLink"));
        dropDownLink.click();

        // Click item(link) with text Yahoo
        WebElement itemYahoo = driver.findElement(By.linkText("Yahoo"));
        itemYahoo.click();

        // quit the browser
        driver.quit();
    }
}
