package com.cydeo.ShortVideo.TestNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class P01_TestNG_Intro {

    @Test(priority = 2)
    public void testOnePlusFive(){
        System.out.println("--> testOnePlusFive is running");
        Assert.assertEquals(5+1,6);

    }

    @Test(priority = 1)
    public void testTenMinusFour(){
        System.out.println("--> testTenMinusFour is running");
        Assert.assertEquals(10-4,6);
    }

    @BeforeClass
    public void setUp(){
        System.out.println("-->BeforeClass is running!");
    }

    @AfterClass
    public void tearDown(){
        System.out.println("--> AfterClass is running!");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("----> BeforeMethod is running!");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("----> AfterMethod is running!");
    }


}
