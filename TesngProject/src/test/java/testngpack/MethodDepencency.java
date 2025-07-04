package testngpack;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class MethodDepencency 
{
	
  @Test(priority = 1)
  public void orange() 
  {
	  System.out.println("orange");
  }
  
  
  @Test(priority = 2,dependsOnMethods = {"orange"})
  public void white() 
  {
	  System.out.println("white");
  }
  
  @Test(priority = 3,dependsOnMethods = {"white"})
  public void blue() 
  {
	  System.out.println("blue");
	  //Assert.fail("Blue test is failed...");
	  throw new SkipException("Blue method is skipped");
  }
  
  @Test(priority = 4,dependsOnMethods = {"blue"})
  public void green() 
  {
	  System.out.println("green");
  }
  
}
