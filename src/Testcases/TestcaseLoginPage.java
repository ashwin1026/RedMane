package Testcases;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Helpers.CommonUtils;
import ObjectRepo.HomePageObjects;
import ObjectRepo.LoginPageObjects;

public class TestcaseLoginPage {
	
	WebDriver driver = CommonUtils.getDriver();
		
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		CommonUtils.setDriver(driver);
		CommonUtils.setWebDriverWait(driver);
		CommonUtils.driver.get("https://sit2-cw.sdeeservices.com/Curam/logon.jsp");
		CommonUtils.driver.manage().window().maximize();
	}
	
	@Test
	public void login() {
		
		CommonUtils.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		LoginPageObjects loginPage = new LoginPageObjects(CommonUtils.driver);
		loginPage.getUserName().sendKeys("eligibilityworker");;
		loginPage.getPassword().sendKeys("password");;
		loginPage.getLoginButton().click();
		System.out.println("Login is done");
	}

}