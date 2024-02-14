package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Helpers.CommonUtils;
import ObjectRepo.ReviewClaimantDetailsPageObjects;

public class TestcaseReviewClaimantDetailsPage {

   @Test
   public void reviewClaimantDetails() throws InterruptedException {
	   
	   CommonUtils.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	   // switch to default content
		CommonUtils.driver.switchTo().defaultContent();
		Thread.sleep(1000);
		CommonUtils.wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[contains(@title, 'Internal Application')]")));
		
		System.out.println("Switched to Internal iframe");
	
       // create object of ReviewClaimantDetailsPageObjects and call getSSN
       ReviewClaimantDetailsPageObjects reviewClaimantDetailsPageObjects = new ReviewClaimantDetailsPageObjects(CommonUtils.driver);
       WebElement ssnElement = reviewClaimantDetailsPageObjects.getSSN();
       
       // get text of the element
       String ssnText = ssnElement.getText();
       
       // validate if the element text contains “190255196"
       Assert.assertTrue(ssnText.contains("154785267"));
       
       // create object of ReviewClaimantDetailsPageObjects and call getClose and click on the element
       WebElement closeElement = reviewClaimantDetailsPageObjects.getClose();
       closeElement.click();
       System.out.println("Review Claimant Details is done");
       Thread.sleep(3000);
   }
}
