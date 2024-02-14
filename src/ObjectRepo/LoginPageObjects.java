package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {

    WebDriver driver;

    public LoginPageObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "j_username")
    WebElement userName;

    public WebElement getUserName() {
        return userName;
    }

    @FindBy(id = "j_password")
    WebElement password;

    public WebElement getPassword() {
        return password;
    }

    @FindBy(xpath = "//span[contains(text(), 'Login')]")
    WebElement loginButton;

    public WebElement getLoginButton() {
        return loginButton;
    }

}