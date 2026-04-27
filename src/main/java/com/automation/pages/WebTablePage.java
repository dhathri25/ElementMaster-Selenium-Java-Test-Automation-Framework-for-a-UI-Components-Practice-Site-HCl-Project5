package com.automation.pages;

import org.openqa.selenium.*;
import com.automation.base.BasePage;

public class WebTablePage extends BasePage {

    public WebTablePage(WebDriver driver) {
        super(driver);
    }

    By addButton = By.id("addNewRecordButton");
    By firstName = By.id("firstName");
    By lastName = By.id("lastName");
    By userEmail = By.id("userEmail");
    By age = By.id("age");
    By salary = By.id("salary");
    By department = By.id("department");
    By submitBtn = By.id("submit");
    

    By searchBox = By.id("searchBox");
    By deleteBtn = By.xpath("//span[@title='Delete']");

    public void addRecord() {
        driver.findElement(addButton).click();
        driver.findElement(firstName).sendKeys("John");
        driver.findElement(lastName).sendKeys("Doe");
        driver.findElement(userEmail).sendKeys("john@test.com");
        driver.findElement(age).sendKeys("25");
        driver.findElement(salary).sendKeys("50000");
        driver.findElement(department).sendKeys("QA");
        driver.findElement(submitBtn).click();
    }

    public void searchRecord() {
        WebElement search = driver.findElement(searchBox);
        search.clear();
        search.sendKeys("John");
    }

    public void deleteRecord() {
        driver.findElement(deleteBtn).click();
    }
}