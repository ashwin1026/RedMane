

package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class McaseDemographicInfoObjects {
	
	WebDriver driver;
	
	public McaseDemographicInfoObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getFirstNameInput() {
		return driver.findElement(By.name("FirstName"));
	}
	
	public WebElement getLastNameInput() {
		return driver.findElement(By.name("LastName"));
	}
	
	public WebElement getSaveLink() {
		return driver.findElement(By.linkText("Save"));
	}
	
	public WebElement getEditLink() {
		return driver.findElement(By.linkText("Edit"));
	}
	
	public WebElement getContactsLink() {
		return driver.findElement(By.linkText("Contacts"));
	}
	
	public WebElement getEmailAddressInput() {
		return driver.findElement(By.name("EmailAddress"));
	}
	
	public WebElement getNextSectionButton() {
		return driver.findElement(By.xpath("//button[contains(text(),'Next Section')]"));
	}
	
	public WebElement getSuicideConcernCheckbox() {
		return driver.findElement(By.xpath("//label[text()[contains(.,'Suicide Concern')]]/preceding-sibling::input"));
	}
	
	public WebElement getViolenceConcernCheckbox() {
		return driver.findElement(By.xpath("//label[text()[contains(.,'Violence Concern')]]/preceding-sibling::input"));
	}
	
	public WebElement getRelatedRecordButton() {
		return driver.findElement(By.xpath("//a[@aria-label='Open add child record modal']"));
	}
	
	public WebElement getRelationshipsLink() {
		return driver.findElement(By.xpath("//div[text()='Relationships']"));
	}
	
	public WebElement getRelationshipTypeDropdown() {
		return driver.findElement(By.xpath("//select[1]"));
	}
}