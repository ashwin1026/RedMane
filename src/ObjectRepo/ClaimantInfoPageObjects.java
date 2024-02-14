package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClaimantInfoPageObjects {
	
	WebDriver driver;
	
	public ClaimantInfoPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[contains(text(),'Home phone number:')]/parent::td/following-sibling::td//input[1]")
	private WebElement homePhone1;
	
	@FindBy(xpath = "//span[contains(text(),'Home phone number:')]/parent::td/following-sibling::td//tr[1]//td[1]//td[3]//input")
	private WebElement homePhone2;
	
	@FindBy(xpath = "//input[@title[contains(.,'Do you need health coverage')]]")
	private WebElement healthBenefits;
	
	@FindBy(xpath = "//input[contains(@title,'mailing address')]")
	private WebElement mailingAddress;
	
	@FindBy(xpath = "//input[contains(@title, 'Manually Entered Address')]")
	private WebElement address;
	
	public WebElement getHomePhone1() {
		return homePhone1;
	}
	
	public WebElement getHomePhone2() {
		return homePhone2;
	}
	
	public WebElement getHealthBenefits() {
		return healthBenefits;
	}
	
	public WebElement getMailingAddress() {
		return mailingAddress;
	}
	
	public WebElement getAddress() {
		return address;
	}

}