package testngparallel;

import org.testng.annotations.Test;

public class Register 
{
	
  @Test
  public void registerWithMandatoryFileds() 
  {
	  System.out.println("Register - registerWithMandatoryFileds - " + Thread.currentThread().getId());
  }
  
  @Test
  public void registerWithAllFileds() 
  {
	  System.out.println("Register - registerWithAllFileds - " + Thread.currentThread().getId());
  }
  
  @Test
  public void registerWithEmptyFileds() 
  {
	  System.out.println("Register - registerWithEmptyFileds- " + Thread.currentThread().getId());
  }
  
  @Test
  public void registerWithDuplicateFileds() 
  {
	  System.out.println("Register - registerWithDuplicateFileds- " + Thread.currentThread().getId());
  }
  
}
