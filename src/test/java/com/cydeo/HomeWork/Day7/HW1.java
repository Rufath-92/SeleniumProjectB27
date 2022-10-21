package com.cydeo.HomeWork.Day7;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HW1 extends TestBase {

    @Test(priority = 1)
    public void countNumberOfLink() {

//        TC #1: Checking the number of links on the page
//        1. Open Chrome browser
//        2. Go to https://www.openxcell.com
//        3. Count the number of the links on the page and verify
//        Expected: 332

        driver.get("https://www.openxcell.com");
        List<WebElement> totalLinks = driver.findElements(By.xpath("//a[contains(@href,'https')]"));
        System.out.println("totalLinks = " + totalLinks.size());

        int count = 0;
       for(WebElement eachLink : totalLinks){
           count++;
       }
        Assert.assertEquals(count,332,"Link number doesn't matches");

       //Another way

//        int actualNumberOfLinks = 332;
//        int expectedNumberOfLinks = totalLinks.size();
//        Assert.assertEquals(actualNumberOfLinks, expectedNumberOfLinks, "Link count verifications is: FAIL!");
//
//        for (int i = 0; i < totalLinks.size(); i++) {
//            System.out.println("Total Links " + totalLinks.get(i).getAttribute("href"));
//
//        }


    }

    @Test(priority = 2)
    public void printLinkTexts() {
//
//        TC #2: Printing out the texts of the links on the page
//        1. Open Chrome browser
//        2. Go to https://www.openxcell.com
//        3. Print out all of the texts of the links on the page

        driver.get("https://www.openxcell.com");
        List<WebElement> totalLinks = driver.findElements(By.xpath("//a[contains(@href,'https')]"));


        for (WebElement eachLink : totalLinks){
            if(!eachLink.getText().isBlank()){
                System.out.println("eachLink.getText() = " + eachLink.getText());
            }
        }

        // Another way

//        int count = 0;
//        for (int i = 0; i < totalLinks.size(); i++){
//            if(totalLinks.get(i).getText().length() >=1){
//                System.out.println("Total texts of links" + totalLinks.get(i).getText());
//                count++;
//            }
//        }
//        System.out.println(count);

    }

    @Test(priority = 3)
    public void countLinksWithText() {


//            TC #3: Counting the number of links that does not have text
//            1. Open Chrome browser
//            2. Go to https://www.openxcell.com
//            3. Count the number of links that does not have text and verify
//            Expected: 109

        driver.get("https://www.openxcell.com");
        List<WebElement> totalLinks = driver.findElements(By.xpath("//a"));

        int count = 0;
        for (WebElement eachLink : totalLinks){
            if(eachLink.getText().isEmpty()){
                count++;
            }
            Assert.assertEquals(count,109,"Count without text doesn't matches");
        }

        // Another way

//        int count1 = 0;
//        for (int i = 0; i < totalLinks.size(); i++) {
//
//            if (totalLinks.get(i).getText().length() == 0)
//                count1++;
//        }
//        System.out.println("Total Number of Links without texts: " + count1);
//
//        Assert.assertEquals(count1, 109, "Expected result is FAILED!");
    }
}
