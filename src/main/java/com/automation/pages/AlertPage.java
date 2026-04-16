package com.automation.pages;

import org.openqa.selenium.*;
import com.automation.base.BasePage;

public class AlertPage extends BasePage {

    public AlertPage(WebDriver driver) {
        super(driver);
    }

    By simple = By.id("alertButton");
    By confirm = By.id("confirmButton");
    By prompt = By.id("promtButton");

    public void handleSimpleAlert() {
        driver.findElement(simple).click();
        driver.switchTo().alert().accept();
    }

    public void handleConfirmAlert() {
        driver.findElement(confirm).click();
        driver.switchTo().alert().dismiss();
    }

    public void handlePromptAlert() {
        driver.findElement(prompt).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Hello");
        alert.accept();
    }
}