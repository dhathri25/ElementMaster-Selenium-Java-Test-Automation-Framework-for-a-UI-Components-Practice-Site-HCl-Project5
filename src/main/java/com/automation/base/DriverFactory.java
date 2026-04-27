package com.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import com.automation.config.ConfigReader;

public class DriverFactory {

    public static WebDriver getDriver() {

        String browser = ConfigReader.get("browser");
        

        System.out.println("Browser from config: " + browser);

        if (browser == null) {
            throw new RuntimeException("Browser value is NULL (config not loaded)");
        }

        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }

        throw new RuntimeException("Browser not supported: " + browser);
    }
}