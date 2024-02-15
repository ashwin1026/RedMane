package Testcases;



import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Helpers.CommonUtils;
import ObjectRepo.McaseDemographicInfoObjects;

public class McaseDemographicTestcase {
    
    WebDriver driver;
    
    @Test
    public void fillDemographicInfo() throws InterruptedException {
        
    	CommonUtils.test = CommonUtils.extent.createTest("Fill Demographic Info");
    	CommonUtils.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	
    	McaseDemographicInfoObjects demoObj = new McaseDemographicInfoObjects(CommonUtils.driver);
        
        CommonUtils.wait.until(ExpectedConditions.visibilityOf(demoObj.getFirstNameInput()));
        demoObj.getFirstNameInput().sendKeys("TestFirstName");
        
        demoObj.getLastNameInput().sendKeys("TestLastName");
        
        demoObj.getSaveLink().click();
        
        System.out.println("Saved Demographic info");
        CommonUtils.test.log(Status.INFO, "Demographic information saved !");
        
        CommonUtils.wait.until(ExpectedConditions.elementToBeClickable(demoObj.getEditLink()));
        
        demoObj.getEditLink().click();
        
        demoObj.getContactsLink().click();
        
        CommonUtils.wait.until(ExpectedConditions.elementToBeClickable(demoObj.getNextSectionButton()));
        demoObj.getEmailAddressInput().sendKeys("test@test.com");
        demoObj.getEmailAddressInput().sendKeys(Keys.TAB);
        Thread.sleep(2000);
        
        Actions action = new Actions(CommonUtils.driver);
        action.moveToElement(demoObj.getNextSectionButton()).click().perform();
        
        System.out.println("Email address is saved");
        CommonUtils.test.log(Status.INFO, "Email address is saved !");
        
        CommonUtils.wait.until(ExpectedConditions.visibilityOf(demoObj.getSuicideConcernCheckbox()));
        demoObj.getSuicideConcernCheckbox().click();
        
        demoObj.getViolenceConcernCheckbox().click();
        
        demoObj.getSaveLink().click();
        
        System.out.println("Alerts are saved");
        CommonUtils.test.log(Status.INFO, "Alerts are saved !");
        
        Thread.sleep(5000);
        
        JavascriptExecutor jse = (JavascriptExecutor)CommonUtils.driver;
        jse.executeScript("scroll(0, 350);");
        
        Thread.sleep(2000);
        //CommonUtils.wait.until(ExpectedConditions.elementToBeClickable(demoObj.getRelatedRecordButton()));
        
        action.moveToElement(demoObj.getRelatedRecordButton()).click().perform();
        
        demoObj.getRelationshipsLink().click();
        
        CommonUtils.wait.until(ExpectedConditions.visibilityOf(demoObj.getRelationshipTypeDropdown()));
        Select dropdown = new Select(demoObj.getRelationshipTypeDropdown());
        dropdown.selectByVisibleText("Spouse");
        
        demoObj.getSaveLink().click();
        
        System.out.println("Demographic is done");
        CommonUtils.test.log(Status.INFO, "Demographic information is saved ! and Done.");
        Thread.sleep(3000);
    }
    
    @AfterMethod
	public void afterMethod(ITestResult iTestResult) {
		CommonUtils.testResult(iTestResult);
	}
}