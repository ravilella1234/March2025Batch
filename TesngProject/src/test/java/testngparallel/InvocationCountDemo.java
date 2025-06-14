package testngparallel;

import org.testng.annotations.Test;

public class InvocationCountDemo 
{
	
  @Test(invocationCount = 5,invocationTimeOut = 2000)
  public void invocationCountDemo() throws Exception 
  {
	  Thread.sleep(500); // Simulates some processing time
	  System.out.println("Iam InvocationCountDemo : " +  Thread.currentThread().getId());
  }
}
