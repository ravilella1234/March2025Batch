package com.project;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager 
{
	
	static ExtentHtmlReporter htmlReporter ;
	static ExtentReports report;
	
	public static ExtentReports getInstance() 
	{
		if(htmlReporter == null)
		{
			htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"//report//htmlreport.html");
			htmlReporter.config().setDocumentTitle("Automation Report");
			htmlReporter.config().setReportName("Functional Report");
			htmlReporter.config().setTheme(Theme.STANDARD);
			
			report = new ExtentReports();
			report.attachReporter(htmlReporter);
			report.setSystemInfo("Os", System.getProperty("os.name"));
			report.setSystemInfo("Os version", System.getProperty("os.version"));
			report.setSystemInfo("Tester Name", System.getProperty("user.name"));
			//report.setSystemInfo("Browser Name", ((RemoteWebDriver)driver).getCapabilities().getBrowserName());
			//report.setSystemInfo("Browser Name", (p.getProperty("chromebrowser")));
			report.setSystemInfo("Browser Name", "chromebrowser");
			//report.setSystemInfo("Environment", mainprop.getProperty("env"));
		}
		
		return report;
	}
	
}
