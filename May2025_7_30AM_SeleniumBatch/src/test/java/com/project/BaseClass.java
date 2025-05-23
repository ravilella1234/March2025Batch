package com.project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import dev.failsafe.Timeout;

public class BaseClass 
{
	
	public static WebDriver driver;
	public static File f;
	public static FileInputStream fis;
	public static Properties p;
	public static Properties mainProp;
	public static Properties childProp;
	public static Properties  orProp;
	public static ExtentReports report;
	public static ExtentTest test;
	
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
    	
    	f = new File(projectRootPath+testresourcesPath+"\\or.properties");
    	fis = new FileInputStream(f);
    	orProp = new Properties();
    	orProp.load(fis);
    	
    	f = new File(projectRootPath+testresourcesPath+"\\log4jconfig.properties");
    	fis = new FileInputStream(f);
    	PropertyConfigurator.configure(fis);
    	
    	report = ExtentManager.getInstance();
 
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
	
	public static void navigateUrl(String url) throws Exception
	{
		driver.get(childProp.getProperty(url));
		driver.manage().window().maximize();
		
		Thread.sleep(10000);
	}
	
	
	public static void clickElement(String locatorKey) {
		getLocatorType(locatorKey).click();
		//driver.findElement(By.xpath(orProp.getProperty(locatorKey))).click();
	}


	public static void typeText(String locatorKey, String text) {
		getLocatorType(locatorKey).sendKeys(text);
		//driver.findElement(By.name(orProp.getProperty(locatorKey))).sendKeys(text);
	}

	public static void selectOption(String locatorKey, String option) {
		getLocatorType(locatorKey).sendKeys(option);
		//driver.findElement(By.id(orProp.getProperty(locatorKey))).sendKeys(option);
	}
	
	public static WebElement getLocatorType(String locatorKey) 
	{
		WebElement element = null;
		
		if(!isElementPresent(locatorKey))
			System.out.println("Element is not present");
		
		element = driver.findElement(getLocator(locatorKey));
		
		/*if(locatorKey.endsWith("_id")) {
			element = driver.findElement(By.id(orProp.getProperty(locatorKey)));
		}else if (locatorKey.endsWith("_name")) {
			element = driver.findElement(By.name(orProp.getProperty(locatorKey)));
		}else if (locatorKey.endsWith("_classname")) {
			element = driver.findElement(By.className(orProp.getProperty(locatorKey)));
		}else if (locatorKey.endsWith("_xpath")) {
			element = driver.findElement(By.xpath(orProp.getProperty(locatorKey)));
		}else if (locatorKey.endsWith("_css")) {
			element = driver.findElement(By.cssSelector(orProp.getProperty(locatorKey)));
		}else if (locatorKey.endsWith("_linktext")) {
			element = driver.findElement(By.linkText(orProp.getProperty(locatorKey)));
		}else if (locatorKey.endsWith("_partiallinktext")) {
			element = driver.findElement(By.partialLinkText(orProp.getProperty(locatorKey)));
		}*/
		
		return element;
	}

	public static boolean isElementPresent(String locatorKey) 
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		
		try 
		{
			wait.until(ExpectedConditions.presenceOfElementLocated(getLocator(locatorKey)));
			
			/*if(locatorKey.endsWith("_id")) {
				wait.until(ExpectedConditions.presenceOfElementLocated((By.id(orProp.getProperty(locatorKey)))));
			}else if (locatorKey.endsWith("_name")) {
				wait.until(ExpectedConditions.presenceOfElementLocated((By.name(orProp.getProperty(locatorKey)))));
			}else if (locatorKey.endsWith("_classname")) {
				wait.until(ExpectedConditions.presenceOfElementLocated((By.className(orProp.getProperty(locatorKey)))));
			}else if (locatorKey.endsWith("_xpath")) {
				wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath(orProp.getProperty(locatorKey)))));
			}else if (locatorKey.endsWith("_css")) {
				wait.until(ExpectedConditions.presenceOfElementLocated((By.cssSelector(orProp.getProperty(locatorKey)))));
			}else if (locatorKey.endsWith("_linktext")) {
				wait.until(ExpectedConditions.presenceOfElementLocated((By.linkText(orProp.getProperty(locatorKey)))));
			}else if (locatorKey.endsWith("_partiallinktext")) {
				wait.until(ExpectedConditions.presenceOfElementLocated((By.partialLinkText(orProp.getProperty(locatorKey)))));
			}*/
			return true;
		} 
		catch (Exception e) 
		{
			return false;
		}
	}
	
	public static By getLocator(String locatorKey)
	{
		By by = null;
		
		if(locatorKey.endsWith("_id")) {
			by = By.id(orProp.getProperty(locatorKey));
		}else if (locatorKey.endsWith("_name")) {
			by = By.name(orProp.getProperty(locatorKey));
		}else if (locatorKey.endsWith("_classname")) {
			by = By.className(orProp.getProperty(locatorKey));
		}else if (locatorKey.endsWith("_xpath")) {
			by = By.xpath(orProp.getProperty(locatorKey));
		}else if (locatorKey.endsWith("_css")) {
			by = By.cssSelector(orProp.getProperty(locatorKey));
		}else if (locatorKey.endsWith("_linktext")) {
			by = By.linkText(orProp.getProperty(locatorKey));
		}else if (locatorKey.endsWith("_partiallinktext")) {
			by = By.partialLinkText(orProp.getProperty(locatorKey));
		}			
		return by;
	}
	
	
	//Verification
	public static boolean isLinksEqual(String expectedlink,String locotorKey) 
	{
		String actuallink = getLocatorType(locotorKey).getText();
		if(actuallink.equals(expectedlink))
			return true;
		else
			return false;
	}
	
	//Reporting
	public static void reportSucess(String successMessage) 
	{
		test.log(Status.PASS, successMessage);
	}

	public static void reportFailure(String FailureMessage,WebElement element ) throws Exception 
	{
		test.log(Status.FAIL, FailureMessage);
		takesScreenshot(element);
	}

	public static void takesScreenshot(WebElement element) throws Exception
	{
		Date dt=new Date();
		System.out.println(dt);
		String dateFormat=dt.toString().replace(":", "_").replace(" ", "_")+".png";		
		
		drawBorder(driver, element);
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrFile, new File(System.getProperty("user.dir")+"//failurescreenshots//"+dateFormat));
		
		test.log(Status.INFO,"Screenshot --->" +test.addScreenCaptureFromPath(System.getProperty("user.dir")+"//failurescreenshots//"+dateFormat));
	}
	
	public static void drawBorder(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='5px solid Red'",element);
	}

}
