package testngparallel;

import org.testng.annotations.Test;

public class Login 
{
	
  @Test
  public void loginWithValidCredientials() 
  {
	  System.out.println("Login- loginWithValidCredientials- " + Thread.currentThread().getId());
  }
  
  @Test
  public void loginWithInValidCredientials() 
  {
	  System.out.println("Login- loginWithInValidCredientials- " + Thread.currentThread().getId());
  }
  
  @Test
  public void loginWithValidUserAndInvalidPassword() 
  {
	  System.out.println("Login- loginWithValidUserAndInvalidPassword- " + Thread.currentThread().getId());
  }
  
  @Test
  public void loginWithInValidUserAndvalidPassword() 
  {
	  System.out.println("Login- loginWithInValidUserAndvalidPassword- " + Thread.currentThread().getId());
  }
  
  @Test
  public void loginWithEmptyCredientials() 
  {
	  System.out.println("Login- loginWithEmptyCredientials- " + Thread.currentThread().getId());
  }
}
