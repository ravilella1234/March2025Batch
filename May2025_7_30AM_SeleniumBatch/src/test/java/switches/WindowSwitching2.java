package switches;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowSwitching2 
{
	static WebDriver driver;
	
	public static void main(String[] args) 
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		System.out.println(driver.getTitle());
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		driver.findElement(By.xpath("//img[@alt='redbus_facebook']")).click();
		driver.findElement(By.xpath("//img[@alt='redbus_linkedin']")).click();
		driver.findElement(By.xpath("//img[@alt='redbus_twitter']")).click();
		driver.findElement(By.xpath("//img[@alt='redbus_instagram']")).click();
		
		Set<String> handles = driver.getWindowHandles();
		List<String> hList = new ArrayList<String>(handles);
		
		/*Set<String> handles = driver.getWindowHandles();
		for(String handle:handles)
		{
			System.out.println(handle);
		}*/
		
		//How to switch to right Window
		switchToRightWindow("Login • Instagram",hList);
		
		//How to close all the Windows and switch back to Parent Window
		closeAllwindows(hList,parentWindow);
	}

	public static void closeAllwindows(List<String> hList, String parentWindow) 
	{
		for(String e:hList)
		{
			//p1
			//p1,c1,c2,c3,c4
			if(!e.equals(parentWindow))
			{
				driver.switchTo().window(e).close();
			}
		}
	}

	public static Boolean switchToRightWindow(String windowTitle, List<String> hList) 
	{
		for(String e:hList)
		{
			String title = driver.switchTo().window(e).getTitle();
			if(title.contains(windowTitle))
			{
				System.out.println("Found Right window...");
				System.out.println(driver.getTitle());
				return true;
			}
		}
		return false;
	}

}
