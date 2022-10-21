package com.cydeo.ShortVideo.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.AssertJUnit.assertTrue;

public class P02_Hard_Soft_Assertions {

    @Test
    public void hardAssertion(){
        Assert.assertEquals("apple","app");
        System.out.println("After Assertion failed");
        assertTrue("orange",equals("oranger"));
        System.out.println("After Assertion failed");
    }

    @Test
    public void softAssertion(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("apple","app");
        System.out.println("After Assertion failed");
        softAssert.assertTrue("orange".equals("oranger"));
        System.out.println("After Assertion failed");

        softAssert.assertAll();


    }
}
