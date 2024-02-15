package Helpers;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.io.Files;

import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class CommonUtils {

	public static WebDriver driver = null;
	public static WebDriverWait wait;
	public static ExtentReports extent;
	public static ExtentTest test;
	public static ExtentSparkReporter htmlReporter;
	
	public static FluentWait<WebDriver> getFluentWait() {
		 FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(30))
				 .pollingEvery(Duration.ofSeconds(5))
				 .ignoring(NoSuchElementException.class);
		return fluentWait;
	
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		CommonUtils.driver = driver;
	}
	public static void setWebDriverWait(WebDriver driver) {
		wait = new WebDriverWait(CommonUtils.driver, Duration.ofSeconds(30));
		
	}
	public static void testResult(ITestResult iTestResult) {
		if(iTestResult.getStatus()==ITestResult.FAILURE) {
			CommonUtils.test.addScreenCaptureFromPath(CommonUtils.takeScreenshot(CommonUtils.driver));
			CommonUtils.test.log(Status.FAIL, iTestResult.getThrowable());
		}else if(iTestResult.getStatus()==ITestResult.SKIP) {
			CommonUtils.test.log(Status.SKIP, "Test Skipped " + iTestResult.getThrowable());
		}else{
			CommonUtils.test.log(Status.PASS, "Test Passed");
		}
	}
	
	public static String takeScreenshot(WebDriver driver) {
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
        	
        	Files.copy(screenshot, new File("screenshot.png"));
            //test.addScreenCaptureFromPath("screenshot.png");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        	 
		return "screenshot.png";
	}
}