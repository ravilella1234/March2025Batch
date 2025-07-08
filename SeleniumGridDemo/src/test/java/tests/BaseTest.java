package tests;

import java.io.FileReader;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest 
{
	public static WebDriver driver;
	public Properties p;
	
	@BeforeMethod
	@Parameters({"os","browser", "url"})
	public void startup(String os,String br,String url) throws Exception
	{
		FileReader file = new FileReader("./src/test/resources/config.properties");
		p = new Properties();
		p.load(file);
		
		//remote
		if(p.getProperty("execution_env").equalsIgnoreCase("remote"))
		{
			System.out.println("Remote code is executed...");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			
			//os
			if(os.equalsIgnoreCase("windows"))
			{
				capabilities.setPlatform(Platform.WINDOWS);
			}
			else if(os.equalsIgnoreCase("mac")) 
			{
				capabilities.setPlatform(Platform.MAC);
			}
			else 
			{
				System.out.println("No matching os");
				return;
			}
			
			
			//browser
			switch(br.toLowerCase())
			{
				case "chrome"  : capabilities.setBrowserName("chrome"); break;
				case "edge"    : capabilities.setBrowserName("edge"); break;
				case "firefox" : capabilities.setBrowserName("firefox"); break;
				default : System.out.println("Invalid browser name...");
				return;
			}
			
			driver = new RemoteWebDriver(new URL("http://192.168.50.200:4444/wd/hub"), capabilities);
		}
		
		//local
		if(p.getProperty("execution_env").equalsIgnoreCase("local"))
		{
			System.out.println("local code is executed...");
			
			switch(br.toLowerCase()) 
			{
				case "chrome" : driver = new ChromeDriver();break;
				case "edge" : driver = new EdgeDriver();break;
				case "firefox" : driver = new FirefoxDriver();break;
				default: System.out.println("Invalid Browser name....");
				return;
			}
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		
	}
	
	@AfterMethod
	public void endup()
	{
		driver.quit();
	}

}
