package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressValidationPageObjects {

	WebDriver driver;
	
	public AddressValidationPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[contains(@title, 'Manually Entered Address')]")
	WebElement addressValidation;
	
	@FindBy(xpath="//span[text()='Next']")
	WebElement nextLink;
	
	public WebElement getAddressValidation() {
		return addressValidation;
	}

	public WebElement getNextLink() {
		return nextLink;
	}
}