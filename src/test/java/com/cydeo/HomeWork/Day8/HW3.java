package com.cydeo.HomeWork.Day8;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HW3 extends TestBase {

                @Test
            public void gasMileageCalculate(){
                driver.get("https://www.calculator.net");

                WebElement seachBox=driver.findElement(By.xpath("//input[@id='calcSearchTerm']"));
                seachBox.sendKeys("gas mileage");
                driver.findElement(By.xpath("//a[.='Gas Mileage Calculator']")).click();

                Assert.assertEquals(driver.getTitle(), "Gas Mileage Calculator");
                WebElement gasMileageLabel=driver.findElement(By.xpath("//h1[.='Gas Mileage Calculator']"));
                Assert.assertTrue(gasMileageLabel.isDisplayed(), "Gas Mileage Calculator label is not displayed");

                driver.findElement(By.xpath("//img[@class='clearbtn']")).click();


                WebElement currentOdometerFld=driver.findElement(By.xpath("//input[@id='uscodreading']"));
                currentOdometerFld.sendKeys("7925");


                WebElement previousOdometer=driver.findElement(By.xpath("//input[@id='uspodreading']"));
                previousOdometer.sendKeys("7550");


                WebElement gasAdded=driver.findElement(By.xpath("//input[@id='usgasputin']"));
                gasAdded.sendKeys("16");


                WebElement gasPrice=driver.findElement(By.xpath("//input[@id='usgasprice']"));
                gasPrice.sendKeys("3.55");


                driver.findElement(By.xpath("//table[@id='standard']//input[@value='Calculate']")).click();


                WebElement mpgValue= driver.findElement(By.xpath("//b[.='23.44 mpg']"));
                Assert.assertEquals(mpgValue.getText(), "23.44 mpg", "MPG value is not as expected");
            } }


