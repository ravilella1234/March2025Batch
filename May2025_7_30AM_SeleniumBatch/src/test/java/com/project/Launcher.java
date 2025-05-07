package com.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launcher 
{

	public static void main(String[] args) 
	{
		WebDriver driver;
		
		//WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "chrome driver .exe path");
		 driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		
		//WebDriverManager.firefoxdriver().setup();
		//System.setProperty("webdriver.gecko.driver", "firefox driver .exe path");
		 driver = new FirefoxDriver();
		 driver.navigate().to("https://www.flipkart.com/");	
	}
}
