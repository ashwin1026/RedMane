package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewApplicationPageObjects {
 
    public WebDriver driver;

    public NewApplicationPageObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
 
    @FindBy(xpath = "//input[contains(@title,'Income Support')]")
    public WebElement incomeSupportType;
 
    public WebElement getIncomeSupportType() {
        return incomeSupportType;
    }

    @FindBy(xpath = "//input[contains(@title,'Medical Assistance')]")
    public WebElement medicalAssistanceType;
 
    public WebElement getMedicalAssistanceType() {
        return medicalAssistanceType;
    }
 
}