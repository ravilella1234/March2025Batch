package com.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass 
{
	
	public static WebDriver driver;
	
	public static void browserLaunch(String browser)
	{
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		}else {
			System.out.println("Pleas enter right browser");
		}
	}
	
	public static void navigateUrl(String url)
	{
		driver.get(url);
	}
	

}
