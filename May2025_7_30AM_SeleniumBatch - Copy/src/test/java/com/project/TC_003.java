package com.project;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class TC_003 extends BaseClass
{
	private static final Logger log = Logger.getLogger(TC_003.class);
	
	public static void main(String[] args) throws Exception 
	{
		init();
		log.info("init the properties files....");
		
		browserLaunch("chromebrowser");
		log.info("Launched the Browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		log.info("Navigated to page : " + childProp.getProperty("amazonurl") );
		
		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		
		selectOption("amazondropbox_id","Books");
		log.info("selected the option <Books> by using locator : " + orProp.getProperty("amazondropbox_id") );
		
		typeText("amazonsearchtextbox_name","Harry Potter");
		log.info("Entered the text <Harry Potter> by using locator : " + orProp.getProperty("amazonsearchtextbox_name"));
		
		clickElement("amazonsearchbutton_xpath");
		log.info("Clicked on amazonsearchbutton element By using locator : " + orProp.getProperty("amazonsearchbutton_xpath") );
		
	}
}
