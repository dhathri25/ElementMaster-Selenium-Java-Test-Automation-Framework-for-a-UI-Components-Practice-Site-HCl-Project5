package com.automation.tests;

import org.testng.annotations.Test;
import com.automation.pages.WidgetPage;

public class WidgetTest extends BaseTest {

    @Test
    public void testWidget() {

        WidgetPage page = new WidgetPage(driver);

        openPage("https://demoqa.com/date-picker");
        page.selectDate();

        openPage("https://demoqa.com/slider");
        page.moveSlider();

        openPage("https://demoqa.com/accordian");
        page.clickAccordion();
    }
}