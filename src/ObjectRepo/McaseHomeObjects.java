package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class McaseHomeObjects {
	
	WebDriver driver;
	
	public McaseHomeObjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="workspaceDropDown")
	WebElement workspacesLink;
	
	public WebElement getWorkspacesLink() {
		return workspacesLink;
	}
	
	@FindBy(xpath="//a[@aria-label='NHBP Persons']")
	WebElement nhbpPersonsLink;
	
	public WebElement getNHBPPersonsLink() {
		return nhbpPersonsLink;
	}

}