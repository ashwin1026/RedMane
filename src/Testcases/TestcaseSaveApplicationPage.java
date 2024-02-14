package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import Helpers.CommonUtils;
import ObjectRepo.SaveApplicationPageObjects;
import ObjectRepo.CommonObjects;

public class TestcaseSaveApplicationPage {

	@Test
	public void saveApplication() throws InterruptedException {

		CommonUtils.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// switch to default content
		CommonUtils.driver.switchTo().defaultContent();
		Thread.sleep(1000);
		// switch to iframe
		CommonUtils.wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[contains(@title, 'Modal Frame - Save Application')]")));
		System.out.println("Switched to Save Application iframe");
		
		SaveApplicationPageObjects saveApplicationPageObjects = new SaveApplicationPageObjects(CommonUtils.driver);
		Actions act =  new Actions(CommonUtils.driver);
    	act.moveToElement(saveApplicationPageObjects.getSubmitApplicationOption()).click().perform();
		
		CommonUtils.driver.switchTo().defaultContent();
		CommonObjects commonObjects = new CommonObjects(CommonUtils.driver);
		commonObjects.getNextButton().click();
		System.out.println("Save Application is done");
	}

}
