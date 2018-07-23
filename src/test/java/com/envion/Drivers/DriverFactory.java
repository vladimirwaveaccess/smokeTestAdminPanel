package com.envion.Drivers;

import com.envion.Common.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverFactory {
    static public WebDriver getDriver() {
        WebDriver driver = null;

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(Constants.BASE_URL);
        return driver;
    }
}
