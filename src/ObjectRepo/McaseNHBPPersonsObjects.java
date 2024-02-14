package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class McaseNHBPPersonsObjects {
	
	WebDriver driver;
	
	public McaseNHBPPersonsObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getWorkspaceLabel() {
        return driver.findElement(By.xpath("//label[text() = 'NHBP Persons']"));
    }
	
	public WebElement getAddRecordButton() {
		return driver.findElement(By.xpath("//button[@aria-label='Add relationship']"));
	}

}