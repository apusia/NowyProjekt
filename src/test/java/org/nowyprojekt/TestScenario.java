package org.nowyprojekt;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScenario {

    @Test
    public void someTest() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
    }
}
