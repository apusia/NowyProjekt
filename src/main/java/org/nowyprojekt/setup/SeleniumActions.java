package org.nowyprojekt.setup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class SeleniumActions {

    public static void click(FluentWait<WebDriver> wait, By by){
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }
}
