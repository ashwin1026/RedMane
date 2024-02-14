package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Helpers.CommonUtils;
import ObjectRepo.SearchPageObjects;

public class TestcaseSearchPersonPage {

	@Test
	public void searchPerson() throws InterruptedException {

		CommonUtils.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// switching to parent frame
		CommonUtils.driver.switchTo().defaultContent();
		
		CommonUtils.wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.xpath("//iframe[contains(@title,'Modal Frame - Register Person')]")));

		// creating object of SearchPageObjects
				SearchPageObjects searchPageObjects = new SearchPageObjects(CommonUtils.driver);

		// calling setFirstName with parameter as “TestFirstName”
		searchPageObjects.getFirstName().sendKeys("TestUserFirstName97");

		// calling setLastName with parameter as “TestLastName”
		searchPageObjects.getLastName().sendKeys("TestUserLastName97");

		// calling getGender and enter text as “Male”
		searchPageObjects.getGender().sendKeys("Male");
		searchPageObjects.getGender().sendKeys(Keys.TAB);

		// calling getSearchButton and click
		searchPageObjects.getSearchButton().click();

		CommonUtils.wait.until(ExpectedConditions.visibilityOf(searchPageObjects.getSearchResultMessage()));
		
		// calling getSearchResultMessage and get text of the element
		String searchResultMessage = searchPageObjects.getSearchResultMessage().getText();

		// validating if the element text contains “Number of Items: 0"
		Assert.assertTrue(searchResultMessage.contains("Number of Items: 0"));

		// switching to parent frame
		CommonUtils.driver.switchTo().defaultContent();

		// calling getNextButton and click
		searchPageObjects.getNextButton().click();
		System.out.println("Search Person is done");
		Thread.sleep(3000);
	}

}