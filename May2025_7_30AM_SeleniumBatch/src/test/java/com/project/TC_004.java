package com.project;

import com.aventstack.extentreports.Status;

public class TC_004 extends BaseClass
{
	
	
	public static void main(String[] args) throws Exception 
	{
		init();
		test = report.createTest("TC_004");
		test.log(Status.INFO, "init the properties files....");
		
		browserLaunch("chromebrowser");
		test.log(Status.PASS, "Launched the Browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(Status.FAIL, "Navigated to page : " + childProp.getProperty("amazonurl"));
		
		selectOption("amazondropbox_id","Books");
		test.log(Status.PASS, "selected the option <Books> by using locator : " + orProp.getProperty("amazondropbox_id"));
		
		typeText("amazonsearchtextbox_name","Harry Potter");
		test.log(Status.INFO, "Entered the text <Harry Potter> by using locator : " + orProp.getProperty("amazonsearchtextbox_name"));
		
		clickElement("amazonsearchbutton_xpath");
		test.log(Status.PASS, "Clicked on amazonsearchbutton element By using locator : " + orProp.getProperty("amazonsearchbutton_xpath"));
		
		report.flush();
		
	}
}
