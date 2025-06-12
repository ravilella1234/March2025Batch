package testngparallel;

import java.util.Arrays;

import org.testng.TestNG;

public class Runsuiteparallel 
{

	public static void main(String[] args) 
	{
		/*String[] a1 = new String[5];
		String[] a2 = {"10","20"};
		String[] a3 = new String[] {"10","20"};*/
		
		
		TestNG obj = new TestNG();
		obj.setTestSuites(Arrays.asList(new String[]{System.getProperty("user.dir")+"//megasuite.xml"}));
		obj.setSuiteThreadPoolSize(2);
		obj.run();
	}

}
