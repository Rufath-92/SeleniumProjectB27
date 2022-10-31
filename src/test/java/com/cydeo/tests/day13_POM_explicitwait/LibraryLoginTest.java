package com.cydeo.tests.day13_POM_explicitwait;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LibraryLoginTest {

    LibraryLoginPage libraryLoginPage;

    @BeforeMethod
    public void beforeClass() {
        Driver.getDriver().get(ConfigReader.getProperty("library.url"));
        libraryLoginPage = new LibraryLoginPage();
    }


    @Test
    public void required_field_error_message_test(){


//                TC #1: Required field error message test
//        1- Open a chrome browser
//        2- Go to: https://library1.cydeo.com

       // Driver.getDriver().get(ConfigReader.getProperty("library.url"));

//        3- Do not enter any information
//        4- Click to “Sign in” button

      //  LibraryLoginPage libraryLoginPage = new LibraryLoginPage();

        libraryLoginPage.signInBtn.click();


//        5- Verify expected error is displayed:
//        Expected: This field is required.

        Assert.assertTrue(libraryLoginPage.fieldRequiredErrorMsg.isDisplayed());
    }

    @Test
    public void invalid_email_format_error_message_test(){
//        TC #2: Invalid email format error message test

//        1- Open a chrome browser
//        2- Go to: https://library1.cydeo.com
       // Driver.getDriver().get(ConfigReader.getProperty("library.url"));


//        3- Enter invalid email format
//        LibraryLoginPage libraryLoginPage = new LibraryLoginPage();
        libraryLoginPage.login("dsafa","asdfgag");


//        4- Verify expected error is displayed:
//        Expected: Please enter a valid email address.
        Assert.assertTrue(libraryLoginPage.enterInvalidEmailErrorMsg.isDisplayed());

    }

    @Test
    public void negative_wrong_Email_And_Password_ErrorMsg(){

//        TC #3: Library negative login

//        1- Open a chrome browser
//        2- Go to: https://library1.cydeo.com

//        3- Enter incorrect username or incorrect password

        libraryLoginPage.login("sdfagf@gmail.com","fdagfagf");


//        4- Verify title expected error is displayed:
//        Expected: Sorry, Wrong Email or Password

        Assert.assertTrue(libraryLoginPage.wrongEmailAndPasswordErrorMsg.isDisplayed());
    }

    @Test
    public void library_positive_login_test(){

//        TC #3: Library negative login

//        1- Open a chrome browser
//        2- Go to: https://library1.cydeo.com

//        3- Enter incorrect username or incorrect password
        libraryLoginPage.email.sendKeys(ConfigReader.getProperty("library1.student.email"));
        libraryLoginPage.password.sendKeys(ConfigReader.getProperty("library1.student.password"));
        libraryLoginPage.signInBtn.click();
    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }
}
