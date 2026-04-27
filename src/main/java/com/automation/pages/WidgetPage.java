package com.automation.pages;

import org.openqa.selenium.*;
import com.automation.base.BasePage;

public class WidgetPage extends BasePage {

    public WidgetPage(WebDriver driver) {
        super(driver);
    }

    By dateInput = By.id("datePickerMonthYearInput");
    By slider = By.xpath("//input[@type='range']");
    By accordion = By.id("section1Heading");

    public void selectDate() {
        WebElement input = driver.findElement(dateInput);
        input.clear();
        input.sendKeys("15 Apr 2026");
        input.sendKeys(Keys.ENTER);
        
    }

    public void moveSlider() {
        WebElement slide = driver.findElement(slider);
        for (int i = 0; i < 10; i++) {
            slide.sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public void clickAccordion() {
        try {
            WebElement element = driver.findElement(By.id("section1Heading"));
            
            // scroll into view (important)
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            
            Thread.sleep(1000); // small wait
            
            element.click();

        } catch (Exception e) {
            System.out.println("Accordion click failed, ignoring...");
        }
    }
}