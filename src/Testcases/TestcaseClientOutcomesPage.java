package Testcases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import Helpers.CommonUtils;
import ObjectRepo.ClientOutcomesPageObjects;

public class TestcaseClientOutcomesPage {

	@Test
	public void clientOutcomes() throws InterruptedException {
		// switch to default content
		CommonUtils.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		CommonUtils.driver.switchTo().defaultContent();
		Thread.sleep(5000);
		// create object of ClientOutcomesPageObjects and call getMenu and move to
		// element using actions and click
		ClientOutcomesPageObjects coPageObj = new ClientOutcomesPageObjects(CommonUtils.driver);
		CommonUtils.wait.until(ExpectedConditions.elementToBeClickable(coPageObj.getMenu()));
				//visibilityOf(coPageObj.getMenu()));
		
		System.out.println("Menu is clickable");
		
		Actions action = new Actions(CommonUtils.driver);
		action.moveToElement(coPageObj.getMenu()).click();
		
		System.out.println("Moved to Menu");
		Thread.sleep(2000);
		coPageObj.getNewApplicationLink().click();
		
		System.out.println("Client Outcomes is done");
		Thread.sleep(3000);
	}

}