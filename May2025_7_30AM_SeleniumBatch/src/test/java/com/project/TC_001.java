package com.project;

public class TC_001 extends BaseClass
{

	public static void main(String[] args) 
	{
		browserLaunch("chrome");
		
		navigateUrl("https://www.amazon.in/");
		
		browserLaunch("firefox");
		
		navigateUrl("https://www.flipkart.com/");
	}

}
