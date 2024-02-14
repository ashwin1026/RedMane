package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import ObjectRepo.ClaimantDetailsPageObjects;
import ObjectRepo.CommonObjects;

import Helpers.CommonUtils;

public class TestcaseClaimantDetailsPage {

	@Test
	public void claimantDetails() throws InterruptedException {

		CommonUtils.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// switch to default content
		CommonUtils.driver.switchTo().defaultContent();
		Thread.sleep(1000);
		// switch to iframe
		CommonUtils.wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[contains(@title, 'Internal Application')]")));
		
		System.out.println("Switched to Internal iframe");
		
		ClaimantDetailsPageObjects claimantDetailsPageObj = new ClaimantDetailsPageObjects(CommonUtils.driver);
		claimantDetailsPageObj.getSSNQuestion().sendKeys("Yes");
		claimantDetailsPageObj.getSSNQuestion().sendKeys(Keys.TAB);
		Thread.sleep(1000);
		

		// create object of {{ClaimantDetailsPageObjects}} and call get {{getSSN}} and
		// enter text “990255196”
		claimantDetailsPageObj.getSSN().sendKeys("456378765");

		// create object of {{ClaimantDetailsPageObjects}} and call get
		// {{getCitizenStatus}} and enter text “US Citizen”
		claimantDetailsPageObj.getCitizenStatus().sendKeys("US Citizen");
		claimantDetailsPageObj.getCitizenStatus().sendKeys(Keys.TAB);
		// create object of {{ClaimantDetailsPageObjects}} and call get
		// {{getHouseholdDate}} and enter text “9/9/2023”
		claimantDetailsPageObj.getHouseholdDate().sendKeys("9/9/2023");
		claimantDetailsPageObj.getHouseholdDate().sendKeys(Keys.TAB);

		// create object of {{ClaimantDetailsPageObjects}} and call get
		// {{getResidentStateQuestion}} and enter text “Yes”
		claimantDetailsPageObj.getResidentStateQuestion().sendKeys("Yes");
		claimantDetailsPageObj.getResidentStateQuestion().sendKeys(Keys.TAB);
		Thread.sleep(1000);

		// create object of {{ClaimantDetailsPageObjects}} and call get
		// {{getResidencyStatus }}and enter text “Permanent”
		claimantDetailsPageObj.getResidencyStatus().sendKeys("Permanent");
		claimantDetailsPageObj.getResidencyStatus().sendKeys(Keys.TAB);
		// create object of {{ClaimantDetailsPageObjects}} and call get
		// {{getLivingArrangement }}and enter text “Home”
		claimantDetailsPageObj.getLivingArrangement().sendKeys("Home");
		claimantDetailsPageObj.getLivingArrangement().sendKeys(Keys.TAB);

		// create object of {{ClaimantDetailsPageObjects}} and call get
		// {{getLivingArrangementStatus }}and enter text “Permanent”
		claimantDetailsPageObj.getLivingArrangementStatus().sendKeys("Permanent");
		claimantDetailsPageObj.getLivingArrangementStatus().sendKeys(Keys.TAB);

		// create object of {{ClaimantDetailsPageObjects}} and call get
		// {{getLivingArrangementBeginDate }}and enter text “9/9/2023”
		claimantDetailsPageObj.getLivingArrangementBeginDate().sendKeys("9/9/2023");
		claimantDetailsPageObj.getLivingArrangementBeginDate().sendKeys(Keys.TAB);

		// create object of {{ClaimantDetailsPageObjects}} and call get
		// {{getPreferNotDisclose}} and click
		Actions act =  new Actions(CommonUtils.driver);
    	act.moveToElement(claimantDetailsPageObj.getPreferNotDisclose()).click().perform();
		//claimantDetailsPageObj.getPreferNotDisclose().click();

		// create object of {{ClaimantDetailsPageObjects}} and call get
		// {{getClaimantCurrentEducation}} and enter text “No”
		claimantDetailsPageObj.getClaimantCurrentEducation().sendKeys("No");
		claimantDetailsPageObj.getClaimantCurrentEducation().sendKeys(Keys.TAB);

		// switch to default content
		//CommonUtils.driver.switchTo().defaultContent();

		// {{create object of CommonObjects and call getNextLink and click}}
		CommonObjects commonObjects = new CommonObjects(CommonUtils.driver);
		commonObjects.getNextLink().click();
		Thread.sleep(3000);
		System.out.println("Claimant Details is done");
	}

}