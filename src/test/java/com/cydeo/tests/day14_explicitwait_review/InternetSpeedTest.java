package com.cydeo.tests.day14_explicitwait_review;

import com.cydeo.pages.InternetSpeedPage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class InternetSpeedTest {

    @Test
    public void internet_speed_test(){

        //TC #2: Explicit wait practice
//        1- Open a chrome browser
//        2- Go to: https://www.speedtest.net/
        Driver.getDriver().get("https://www.speedtest.net/");

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(100));
    InternetSpeedPage internetSpeedPage = new InternetSpeedPage();
//        3- Wait until Results link is displayed
        wait.until(ExpectedConditions.visibilityOf(internetSpeedPage.resultLink));

//        4- Click on Go button
//        5- Wait until gauge-speed-needle displayed
//        6- Wait until gauge-speed-needle disappear
//        7- Print Download and Upload Speeds
        internetSpeedPage.speedTesting();

        Driver.closeDriver();
    }
}
