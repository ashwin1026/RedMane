package Testcases;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Helpers.CommonUtils;
import ObjectRepo.McaseHomeObjects;

public class McaseHomeTestcase {
	
	@Test
	public void navigateToWorkspace() {
		
		CommonUtils.test = CommonUtils.extent.createTest("Navigate to Workspace Page");
		
		CommonUtils.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		McaseHomeObjects mcaseHomeObjects = new McaseHomeObjects(CommonUtils.driver);
		
		// wait until workspaces link is clickable
		WebElement workspacesLinkElement = mcaseHomeObjects.getWorkspacesLink();
		
		CommonUtils.wait.until(ExpectedConditions.elementToBeClickable(workspacesLinkElement));
		
		// click on workspaces link
		mcaseHomeObjects.getWorkspacesLink().click();
		
		// click on NHBP Persons link
		mcaseHomeObjects.getNHBPPersonsLink().click();
		
		System.out.println("Navigated to NHBP Person workspace");
		CommonUtils.test.log(Status.INFO, "Navigated to NHBP Person workspace");
		
	}
	
	@AfterMethod
	public void afterMethod(ITestResult iTestResult) {
		CommonUtils.testResult(iTestResult);
	}
	
}