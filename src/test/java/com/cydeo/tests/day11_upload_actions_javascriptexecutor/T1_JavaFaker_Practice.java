package com.cydeo.tests.day11_upload_actions_javascriptexecutor;

import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class T1_JavaFaker_Practice {

    @Test
    public void registration_form(){


//        Note: Use JavaFaker OR read from configuration.properties file when possible.
//
//        1. Open browser
//        2. Go to website: https://practice.cydeo.com/registration_form
        Driver.getDriver().get(ConfigReader.getProperty("registration.form.url"));

        Faker faker = new Faker();


//        3. Enter first name
        WebElement firstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys(faker.name().firstName());

//        4. Enter last name

//        5. Enter username
        WebElement username = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        username.sendKeys(faker.name().username().replace(".",""));

//        6. Enter email address

//        7. Enter password

//        8. Enter phone number

//        9. Select a gender from radio buttons
        List<WebElement> genders = Driver.getDriver().findElements(By.xpath("//input[@type='radio']"));
        for (int i = 1; i < 3; i++){
            genders.get(faker.number().numberBetween(1,3)).click();
        }

//        10. Enter date of birth
        WebElement DOB = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        DOB.sendKeys("03/30/1992");

//        11. Select Department/Office
        Select departmentDropDown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        departmentDropDown.selectByIndex(faker.number().numberBetween(1,9));

//        12. Select Job Title
        Select jobTitle = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        jobTitle.selectByIndex(faker.number().numberBetween(1,8));

//        13. Select programming language from checkboxes

//        14. Click to sign up button

//        15. Verify success message “You’ve successfully completed registration.” is
//        displayed.
//
//                Note:
//        1. Use new Driver utility class and method
//        2. User JavaFaker when possible
//        3. User ConfigurationReader when it makes sense

    }
}
