package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.automation.base.BasePage;

public class FormPage extends BasePage {

    public FormPage(WebDriver driver) {
        super(driver);
    }

    By elementsMenu = By.xpath("//h5[text()='Elements']");
    By formMenu = By.xpath("//span[text()='Text Box']");
    By name = By.id("userName");
    By email = By.id("userEmail");
    By submit = By.id("submit");

    public void openForm() {
        click(elementsMenu);
        click(formMenu);
    }

    
    public void fillForm(String username, String mail) {
        type(name, username);
        type(email, mail);
    }

    public void submitForm() {
        click(submit);
    }
}