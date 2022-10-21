package com.cydeo.tests.day11_upload_actions_javascriptexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Guru99_Upload_Test {

    @Test
    public void guru99_upload_test(){
//        1. Go to  “https://demo.guru99.com/test/upload”
        Driver.getDriver().get("https://demo.guru99.com/test/upload");

//        2. Upload file into Choose File
      //  String filePath = "/Users/rufath/Desktop/edfvsdvasdvsd.txt";

        BrowserUtils.sleep(2);
        WebElement chooseFile = Driver.getDriver().findElement(By.xpath("//input[@id='uploadfile_0']"));
        chooseFile.sendKeys("/Users/rufath/Desktop/edfvsdvasdvsd.txt");

//        3. Click terms of service check box
        Driver.getDriver().findElement(By.xpath("//input[@id='terms']")).click();

//        4. Click Submit File button
        Driver.getDriver().findElement(By.xpath("//button[@id='submitbutton']")).click();

//        5. Verify expected message appeared.
//        Expected: “1 file
//        has been successfully uploaded.”
        WebElement resultMsg = Driver.getDriver().findElement(By.xpath("//h3[@id='res']"));
        Assert.assertEquals(resultMsg.getText(),"1 file\nhas been successfully uploaded.");
        BrowserUtils.sleep(2);

        Driver.closeDriver();


    }
}
