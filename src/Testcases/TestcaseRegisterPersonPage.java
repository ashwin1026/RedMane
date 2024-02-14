
package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import Helpers.CommonUtils;
import ObjectRepo.RegisterPersonPageObjects;

public class TestcaseRegisterPersonPage {

	@Test
	public void registerPerson() throws InterruptedException {
		
		CommonUtils.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// switch to iframe 1
		CommonUtils.wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[contains(@title, 'Modal Frame - Register Person')]")));
		// create object of RegisterPersonPageObjects and call getGender and enter text
		// “Male”
		RegisterPersonPageObjects rppo = new RegisterPersonPageObjects(CommonUtils.driver);
		rppo.getGender().sendKeys("Female");
		Thread.sleep(2000);
		// create object of RegisterPersonPageObjects and call getGender and enter text
		// Keys.TAB
		rppo.getGender().sendKeys(Keys.TAB);
		// create object of RegisterPersonPageObjects and call setDOB with parameter as
		// “1/1/1993”
		rppo.getDOB().sendKeys("1/1/1993");
		;
		Thread.sleep(1000);
		// create object of RegisterPersonPageObjects and call setStreet1 with parameter
		// as “Test Street 1”
		rppo.getStreet1().sendKeys("Test Street 1");
		// create object of RegisterPersonPageObjects and call setCitywith parameter as
		// “Chicago”
		rppo.getCity().sendKeys("Chicago");
		// create object of RegisterPersonPageObjects and call getCounty and enter text
		// "Union”
		rppo.getCounty().sendKeys("Union");
		Thread.sleep(1000);
		// create object of RegisterPersonPageObjects and call getCounty and enter text
		// Keys.TAB
		rppo.getCounty().sendKeys(Keys.TAB);
		// create object of RegisterPersonPageObjects and call getState and enter
		// text“Alaska”
		rppo.getState().sendKeys("Alaska");
		// create object of RegisterPersonPageObjects and call getState and enter text
		// Keys.TAB
		rppo.getState().sendKeys(Keys.TAB);
		// create object of RegisterPersonPageObjects and call setZipwith parameter as
		// “60203”
		rppo.setZip("60203");
		// switch to parent frame
		CommonUtils.driver.switchTo().defaultContent();
		// create object of RegisterPersonPageObjects and call getSaveButton and click
		rppo.getSaveButton().click();
		Thread.sleep(5000);
		System.out.println("Register Person is done");
	}
}