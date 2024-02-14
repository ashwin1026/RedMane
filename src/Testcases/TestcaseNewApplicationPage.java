package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import Helpers.CommonUtils;
import ObjectRepo.CommonObjects;
import ObjectRepo.NewApplicationPageObjects;

public class TestcaseNewApplicationPage {

	@Test
	public void NewApplication() throws InterruptedException {
		
		CommonUtils.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		CommonUtils.wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[contains(@title, 'Modal Frame - New Application')]")));
		
		NewApplicationPageObjects newAppPage = new NewApplicationPageObjects(CommonUtils.driver);
		
		Actions act =  new Actions(CommonUtils.driver);
    	act.moveToElement(newAppPage.getIncomeSupportType()).click().perform();
    	
		CommonUtils.driver.switchTo().defaultContent();
		CommonObjects commonObj = new CommonObjects(CommonUtils.driver);
		commonObj.getNextButton().click();
		Thread.sleep(3000);
		
		CommonUtils.driver.switchTo().defaultContent();
		Thread.sleep(1000);
		CommonUtils.wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[contains(@title, 'Modal Frame - New Application')]")));

		// create object of NewApplicationPageObjects and call getMedicalAssistanceType
		// and click
		NewApplicationPageObjects newApplicationPageObjects = new NewApplicationPageObjects(CommonUtils.driver);
		act.moveToElement(newApplicationPageObjects.getMedicalAssistanceType()).click().perform();
		

		// switch to default content
		CommonUtils.driver.switchTo().defaultContent();

		// create object of CommonObjects and call getNextButton and click
		commonObj.getNextButton().click();

		
		CommonUtils.wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[contains(@title, 'Modal Frame - Cúram Internal Application')]")));		
		// create object of CommonObjects and call getNextLink and click
		commonObj.getNextLink().click();
		
		System.out.println("New Application is done");
		Thread.sleep(4000);

	}
}