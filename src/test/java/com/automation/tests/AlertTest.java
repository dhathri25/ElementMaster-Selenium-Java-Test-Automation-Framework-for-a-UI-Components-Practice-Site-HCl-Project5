package com.automation.tests;

import org.testng.annotations.Test;
import com.automation.pages.AlertPage;

public class AlertTest extends BaseTest {

	@Test
	public void testAlert() {

	    openPage("https://demoqa.com/alerts");

	    AlertPage page = new AlertPage(driver);

	    page.handleSimpleAlert();
	    page.handleConfirmAlert();
	    page.handlePromptAlert();
	
    }
}