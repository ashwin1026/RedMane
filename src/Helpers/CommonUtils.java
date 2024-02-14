package Helpers;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtils {

	public static WebDriver driver = null;
	public static WebDriverWait wait;
	
	public static FluentWait<WebDriver> getFluentWait() {
		 FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(30))
				 .pollingEvery(Duration.ofSeconds(5))
				 .ignoring(NoSuchElementException.class);
		return fluentWait;
	
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		CommonUtils.driver = driver;
	}
	public static void setWebDriverWait(WebDriver driver) {
		wait = new WebDriverWait(CommonUtils.driver, Duration.ofSeconds(30));
		
	}
}