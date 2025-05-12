package com.project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass 
{
	
	public static WebDriver driver;
	public static File f;
	public static FileInputStream fis;
	public static Properties p;
	public static Properties mainProp;
	public static Properties childProp;
	
    public static void init() throws Exception 
    {
    	//"C:\\Users\\DELL\\eclipse-workspace\\May2025_7_30AM_SeleniumBatch\\src\\test\\resources\\data.properties"
    	String projectRootPath = System.getProperty("user.dir");
    	//System.out.println(projectRootPath);
    	String testresourcesPath = "\\src\\test\\resources\\";
    	//System.out.println(testresourcesPath);
    	
    	f = new File(projectRootPath+testresourcesPath+"\\data.properties");
    	fis = new FileInputStream(f);
    	p = new Properties();
    	p.load(fis);
    	/*String e = p.getProperty("amazonurl");
    	System.out.println(e);*/
    	
    	f = new File(projectRootPath+testresourcesPath+"\\env.properties");
    	fis = new FileInputStream(f);
    	mainProp = new Properties();
    	mainProp.load(fis);
    	String e = mainProp.getProperty("environment");
    	System.out.println(e);
    	
    	f = new File(projectRootPath+testresourcesPath+e+".properties");
    	fis = new FileInputStream(f);
    	childProp = new Properties();
    	childProp.load(fis);
    	String value = childProp.getProperty("amazonurl");
    	System.out.println(value);
    }
	
	public static void browserLaunch(String browser)
	{
		if(p.getProperty(browser).equals("chrome")) {
			driver = new ChromeDriver();
		}else if (p.getProperty(browser).equals("firefox")) {
			driver = new FirefoxDriver();
		}else if (p.getProperty(browser).equals("edge")) {
			driver = new EdgeDriver();
		}else {
			System.out.println("Pleas enter right browser");
		}
	}
	
	public static void navigateUrl(String url)
	{
		driver.get(childProp.getProperty(url));
	}
	
	
	public static void clickElement(String string) {
		// TODO Auto-generated method stub
		
	}

	public static void typeText(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

	public static void selectOption(String string, String string2) {
		// TODO Auto-generated method stub
		
	}
	

}
