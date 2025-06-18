package testnglistners;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.Status;

import testngpack.BaseClass;

public class MyListner extends BaseClass  implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		String testName = result.getMethod().getMethodName();
		System.out.println(testName + " has started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String testName = result.getMethod().getMethodName();
		System.out.println(testName + " has Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		if(!result.isSuccess())
		{
			String testName = result.getMethod().getMethodName();
			try 
			{
				File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(scrFile, new File(System.getProperty("user.dir")+"//failure//"+filePath+".png"));
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			
			test.log(Status.FAIL, testName + " has failed");
			try {
				test.log(Status.INFO,"Screenshot --->" +test.addScreenCaptureFromPath(System.getProperty("user.dir")+"//failure//"+filePath+".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Reporter.log("<a href='" + System.getProperty("user.dir")+"//failure//"+filePath+".png" + "'> <img src='" + System.getProperty("user.dir")+"//failure//"+filePath+".png" + "' height='100' width='100'/> </a>");
			Reporter.log("Test has Failed:" + testName);
			Reporter.log(result.getThrowable().getMessage());
		}
		
		
		
		
		/*String testName = result.getMethod().getMethodName();
		System.out.println(testName + " has Failed");*/		
	}
	

	@Override
	public void onTestSkipped(ITestResult result) {
		String testName = result.getMethod().getMethodName();
		System.out.println(testName + " has skipped");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println(context.getName() + " Started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println(context.getName() + " Finished");
	}

	
	
}
