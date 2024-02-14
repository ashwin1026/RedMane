package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import ObjectRepo.HomePageObjects;
import Helpers.CommonUtils;

public class TestcaseHomePage {
	@Test
	public void navigateToRegisterPage() throws InterruptedException {
		
		CommonUtils.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Switch to iframe
		CommonUtils.driver.switchTo().defaultContent();
		CommonUtils.wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[contains(@title, 'Content Panel - Home')]")));
		
		// Create an object of HomePageObjects and call the getRegisterAPersonLink and click
		HomePageObjects homePage = new HomePageObjects(CommonUtils.driver);
		CommonUtils.wait.until(ExpectedConditions.elementToBeClickable(homePage.getRegisterAPersonLink()));
		
		homePage.getRegisterAPersonLink().click();
		
		System.out.println("Home is done");
		Thread.sleep(6000);

	}
}