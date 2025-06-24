package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{
	// Locators - Page Object Model using with By
	public  WebDriver driver;
    private By usernameField = By.id("email");
    private By passwordField = By.id("pass");
    private By loginButton = By.id("u_0_5_Vj");
    
   /* Page Factory
   @FindBy(id="email") private WebElement unameFiled;*/
    
    public LoginPage(WebDriver driver) 
    {
		this.driver = driver;
	}

	public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }


	
}
