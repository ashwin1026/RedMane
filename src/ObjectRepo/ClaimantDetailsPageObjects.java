package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClaimantDetailsPageObjects {
    WebDriver driver;

    public ClaimantDetailsPageObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[contains(@title, 'Does the claimant have an SSN?')]")
    WebElement SSNQuestion;

    @FindBy(xpath = "//input[contains(@title, 'Social Security Number')]")
    WebElement SSN;

    @FindBy(xpath = "//input[@title='Date of birth']")
    WebElement DOB;

    @FindBy(xpath = "//input[@title='Gender']")
    WebElement Gender;

    @FindBy(xpath = "//input[@title='Marital status']")
    WebElement MaritalStatus;

    @FindBy(xpath = "//input[contains(@title, 'citizen status')]")
    WebElement CitizenStatus;

    @FindBy(xpath = "//input[contains(@title, 'member of the household')]")
    WebElement HouseholdDate;

    @FindBy(xpath = "//input[contains(@title, 'resident of this state?')]")
    WebElement ResidentStateQuestion;

    @FindBy(xpath = "//input[contains(@title,'Residency Status')]")
    WebElement ResidencyStatus;

    @FindBy(xpath = "//input[contains(@title, 'living arrangement')]")
    WebElement LivingArrangement;

    @FindBy(xpath = "//input[contains(@title, 'status of this living arrangement')]")
    WebElement LivingArrangementStatus;

    @FindBy(xpath = "//input[contains(@title, 'living arrangement begin')]")
    WebElement LivingArrangementBeginDate;

    @FindBy(xpath = "//input[contains(@title, 'Prefer not to disclose')]")
    WebElement PreferNotDisclose;

    @FindBy(xpath = "//input[contains(@title,'claimant currently attend high school')]")
    WebElement ClaimantCurrentEducation;

    public WebElement getSSNQuestion() {
        return SSNQuestion;
    }

    public WebElement getSSN() {
        return SSN;
    }

    public WebElement getDOB() {
        return DOB;
    }

    public WebElement getGender() {
        return Gender;
    }

    public WebElement getMaritalStatus() {
        return MaritalStatus;
    }

    public WebElement getCitizenStatus() {
        return CitizenStatus;
    }

    public WebElement getHouseholdDate() {
        return HouseholdDate;
    }

    public WebElement getResidentStateQuestion() {
        return ResidentStateQuestion;
    }

    public WebElement getResidencyStatus() {
        return ResidencyStatus;
    }

    public WebElement getLivingArrangement() {
        return LivingArrangement;
    }

    public WebElement getLivingArrangementStatus() {
        return LivingArrangementStatus;
    }

    public WebElement getLivingArrangementBeginDate() {
        return LivingArrangementBeginDate;
    }

    public WebElement getPreferNotDisclose() {
        return PreferNotDisclose;
    }

    public WebElement getClaimantCurrentEducation() {
        return ClaimantCurrentEducation;
    }
}