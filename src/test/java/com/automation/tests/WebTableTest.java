package com.automation.tests;

import org.testng.annotations.Test;
import com.automation.pages.WebTablePage;

public class WebTableTest extends BaseTest {

    @Test
    public void testWebTable() {

        openPage("https://demoqa.com/webtables");

        WebTablePage page = new WebTablePage(driver);

        page.addRecord();
        page.searchRecord();
        page.deleteRecord();
        
    }
}