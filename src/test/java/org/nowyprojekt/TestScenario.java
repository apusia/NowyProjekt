package org.nowyprojekt;

import org.junit.jupiter.api.Test;
import org.nowyprojekt.setup.SeleniumEngine;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class TestScenario {
//    @BeforeEach
//    public void beforeEach(){
//        MainPage mainPage = new MainPage();
//        mainPage.loadedMainPage();
//    }

    @Test
    public void InputAsus() {
        SeleniumEngine seleniumEngine = SeleniumEngine.getInstance();
        WebDriver webDriver = seleniumEngine.getWebDriver();
        FluentWait<WebDriver> wait = seleniumEngine.getWait();

        MainPage mainPage = new MainPage();

        webDriver.navigate().to("https://www.komputronik.pl/");

        mainPage.acceptCookiePopup(wait);
        mainPage.acceptPopupKlodka(wait);

        By inputSelector = By.cssSelector("#wp-autocomplete");
        webDriver.findElement(inputSelector).sendKeys("Asus");


//        seleniumEngine.QuitBrowser()
    }
}