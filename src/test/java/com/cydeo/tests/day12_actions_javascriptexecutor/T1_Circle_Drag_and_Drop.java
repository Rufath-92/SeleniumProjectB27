package com.cydeo.tests.day12_actions_javascriptexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Circle_Drag_and_Drop {

    @Test
    public void drag_and_drop(){
//        1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

//        2. Drag and drop the small circle to bigger circle.
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));
        WebElement cookiesClick = Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        cookiesClick.click();
        Actions actions = new Actions(Driver.getDriver());

        //actions.dragAndDrop(smallCircle,bigCircle).perform();
        actions.clickAndHold(smallCircle).pause(2000).moveToElement(bigCircle).pause(2000).release().perform();

        BrowserUtils.sleep(3);


//        3. Assert:
//        -Text in big circle changed to: “You did great!”

//        String actualTextOnBigCircle = bigCircle.getText();
//        String expectedTextOnBigCircle = "You did great!";
        Assert.assertEquals(bigCircle.getText(),"You did great!");


        Driver.closeDriver();
    }
}
