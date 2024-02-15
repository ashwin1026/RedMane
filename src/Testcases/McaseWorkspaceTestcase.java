package Testcases;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Helpers.CommonUtils;
import ObjectRepo.McaseNHBPPersonsObjects;

public class McaseWorkspaceTestcase {

	@Test
	public void addRecord() {

		CommonUtils.test = CommonUtils.extent.createTest("Add Record");
		CommonUtils.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		McaseNHBPPersonsObjects mcaseNHBPPersonsObjects = new McaseNHBPPersonsObjects(CommonUtils.driver);

		CommonUtils.wait.until(ExpectedConditions.visibilityOf(mcaseNHBPPersonsObjects.getWorkspaceLabel()));
		mcaseNHBPPersonsObjects.getAddRecordButton().click();
		System.out.println("Clicked on Add Record button");
		CommonUtils.test.log(Status.INFO, "Clicked on Add Record button");
		
	}
	

	@AfterMethod
	public void afterMethod(ITestResult iTestResult) {
		CommonUtils.testResult(iTestResult);
	}

}