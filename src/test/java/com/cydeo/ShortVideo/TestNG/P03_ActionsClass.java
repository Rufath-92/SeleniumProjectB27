package com.cydeo.ShortVideo.TestNG;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class P03_ActionsClass {

    @Test
    public void dragAndDropTest(){
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));

        Actions actions = new Actions(Driver.getDriver());
        // actions.dragAndDrop(smallCircle,bigCircle).perform();
        actions.moveToElement(smallCircle).pause(1000).clickAndHold().pause(1000).moveToElement(bigCircle).pause(1000).release().perform();

        Assert.assertEquals(bigCircle.getText(),"You did great!");

        Driver.closeDriver();
    }

    @Test
    public void hoverTest(){
        Driver.getDriver().get("https://practice.cydeo.com/hovers");

        WebElement img1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement img1Text = Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(img1).perform();
        assertTrue(img1Text.isDisplayed());

        List<WebElement> images = Driver.getDriver().findElements(By.tagName("img"));

        for (WebElement image : images){
            actions.moveToElement(image).pause(2000).perform();
        }

        Driver.closeDriver();
    }
}
