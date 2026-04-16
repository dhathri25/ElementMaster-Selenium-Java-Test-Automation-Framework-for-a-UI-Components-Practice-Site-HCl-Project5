package com.automation.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.annotations.*;

import java.time.Duration;

import com.automation.base.DriverFactory;

public class BaseTest {

    protected WebDriver driver;
    protected WebDriverWait wait;

    @BeforeMethod
    public void setup(ITestContext context) {

        System.out.println("Launching browser...");

        driver = DriverFactory.getDriver();
        context.setAttribute("driver", driver);

        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void openPage(String url) {
        System.out.println("Opening URL: " + url);
        driver.get(url);
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Closing browser...");
        if (driver != null) driver.quit();
    }
}