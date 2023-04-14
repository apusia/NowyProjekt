package org.nowyprojekt.setup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class SeleniumEngine {

    private static SeleniumEngine INSTANCE = null;
    private final WebDriver webDriver;
    private final FluentWait<WebDriver> wait;

    private SeleniumEngine() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-notifications");

        this.webDriver = new ChromeDriver(options);

        this.wait = new FluentWait<>(this.webDriver)
                .withTimeout(Duration.ofSeconds(30L))
                .pollingEvery(Duration.ofSeconds(1L))
                .ignoring(NoSuchElementException.class);
    }

    public static SeleniumEngine getInstance(){
        if(INSTANCE == null){
            INSTANCE = new SeleniumEngine();
        }
        return INSTANCE;

//        return INSTANCE == null ? INSTANCE = new SeleniumEngine() : INSTANCE;
    }

    public FluentWait<WebDriver> getWait() {
        return this.wait;
    }

    public WebDriver getWebDriver(){
        return this.webDriver;
    }
}
