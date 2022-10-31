package com.cydeo.HomeWork.Day14;

import com.cydeo.pages.DoubleClickElement_W3schools;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Double_click_test {


    @Test
    public void Double_click_test(){
//          1. Go to
//          https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

        DoubleClickElement_W3schools doubleClickElement = new DoubleClickElement_W3schools();

//        2. Switch to iframe.
        Driver.getDriver().switchTo().frame(DoubleClickElement_W3schools.iframe);


//          3. Double-click on the text “Double-click me to change my text color.”
                Actions actions = new Actions(Driver.getDriver());
                actions.doubleClick(doubleClickElement.doubleClickText).perform();

//        4. Assert:
//        Text’s “style” attribute value contains “red”.
        Assert.assertTrue(doubleClickElement.doubleClickText.getAttribute("style").contains("red"));

        Driver.closeDriver();
}
}
