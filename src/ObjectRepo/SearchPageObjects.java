package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPageObjects {
	
	private WebDriver driver;
	
	public SearchPageObjects(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFirstName() {
		return driver.findElement(By.xpath("//input[@title='First Name']"));
	}

	public WebElement getLastName() {
		return driver.findElement(By.xpath("//input[@title='Last Name']"));
	}

	public WebElement getGender() {
		return driver.findElement(By.xpath("//input[@title='Gender']"));
	}

	public WebElement getSearchButton() {
		return driver.findElement(By.xpath("//span[text()='Search']"));
	}
	
	public WebElement getSearchResultMessage() {
		return driver.findElement(By.xpath("//h3[contains(text(),'Search Results')]"));
	}

	public WebElement getNextButton() {
		return driver.findElement(By.xpath("//button[contains(text(),'Next')]"));
	}

}