package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects 
{
	WebDriver driver;
	
	public HomePageObjects(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement getRegisterAPersonLink(){
		return driver.findElement(By.xpath("//a[contains(text(),'Register a Person...')]"));
	}
}
