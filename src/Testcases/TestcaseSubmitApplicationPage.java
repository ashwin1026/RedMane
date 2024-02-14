package Testcases;

import org.testng.annotations.Test;

import Helpers.CommonUtils;
import ObjectRepo.SubmitApplicationPageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestcaseSubmitApplicationPage {

	@Test
	public void submitApplication() throws InterruptedException {

		CommonUtils.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// switch to default content
		CommonUtils.driver.switchTo().defaultContent();
		System.out.println("Switched to default in Submit Application");
		Thread.sleep(1000);

		CommonUtils.wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[contains(@title, 'Modal Frame - New Application')]")));
		
		System.out.println("Switched to New Application iframe in Submit Application");

		SubmitApplicationPageObjects submitApplicationPageObjects = new SubmitApplicationPageObjects(CommonUtils.driver);

		CommonUtils.wait.until(ExpectedConditions.elementToBeClickable(submitApplicationPageObjects.getRightsCheckBox()));

		submitApplicationPageObjects.getRightsCheckBox().click();

		submitApplicationPageObjects.getPrivacyPractice().click();

		submitApplicationPageObjects.getNondiscrimination().click();

		submitApplicationPageObjects.getHouseholdInfoCheckBox().click();

		submitApplicationPageObjects.getRegisterToVoteCheckBox().click();

		submitApplicationPageObjects.getFirstName().sendKeys("TestFName");
		submitApplicationPageObjects.getFirstName().sendKeys(Keys.TAB);

		submitApplicationPageObjects.getLastName().sendKeys("TestLName");
		submitApplicationPageObjects.getLastName().sendKeys(Keys.TAB);

		submitApplicationPageObjects.getAgreement().click();

		CommonUtils.driver.switchTo().defaultContent();
		Thread.sleep(1000);
		submitApplicationPageObjects.getSubmit().click();
		System.out.println("Submit Application is done");
	}
}
