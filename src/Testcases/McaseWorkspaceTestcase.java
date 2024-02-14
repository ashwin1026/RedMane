package Testcases;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.annotations.Test;
import Helpers.CommonUtils;
import ObjectRepo.McaseNHBPPersonsObjects;

public class McaseWorkspaceTestcase {

  @Test
  public void addRecord() {
    
	  CommonUtils.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  McaseNHBPPersonsObjects mcaseNHBPPersonsObjects = new McaseNHBPPersonsObjects(CommonUtils.driver);

    CommonUtils.wait.until(ExpectedConditions.visibilityOf(mcaseNHBPPersonsObjects.getWorkspaceLabel()));
    mcaseNHBPPersonsObjects.getAddRecordButton().click();
    System.out.println("Clicked on Add Record button");
	Reporter.log("Clicked on Add Record button");
	
  }

}