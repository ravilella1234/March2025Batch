package dataDrivens;

import java.util.Hashtable;

import org.testng.annotations.Test;

public class TestPro 
{
  @Test(dataProvider = "dp", dataProviderClass = DataPro.class)
  public void f(Hashtable<String, String> str) 
  {
	  
  }
}
