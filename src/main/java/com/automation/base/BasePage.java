package com.automation.base;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

import com.automation.config.ConfigReader;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;
    

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,
                Duration.ofSeconds(Integer.parseInt(ConfigReader.get("timeout"))));
    }

    public void click(By locator) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

        // ✅ SCROLL INTO VIEW (IMPORTANT FIX)
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

        wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
    }

    public void type(By locator, String text) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.clear();
        element.sendKeys(text);
    }
}