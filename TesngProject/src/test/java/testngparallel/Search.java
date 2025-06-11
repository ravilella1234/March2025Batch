package testngparallel;

import org.testng.annotations.Test;

public class Search 
{
	
  @Test
  public void validTextSearch() 
  {
	  System.out.println("Search - validTextSearch- " + Thread.currentThread().getId());
  }
  
  @Test
  public void InvalidTextSearch() 
  {
	  System.out.println("Search - InvalidTextSearch- " + Thread.currentThread().getId());
  }
  
  @Test
  public void emptyTextSearch() 
  {
	  System.out.println("Search - emptyTextSearch- " + Thread.currentThread().getId());
  }
  
}
