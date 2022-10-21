package com.cydeo.HomeWork.Day9;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import com.cydeo.utilities.ConfigReader;
import org.testng.annotations.Test;

public class HW1 extends TestBase {

    @Test
    public void login_scenario(){
//        1. Create new test and make set ups
//        2. Go to : https://login1.nextbasecrm.com/
        driver.get(ConfigReader.getProperty("crm.url"));

//        3. Enter valid username
//        4. Enter valid password
//        5. Click to `Log In` button

        CRM_Utilities.login_crm(driver,ConfigReader.getProperty("username"),ConfigReader.getProperty("password"));

//        6. Verify title is as expected:
//        Expected: Portal
        BrowserUtils.sleep(3);
        BrowserUtils.verifyTitle(driver,"Portal");



    }

}
