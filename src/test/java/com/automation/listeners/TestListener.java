package com.automation.listeners;

import org.testng.*;
import org.openqa.selenium.*;
import java.io.File;

import org.apache.commons.io.FileUtils;

import com.aventstack.extentreports.*;
import com.automation.utils.ExtentManager;

public class TestListener implements ITestListener {

    ExtentReports extent = ExtentManager.getReport();
    ExtentTest test;

    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getName());
        
    }

    public void onTestSuccess(ITestResult result) {
        test.pass("Test Passed");
    }

    public void onTestFailure(ITestResult result) {

        test.fail(result.getThrowable());

        WebDriver driver = (WebDriver) result.getTestContext().getAttribute("driver");

        try {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src, new File("screenshots/" + result.getName() + ".png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onFinish(ITestContext context) {
        extent.flush();
    }
}