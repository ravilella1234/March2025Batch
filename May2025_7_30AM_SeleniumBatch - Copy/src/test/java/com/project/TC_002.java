package com.project;

import org.openqa.selenium.By;

public class TC_002 extends BaseClass
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		browserLaunch("chromebrowser");
		
		navigateUrl("amazonurl");
		
		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		
		selectOption("amazondropbox_id","Books");
		
		typeText("amazonsearchtextbox_name","Harry Potter");
		
		clickElement("amazonsearchbutton_xpath");
		
		
		
		/*driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
		
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();*/
	}

	

}
