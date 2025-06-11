package testngpack;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

public class TNG_002 extends BaseClass
{
	
  @BeforeMethod
  @Parameters({"browser","url"})
  public void beforeMethod(String btype,@Optional("https://www.flipkart.com/") String url) throws Exception 
  {
	  System.out.println("BeforeMethod");
	    init();
		test = report.createTest("TNG_002");
		test.log(Status.INFO, "init the properties files....");
		
		browserLaunch(btype);
		test.log(Status.PASS, "Launched the Browser : " + btype);
		
		navigateUrl(url);
		test.log(Status.FAIL, "Navigated to page : " + childProp.getProperty("amazonurl"));
  }
  
  
  @Test
  public void amazon() 
  {
	  System.out.println("Amazon Test");
	    selectOption("amazondropbox_id","Books");
		test.log(Status.PASS, "selected the option <Books> by using locator : " + orProp.getProperty("amazondropbox_id"));
		
		typeText("amazonsearchtextbox_name","Harry Potter");
		test.log(Status.INFO, "Entered the text <Harry Potter> by using locator : " + orProp.getProperty("amazonsearchtextbox_name"));
		
		clickElement("amazonsearchbutton_xpath");
		test.log(Status.PASS, "Clicked on amazonsearchbutton element By using locator : " + orProp.getProperty("amazonsearchbutton_xpath"));
  }
  

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("AfterMethod");
	  report.flush();
	  driver.quit();
  }

}
