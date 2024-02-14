package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Helpers.CommonUtils;
import ObjectRepo.ClientOutcomesPageObjects;
import ObjectRepo.HomePageObjects;
import ObjectRepo.SearchPageObjects;

public class TestcaseVerifyPersonRegistered {
	
	@Test
	public void verifyPersonRegistered() throws Exception {
		
		CommonUtils.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		CommonUtils.driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		// Create object of ClientOutcomesPageObjects
		ClientOutcomesPageObjects clientOutcome = new ClientOutcomesPageObjects(CommonUtils.driver);
				
		clientOutcome.getHomeLink().click();
		
		
		HomePageObjects hpo = new HomePageObjects(CommonUtils.driver);
		
		CommonUtils.driver.switchTo().defaultContent();
		CommonUtils.wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[contains(@title, 'Content Panel - Home')]")));
		
		hpo.getRegisterAPersonLink().click();
		
		Thread.sleep(3000);
		
		// switching to parent frame
	    CommonUtils.driver.switchTo().defaultContent();
	 
	    // switching to iframe 1
	    CommonUtils.wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
				By.xpath("//iframe[contains(@title, 'Modal Frame - Register Person')]")));
	    
	    // creating object of SearchPageObjects
	    SearchPageObjects searchPageObjects = new SearchPageObjects(CommonUtils.driver);
	 
	    // calling setFirstName with parameter as “TestFirstName”
	    searchPageObjects.getFirstName().sendKeys("TestUserFirstName90");
	 
	    // calling setLastName with parameter as “TestLastName”
	    searchPageObjects.getLastName().sendKeys("TestUserLastName90");
	    
	 // calling getSearchButton and click
	    searchPageObjects.getSearchButton().click();
	 
	    // waiting for 3 seconds
	    Thread.sleep(3000);
	 
	    // calling getSearchResultMessage and get text of the element
	    String searchResultMessage = searchPageObjects.getSearchResultMessage().getText();
	 
	    // validating if the element text contains “Number of Items: 0"
	    Assert.assertTrue(searchResultMessage.contains("Number of Items: 1"));
	    System.out.println("Verify Registered Person is done");
	}
	
	@AfterTest
	public void closeBrowser() {
		CommonUtils.driver.quit();
	}

}
