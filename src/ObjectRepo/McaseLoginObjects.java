package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class McaseLoginObjects {

    WebDriver driver;

    public McaseLoginObjects(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "UserName")
    WebElement userName;

    @FindBy(id = "Password")
    WebElement password;

    @FindBy(id = "LoginBtn")
    WebElement loginButton;

    public WebElement getUserNameInput(){
        return userName;
    }

    public WebElement getPasswordInput(){
        return password;
    }

    public WebElement getLoginButton(){
        return loginButton;
    }
}
