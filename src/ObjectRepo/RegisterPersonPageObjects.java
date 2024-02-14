package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPersonPageObjects {
	
	WebDriver driver;
	
	public RegisterPersonPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[contains(@title,'Gender')]")
	WebElement gender;
	
	public WebElement getGender() {
		return gender;
	}
	
	@FindBy(xpath="//input[@aria-label='Date of Birth']")
	WebElement dateOfBirth;
	
	public WebElement getDOB() {
		return dateOfBirth;
	}
	
	@FindBy(xpath="//input[@title='Street 1']")
	WebElement street1;
	
	public WebElement getStreet1() {
		return street1;
	}
	
	@FindBy(xpath="//input[@title='City']")
	WebElement city;
	
	public WebElement getCity() {
		return city;
	}
	
	@FindBy(xpath="//input[@title='County']")
	WebElement county;
	
	public WebElement getCounty() {
		return county;
	}
	
	@FindBy(xpath="//input[@title='State']")
	WebElement state;
	
	public WebElement getState() {
		return state;
	}
	
	@FindBy(xpath="//input[@title='Zip']")
	WebElement zip;
	
	public void setZip(String zipValue) {
		zip.sendKeys(zipValue);
	}
	
	@FindBy(xpath="//button[text()='Save']")
	WebElement saveButton;
	
	public WebElement getSaveButton() {
		return saveButton;
	}
}