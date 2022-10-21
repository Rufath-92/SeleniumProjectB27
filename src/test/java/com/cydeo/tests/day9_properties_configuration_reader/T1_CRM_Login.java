package com.cydeo.tests.day9_properties_configuration_reader;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T1_CRM_Login extends TestBase {

    @Test
    public void crm_login_test(){
//        1. Create new test and make set up
//        2. Go to : http://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //        3. Enter valid username // hr2@cydeo.com
        WebElement inputUserName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUserName.sendKeys("hr2@cydeo.com");


//        4. Enter valid password  // UserUser
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("UserUser");

//        5. Click to Log In button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
       loginBtn.click();

       BrowserUtils.sleep(3);


//        6. Verify title is as expected:
//        Expected: Portal
        BrowserUtils.verifyTitle(driver,"Portal");
    }

    @Test
    public void crm_login_test_2(){
        driver.get("https://login1.nextbasecrm.com/");
        CRM_Utilities.login_crm(driver);

        BrowserUtils.sleep(3);

        BrowserUtils.verifyTitle(driver,"Portal");
    }

    @Test
    public void crm_login_test_3(){
        driver.get("https://login1.nextbasecrm.com/");
        CRM_Utilities.login_crm(driver,"hr3@gcydeo.com","UserUser");
        BrowserUtils.sleep(3);
        BrowserUtils.verifyTitle(driver,"Portal");
    }

}
