package com.project;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

public class TC_001 extends BaseClass
{
	
	public static void main(String[] args) throws Exception 
	{		
		init();
		
		browserLaunch("chromebrowser");
		
		navigateUrl("amazonurl");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String page = driver.getPageSource();
		System.out.println(page);
		
		String hid1 = driver.getWindowHandle();
		System.out.println(hid1);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
		Set<String> hid2 = driver.getWindowHandles();
		for(String h:hid2)
		{
			System.out.println(h);
		}
		
		System.out.println(driver.getTitle());
		
		
		//driver.navigate().back();
		
		//Thread.sleep(4000);
		
		//driver.navigate().forward();
		
		//Thread.sleep(4000);
		
		//driver.navigate().refresh();
		
		//driver.close();
		
		//driver.quit();
		
		
		String text = driver.findElement(By.linkText("Cart")).getText();
		System.out.println(text);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
		}
	}
}
