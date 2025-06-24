package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 
{
	WebDriver driver;

    // Locators - Page Factory model using with @FindBy
	
	@FindBy(id="email") private WebElement usernameField;
	@FindBy(id="pass") private WebElement passwordField;
	@FindBy(id="u_0_5_/P") private WebElement loginButton; 
	@FindBy(xpath="//img[@alt='Facebook']") private WebElement verifyTitle;
	

    // Constructor
    public LoginPage2(WebDriver driver) {
        //this.driver = driver;
       PageFactory.initElements(driver, this);
    }

    // Methods
    public void enterUsername(String username) {
    	usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
    	passwordField.sendKeys(password);
    }

    public void clickLogin() {
    	loginButton.click();
    }

    public Boolean verifyTitle()
    {
    	return verifyTitle.isDisplayed();
    }

}
