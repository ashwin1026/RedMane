package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ReviewClaimantDetailsPageObjects {
    private WebDriver driver;
    
    public ReviewClaimantDetailsPageObjects(WebDriver driver) {
        this.driver = driver;
    }
    
    //Get SSN
    public WebElement getSSN() {
        return driver.findElement(By.xpath("//span[contains(text(), 'Social Security Number')]/../../td[1]/following-sibling::td[1]/descendant::td[1]"));
    }
    
    //Get Close
    public WebElement getClose() {
        return driver.findElement(By.xpath("//span[text()='Close']"));
    }
}