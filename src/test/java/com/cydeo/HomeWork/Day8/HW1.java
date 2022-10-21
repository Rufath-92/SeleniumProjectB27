package com.cydeo.HomeWork.Day8;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.SmartBearUtils;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HW1 extends TestBase {

//    TC #1: Smartbear software link verification
//          1. Open browser
//          2. Go to website:
//          http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
//          3. Enter username: “Tester”
//          4. Enter password: “test”
//          5. Click to Login button
//          6. Print out count of all the links on landing page
//          7. Print out each link text on this page

    @Test(priority = 1)
    public void  SmartBear_link_verification(){
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        SmartBearUtils.loginToSmartBear(driver);

        List<WebElement> allLinkCount = driver.findElements(By.tagName("a"));
        System.out.println("allLinkCount = " + allLinkCount.size());

        for(WebElement eachLik : allLinkCount){
            System.out.println("eachLik.getText() = " + eachLik.getText());

        }
    }

    @Test(priority = 2)
    public void SmartBear_Task2(){
//        1. Open browser
//        2. Go to website:
//        http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
//        3. Enter username: “Tester”
//        4. Enter password: “test”
//        5. Click on Login button
//        6. Click on Order
//        7. Select familyAlbum from product, set quantity to 2
//        8. Click to “Calculate” button
//        9. Fill address Info with JavaFaker
//• Generate: name, street, city, state, zip code
//        10. Click on “visa” radio button
//        11. Generate card number using JavaFaker
//        12. Click on “Process”
//        13. Verify success message “New order has been successfully added.”

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartBearUtils.loginToSmartBear(driver);

        WebElement orderClickBtn = driver.findElement(By.xpath("//a[.='Order']"));
        orderClickBtn.click();

        Select productDropdown = new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
        productDropdown.selectByValue("FamilyAlbum");

        WebElement quantity = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
        quantity.sendKeys("2");

        WebElement calculateBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        calculateBtn.click();

        Faker faker = new Faker();

        WebElement nameBox = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtName']"));
        nameBox.sendKeys(faker.name().fullName());

        WebElement streetBox = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox2']"));
        streetBox.sendKeys(faker.address().streetAddress());

        WebElement cityBox = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox3']"));
        cityBox.sendKeys(faker.address().city());

        WebElement stateBox = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox4']"));
        stateBox.sendKeys(faker.address().state());

        WebElement zipBox = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox5']"));
        zipBox.sendKeys(faker.address().zipCode());



        WebElement visaRadioButton = driver.findElement(By.xpath("//input[@value='Visa']"));
        visaRadioButton.click();

        WebElement cardNumberBox = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox6']"));
        cardNumberBox.sendKeys(faker.numerify("1234566"));

        WebElement dateBox = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox1']"));
        dateBox.sendKeys("30/03");

        WebElement processClickBtn = driver.findElement(By.xpath("//a[@id='ctl00_MainContent_fmwOrder_InsertButton']"));
        processClickBtn.click();

        BrowserUtils.sleep(5);


        Assert.assertTrue(driver.findElement(By.xpath("//strong")).getText().equals("New order has been successfully added."));






    }


}
