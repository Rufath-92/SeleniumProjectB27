package com.cydeo.HomeWork.Day10;

import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Hw1 {

    //    TC#1: Registration form confirmation
    //    Note: Use JavaFaker OR read from configuration.properties file when possible.

    @Test
    public void Registration_form(){
//              1. Open browser
//              2. Go to website: https://practice.cydeo.com/registration_form
        Driver.getDriver().get("https://practice.cydeo.com/registration_form");

        List<WebElement> all_input_list = Driver.getDriver().findElements(By.xpath("//div[@class='form-group has-feedback']/div/input"));
        Faker faker = new Faker();

//              3. Enter first name
        WebElement firstName = all_input_list.get(0);
        firstName.sendKeys(faker.name().firstName());

//              4. Enter last name
        WebElement lastName = all_input_list.get(1);
        lastName.sendKeys(faker.name().lastName());

//              5. Enter username
        WebElement userName = all_input_list.get(2);
        userName.sendKeys(faker.name().username().replace(".",""));

//              6. Enter email address
        WebElement emailAddress = all_input_list.get(3);
        emailAddress.sendKeys(faker.internet().emailAddress());

//              7. Enter password
        WebElement password = all_input_list.get(4);
        password.sendKeys(faker.bothify("###-???AAnd-!@"));

//              8. Enter phone number
        WebElement phoneNumber = all_input_list.get(5);
        phoneNumber.sendKeys(faker.phoneNumber().cellPhone());

//              9. Select a gender from radio buttons
        Driver.getDriver().findElement(By.xpath("//input[@value='male']")).click();

//              10. Enter date of birth
        WebElement DOB = all_input_list.get(6);
        DOB.sendKeys(faker.numerify("03/30/1992"));

//              11. Select Department/Office
        Select department = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        department.selectByValue("DE");

//              12. Select Job Title
        Select jobTitle = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        jobTitle.selectByVisibleText("SDET");

//              13. Select programming language from checkboxes
        Driver.getDriver().findElement(By.id("inlineCheckbox1")).click();
        Driver.getDriver().findElement(By.id("inlineCheckbox2")).click();
        Driver.getDriver().findElement(By.id("inlineCheckbox3")).click();

//              14. Click to sign up button
        Driver.getDriver().findElement(By.id("wooden_spoon")).click();

//               15. Verify success message “You’ve successfully completed registration.” is displayed.
        String actualMessage = Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-success']//p")).getText();
        Assert.assertEquals(actualMessage,"You've successfully completed registration!","Error Message");


//              Note:
//              1. Use new Driver utility class and method
//              2. User JavaFaker when possible
//              3. User ConfigurationReader when it makes sense

        Driver.closeDriver();
    }
}
