package com.cydeo.tests.day13_POM_explicitwait;


import com.cydeo.pages.DynamicallyLoadedPage_1;
import com.cydeo.pages.DynamicallyLoadedPage_7;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitWaitPractices_DLP_1_7 {

    @Test
    public void dynamically_loaded_page_elements_7_test() {
        //    TC#4 : Dynamically Loaded Page Elements 7
//            1. Go to https://practice.cydeo.com/dynamic_loading/7
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");

        //            2. Wait until title is “Dynamic title”
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleIs("Dynamic title"));

        DynamicallyLoadedPage_7 dynamicallyLoadedPage_7 = new DynamicallyLoadedPage_7();

//            3. Assert: Message “Done” is displayed.
        Assert.assertTrue(dynamicallyLoadedPage_7.doneMsg.isDisplayed());

//            4. Assert: Image is displayed.
        Assert.assertTrue(dynamicallyLoadedPage_7.image.isDisplayed());

        Driver.closeDriver();


    }

    @Test
    public void dynamically_loaded_page_elements_1_test(){
//        TC#5 : Dynamically Loaded Page Elements 1
//        1. Go to https://practice.cydeo.com/dynamic_loading/1
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");

        DynamicallyLoadedPage_1 dynamicallyLoadedPage_1 = new DynamicallyLoadedPage_1();

//        2. Click to start
        dynamicallyLoadedPage_1.startBtn.click();

//        3. Wait until loading bar disappears
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(dynamicallyLoadedPage_1.loadingBar));

//        4. Assert username inputbox is displayed
        Assert.assertTrue(dynamicallyLoadedPage_1.username_inputBox.isDisplayed());

//        5. Enter username: tomsmith
//        6. Enter password: incorrectpassword
//        7. Click to Submit button
        dynamicallyLoadedPage_1.login("tomsmith","incorrectpassword");

//        8. Assert “Your password is invalid!” text is displayed.
        Assert.assertTrue(dynamicallyLoadedPage_1.errorMessage.isDisplayed());
//                Note: Follow POM Design Pattern

        Driver.closeDriver();
    }
}
