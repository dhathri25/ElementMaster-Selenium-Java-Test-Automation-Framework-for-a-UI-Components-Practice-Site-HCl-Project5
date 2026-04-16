package com.automation.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.automation.pages.FormPage;

public class FormTest extends BaseTest {

    @Test(dataProvider = "formData")
    public void testForm(String name, String email) {

        openPage("https://demoqa.com/text-box");

        FormPage form = new FormPage(driver);
        form.fillForm(name, email);
        form.submitForm();
    }

    @DataProvider(name = "formData")
    public Object[][] getData() {
        return new Object[][] {
            {"Ashila", "ashila@test.com"},
            {"TestUser", "test@test.com"}
        };
    }
}