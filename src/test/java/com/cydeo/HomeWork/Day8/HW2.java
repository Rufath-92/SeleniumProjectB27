package com.cydeo.HomeWork.Day8;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.SmartBearUtils;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HW2 extends TestBase {


    @Test
    public void  order_verification(){
//        #3: Smartbear software order verification
//        1. Open browser and login to Smartbear software
//        2. Click on View all orders
//        3. Verify Susan McLaren has order on date “01/05/2010”


        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartBearUtils.loginToSmartBear(driver);


        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");
        WebElement clickBtn = driver.findElement(By.xpath("//a[.='View all orders']"));
        clickBtn.click();


        WebElement orderDate = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr[6]/td[.='01/05/2010']"));

        System.out.println("orderDate = " + orderDate.getText());
        WebTableUtils.orderVerify(driver,"Susan McLaren","01/05/2010");








    }

}
