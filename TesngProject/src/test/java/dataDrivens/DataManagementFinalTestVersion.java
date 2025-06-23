package dataDrivens;

import org.testng.annotations.Test;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;

public class DataManagementFinalTestVersion 
{
	
  @Test(dataProvider = "testData")
  public void f(Hashtable<String, String> str) 
  {
	  System.out.println(str.get("UserName"));
	  System.out.println(str.get("UserPassword"));
  }

  @DataProvider
  public Object[][] testData() throws Exception 
  {
	  
	  ExcelAPI e = new ExcelAPI("C:\\Users\\DELL\\Desktop\\suitex.xlsx");
	  String sheetName = "data";
	  String testName = "LoginTest";
	  
	  return DataUtil.getTestData(e, sheetName, testName);
   
  }
}
