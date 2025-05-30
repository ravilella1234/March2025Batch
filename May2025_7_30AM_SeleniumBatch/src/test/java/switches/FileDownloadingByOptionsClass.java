package switches;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownloadingByOptionsClass 
{

	public static void main(String[] args) 
	{
		
		ChromeOptions options = new ChromeOptions(); 
		
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>(); 
		chromePrefs.put("profile.default_content_settings.popups", 1); 
		
		String downloadFilepath = System.getProperty("user.dir"); 
		chromePrefs.put("download.default_directory", downloadFilepath); 
		
		options.setExperimentalOption("prefs", chromePrefs);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.mozilla.org/en-US/firefox/windows/");
		driver.findElement(By.xpath("//strong[@class='download-title']")).click();
		
		//File f = new File(downloadFilepath);
	}

}
