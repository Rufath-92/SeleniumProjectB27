package com.cydeo.ShortVideo;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import org.testng.annotations.Test;

public class LibraryLoginTest {

    @Test
    public void positiveLoginTest(){

        Driver.getDriver().get(ConfigReader.getProperty("library.url"));
        LibraryLoginPage loginPage = new LibraryLoginPage();

//        loginPage.email.sendKeys(ConfigReader.getProperty("library3.student.email"));
//        loginPage.password.sendKeys(ConfigReader.getProperty("library3.student.password"));
//        loginPage.signInBtn.click();

        loginPage.login("librarian1@library","qU9mrvur");

    }

    @Test
    public void negativeLoginTest(){
        Driver.getDriver().get(ConfigReader.getProperty("library.url"));
        LibraryLoginPage loginPage = new LibraryLoginPage();

//        loginPage.email.sendKeys("abc@gmail.com");
//        loginPage.password.sendKeys("abca");
//        loginPage.signInBtn.click();

        loginPage.login("abc@gmail.com","abca");

    }
}
