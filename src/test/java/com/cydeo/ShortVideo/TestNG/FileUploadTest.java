package com.cydeo.ShortVideo.TestNG;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FileUploadTest {

    @Test
    public void test_file_upload(){
        Driver.getDriver().get("https://practice.cydeo.com/upload");

        String filePath = "/Users/rufath/Desktop/edfvsdvasdvsd.txt";
        Driver.getDriver().findElement(By.id("file-upload")).sendKeys(filePath);

        BrowserUtils.sleep(2);

        Driver.getDriver().findElement(By.id("file-submit")).click();


    }
}
