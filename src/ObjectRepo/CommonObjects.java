package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonObjects {
	
	private WebDriver driver;
	
	public CommonObjects(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getNextButton() {
		return driver.findElement(By.xpath("//button[contains(text(),'Next')]"));
	}
	
	public WebElement getNextLink() {
		return driver.findElement(By.xpath("//a[contains(@title,'next')]"));
	}
	
}