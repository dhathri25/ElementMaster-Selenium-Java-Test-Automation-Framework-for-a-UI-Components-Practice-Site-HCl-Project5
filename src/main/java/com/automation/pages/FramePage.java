package com.automation.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.automation.base.BasePage;

public class FramePage extends BasePage {

    public FramePage(WebDriver driver) {
        super(driver);
    }

    By menu = By.xpath("//h5[text()='Alerts, Frame & Windows']");
    By frames = By.xpath("//span[text()='Frames']");
    By nestedFrames = By.xpath("//span[text()='Nested Frames']");
    By frame1 = By.id("frame1");

    public void openFrames() {
        click(menu);
        click(frames);
        
    }

    public void switchToFrame() {

        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame1));

        String text = driver.findElement(By.tagName("h1")).getText();
        System.out.println("Frame Text: " + text);

        driver.switchTo().defaultContent();
    }

    public void handleNestedFrame() {

        click(menu);
        click(nestedFrames);

        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frame1"));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));

        String text = driver.findElement(By.tagName("p")).getText();
        System.out.println("Nested Frame Text: " + text);

        driver.switchTo().defaultContent();
    }
}