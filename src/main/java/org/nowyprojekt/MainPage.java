package org.nowyprojekt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import static org.nowyprojekt.setup.SeleniumActions.click;

public class MainPage {
    private final By acceptCookiesPopUp = By.cssSelector("#onetrust-accept-btn-handler");
    private final By acceptPopUpKlodka = By.cssSelector(".webpush-followup-close");

    public void acceptCookiePopup(FluentWait<WebDriver> wait) {
        click(wait, acceptCookiesPopUp);
    }

    public void acceptPopupKlodka(FluentWait<WebDriver> wait){
        click(wait, acceptPopUpKlodka);
    }
}
