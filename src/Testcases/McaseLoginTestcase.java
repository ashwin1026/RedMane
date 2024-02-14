package Testcases;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helpers.CommonUtils;
import ObjectRepo.McaseLoginObjects;

public class McaseLoginTestcase {

	WebDriver driver;
	WebDriverWait wait;

	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		CommonUtils.setDriver(new ChromeDriver());
		driver = CommonUtils.getDriver();
		CommonUtils.setWebDriverWait(driver);
		driver.get("https://qa-core.redmane-cloud.us/");
		driver.manage().window().maximize();
	}

	@Test
	public void login() {

		CommonUtils.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		McaseLoginObjects mcaseLoginObjects = new McaseLoginObjects(driver);
		mcaseLoginObjects.getUserNameInput().sendKeys("tester");
		mcaseLoginObjects.getPasswordInput().sendKeys("Password1@");
		mcaseLoginObjects.getLoginButton().click();
		System.out.println("Login is successful");
		Reporter.log("Login is successful");
	}

	@AfterSuite
	public void close() {
		driver.quit();
	}

}