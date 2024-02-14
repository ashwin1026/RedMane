package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Helpers.CommonUtils;
import ObjectRepo.ClientOutcomesPageObjects;
import ObjectRepo.HomePageObjects;

public class TestcaseApplicationStatusPage {

	@Test
	public void checkApplicationStatus() throws InterruptedException {
		
		CommonUtils.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		CommonUtils.driver.switchTo().defaultContent();
		System.out.println("Switched to default in Submit Application");
		Thread.sleep(1000);

		CommonUtils.wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.xpath("//iframe[contains(@title, 'Content Panel - IS Applications')]")));

		// Create object of ClientOutcomesPageObjects
		ClientOutcomesPageObjects clientOutcome = new ClientOutcomesPageObjects(CommonUtils.driver);

		// Get text of the element
		String elementText = clientOutcome.getApplicationStatus().getText();

		// Validate if the element text contains “Submitting"
		Assert.assertTrue(elementText.contains("Submitting"), "Text does not contain 'Submitting'");

		Thread.sleep(5000);

		// Call getRefresh and click
		clientOutcome.getRefreshImage().click();

		// Wait for 3 seconds
		Thread.sleep(5000);

		CommonUtils.driver.switchTo().defaultContent();
		System.out.println("Switched to default in Submit Application");
		Thread.sleep(1000);

		// Switch to frame 0
		CommonUtils.wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.xpath("//iframe[contains(@title, 'Content Panel - IS Applications')]")));

		// Get text of the element
		elementText = clientOutcome.getApplicationStatus().getText();

		// Validate if the element text contains “Submitted"
		Assert.assertTrue(elementText.contains("Submitted"), "Text does not contain 'Submitted'");
		System.out.println("Application Status is done");
		Thread.sleep(3000);

	}

}