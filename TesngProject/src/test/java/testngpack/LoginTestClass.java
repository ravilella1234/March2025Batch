package testngpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.LoginPage2;

public class LoginTestClass 
{
	
  @Test
  public void f() 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  
	 // LoginPage page = new LoginPage(driver);
	  
	  LoginPage2 page = new LoginPage2(driver);
	  page.enterUsername("ravilella");
	  page.enterPassword("password");
	 // page.clickLogin();
  }
}
