package testngAssertions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssertionTest 
{
	
  @Test
  public void amazon() 
  {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.in/");
	  String actuallink = driver.findElement(By.linkText("Bestsellers")).getText();
	  String expectedlink = "Bestseller";
	  
	  //SoftAssertion
	  SoftAssert soft = new SoftAssert();
	  //soft.assertEquals(actuallink, expectedlink);
	  soft.assertTrue(actuallink.equals(expectedlink), "Both links are not equal..");
	  
	  
	  soft.assertTrue(false, "err1");
	  
	  soft.assertTrue(true, "err2");
	  
	  soft.assertTrue(false, "err3");
	  
	  soft.assertTrue(false, "err4");
	  
	  //assertTrue(false, "err5");
	  
	  //Hard Assertion
	  //Assert.assertEquals(actuallink, expectedlink);
	 
	  driver.findElement(By.linkText("Bestsellers")).click();
	  
	  System.out.println("Execution is success...");
	  
	  soft.assertAll();
	  
  }
  
}
