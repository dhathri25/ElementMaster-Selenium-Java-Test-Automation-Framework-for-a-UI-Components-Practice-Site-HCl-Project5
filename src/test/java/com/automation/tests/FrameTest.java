package com.automation.tests;

import org.testng.annotations.Test;
import com.automation.pages.FramePage;

public class FrameTest extends BaseTest {

    @Test
    public void testFrame() {

        openPage("https://demoqa.com/frames");

        FramePage page = new FramePage(driver);
        page.switchToFrame();
        
    }
}