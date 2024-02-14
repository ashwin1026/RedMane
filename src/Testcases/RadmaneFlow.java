package Testcases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ObjectRepo.*;

public class RadmaneFlow {
    private WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://sit2-cw.sdeeservices.com/Curam/logon.jsp");
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void testRamaneFlow() {
        LoginPageObjects loginPageObjects = new LoginPageObjects(driver);
        //loginPageObjects.getUserName("eligibilityworker");
        //loginPageObjects.getPassword("password");
        loginPageObjects.getLoginButton().click();
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
    
    @Test(priority = 2)
	public void navigateToRegisterPage() {
    	driver.switchTo().frame(0);
    	System.out.println("Switched to iframe 0");
    	HomePageObjects hpo = new HomePageObjects(driver);
		hpo.getRegisterAPersonLink().click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
    
    @Test(priority = 3)
    public void searchPerson() throws InterruptedException{
    	driver.switchTo().parentFrame();
    	
    	System.out.println("Switched to parent frame");
    	driver.switchTo().frame(1);
    	System.out.println("Switched to iframe 1");
    	SearchPageObjects searchPageObjects = new SearchPageObjects(driver);
        //searchPageObjects.setFirstName("TestFirstName12");
        //searchPageObjects.setLastName("TestLastName12");
        searchPageObjects.getGender().sendKeys("Male");
        searchPageObjects.getSearchButton().click();
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        String searchResultMessage = searchPageObjects.getSearchResultMessage().getText();
        assertTrue(searchResultMessage.contains("Number of Items: 0"));
        System.out.println("" + searchResultMessage);
        driver.switchTo().parentFrame();
    	
    	System.out.println("Switched to parent frame");
    	
        searchPageObjects.getNextButton().click();
        Thread.sleep(3000);
    }
    
    @Test(priority = 4)
	public void registerPerson() throws InterruptedException {
		// switch to iframe 2
		driver.switchTo().frame(1);
		Thread.sleep(3000);
		// create object of {{RegisterPersonPageObjects}} and call {{setDOB}} with parameter as “1/1/1993”
		RegisterPersonPageObjects registerPersonPageObjects = new RegisterPersonPageObjects(driver);
		registerPersonPageObjects.getGender().sendKeys("Female");
		Thread.sleep(1000);
		registerPersonPageObjects.getGender().sendKeys(Keys.TAB);
		
		
		//registerPersonPageObjects.setDOB("1/1/1993");
		Thread.sleep(1000);
		// create object of {{RegisterPersonPageObjects}} and call {{setStreet1}} with parameter as “Test Street 1”
		//registerPersonPageObjects.setStreet1("Test Street 1");
		Thread.sleep(1000);
		// create object of {{RegisterPersonPageObjects}} and call {{setCity}}with parameter as “Chicago”
		//registerPersonPageObjects.setCity("Chicago");
		Thread.sleep(1000);
		// create object of {{RegisterPersonPageObjects}} and call {{setCounty}}with parameter as “Union”
		registerPersonPageObjects.getCounty().sendKeys("Union");
		Thread.sleep(1000);
		registerPersonPageObjects.getCounty().sendKeys(Keys.TAB);
		// create object of {{RegisterPersonPageObjects}} and call {{setState}}with parameter as “Alaska”
		registerPersonPageObjects.getState().sendKeys("Alaska");
		Thread.sleep(1000);
		registerPersonPageObjects.getState().sendKeys(Keys.TAB);
		// create object of {{RegisterPersonPageObjects}} and call {{setZip}}with parameter as “60203”
		registerPersonPageObjects.setZip("60203");
		Thread.sleep(1000);
		// switch to parent frame
		driver.switchTo().defaultContent();
		
		// create object of {{RegisterPersonPageObjects}} and call {{getSaveButton and click}}
		registerPersonPageObjects.getSaveButton().click();
		Thread.sleep(15000);
	}
    
    @Test(priority = 5)
    public void clientOutcomes() throws InterruptedException{
    	
    	driver.switchTo().defaultContent();
    	//System.out.println("Switched to frame 1");
		Thread.sleep(3000);
		
    	ClientOutcomesPageObjects clientOutcomesPageObjects = new ClientOutcomesPageObjects(driver);
    	Actions act =  new Actions(driver);
    	act.moveToElement(clientOutcomesPageObjects.getMenu()).click().perform();
    	
    	//clientOutcomesPageObjects.getMenu().click();
        clientOutcomesPageObjects.getNewApplicationLink().click();
    }

}