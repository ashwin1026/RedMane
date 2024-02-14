package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SubmitApplicationPageObjects {

	private WebDriver driver;

	public SubmitApplicationPageObjects(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getRightsCheckBox() {
		return driver.findElement(By.xpath("//input[contains(@title,'rights and responsibilities')]/.."));
	}

	public WebElement getPrivacyPractice() {
		return driver.findElement(By.xpath(
				"//h3[text()='Notice of Privacy Practices']/../../../../following-sibling::div"));
	}

	public WebElement getNondiscrimination() {
		return driver.findElement(By.xpath(
				"//h3[text()='Notice of Nondiscrimination ']/../../../../following-sibling::div"));
	}

	public WebElement getHouseholdInfoCheckBox() {
		return driver.findElement(By.xpath("//input[contains(@title,'household information')]/.."));
	}

	public WebElement getRegisterToVoteCheckBox() {
		return driver.findElement(By.xpath("//input[@title='No']/.."));
	}

	public WebElement getFirstName() {
		return driver.findElement(By.xpath("//input[contains(@title,'First Name')]"));
	}

	public WebElement getLastName() {
		return driver.findElement(By.xpath("//input[contains(@title,'Last Name')]"));
	}

	public WebElement getAgreement() {
		return driver.findElement(By.xpath("//input[contains(@aria-label,'I understand')]/.."));
	}

	public WebElement getSubmit() {
		return driver.findElement(By.xpath("//button[text()='Submit']"));
	}

}