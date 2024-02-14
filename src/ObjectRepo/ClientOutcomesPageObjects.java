package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientOutcomesPageObjects {
	
	WebDriver driver;
	
	public ClientOutcomesPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@alt='Actions']")
	WebElement menu;
	
	@FindBy(xpath="//td[text()='New Application…']")
	WebElement newApplicationLink;
	
	@FindBy(xpath="//table[contains(@class,'listApplicationsForPerson')]/tbody//tr[1]//td[6]")
	WebElement isApplicationStatus;
	
	//@FindBy(xpath="//img[@alt='Refresh']")
	@FindBy(xpath="//a[@aria-label='Refresh']")
	WebElement refresh;
	
	@FindBy(xpath="//span[text()='Home']")
	WebElement homeLink;
	
	public WebElement getMenu() {
		return menu;
	}
	
	public WebElement getNewApplicationLink() {
		return newApplicationLink;
	}
	
	public WebElement getApplicationStatus() {
		return isApplicationStatus;
	}
	
	public WebElement getRefreshImage() {
		return refresh;
	}
	
	public WebElement getHomeLink() {
		return homeLink;
	}
}