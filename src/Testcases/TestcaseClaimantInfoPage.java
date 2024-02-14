package Testcases;

import org.testng.annotations.Test;

import Helpers.CommonUtils;
import ObjectRepo.ClaimantInfoPageObjects;
import ObjectRepo.CommonObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TestcaseClaimantInfoPage {

	@Test
	public void claimantInfo() throws InterruptedException {

		CommonUtils.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// switch to default content
		CommonUtils.driver.switchTo().defaultContent();
		Thread.sleep(1000);		
		// switch to iframe 
		CommonUtils.wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[contains(@title, 'Internal Application')]")));
		
		// create object of {{ClaimantInfoPageObjects}} and call getMailingAddress and
		// enter text “Yes”
		ClaimantInfoPageObjects claimantInfoPageObjects = new ClaimantInfoPageObjects(CommonUtils.driver);
		claimantInfoPageObjects.getMailingAddress().sendKeys("Yes");

		// create object of {{ClaimantInfoPageObjects}} and call getMailingAddress and
		// enter text Keys.TAB
		claimantInfoPageObjects.getMailingAddress().sendKeys(Keys.TAB);

		// create object of {{ClaimantInfoPageObjects}} and call getHomePhone1 and enter
		// text “123”
		claimantInfoPageObjects.getHomePhone1().sendKeys("123");

		// create object of {{ClaimantInfoPageObjects}} and call getHomePhone2 and enter
		// text “1234567”
		claimantInfoPageObjects.getHomePhone2().sendKeys("1234567");

		// {{create object of ClaimantInfoPageObjects and call getHealthBenefits and
		// enter text "Yes"}}
		claimantInfoPageObjects.getHealthBenefits().sendKeys("Yes");

		// switch to default content
		//CommonUtils.driver.switchTo().defaultContent();

		// {{create object of CommonObjects and call getNextLink and click}}
		CommonObjects commonObjects = new CommonObjects(CommonUtils.driver);
		commonObjects.getNextLink().click();

		Thread.sleep(2000);
		CommonUtils.driver.switchTo().defaultContent();
		Thread.sleep(1000);		
		// switch to iframe 
		CommonUtils.wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[contains(@title, 'Internal Application')]")));
		
		//CommonUtils.wait.until(ExpectedConditions.elementToBeClickable(claimantInfoPageObjects.getAddress()));
		
		// create object of {{ClaimantInfoPageObjects and call getAddress and click}}
		Actions act =  new Actions(CommonUtils.driver);
    	act.moveToElement(claimantInfoPageObjects.getAddress()).click().perform();
    	
		
		// {{create object of CommonObjects and call getNextLink and click}}
		commonObjects.getNextLink().click();
		System.out.println("Claimant Info is done");
		Thread.sleep(3000);

	}

}
