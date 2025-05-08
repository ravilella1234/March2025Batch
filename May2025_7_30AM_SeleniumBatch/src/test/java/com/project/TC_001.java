package com.project;

public class TC_001 extends BaseClass
{
	
	public static void main(String[] args) throws Exception 
	{		
		init();
		
		browserLaunch("firefoxbrowser");
		
		navigateUrl("amazonurl");
	}
}
