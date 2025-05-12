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
		
		selectOption("searchDropdownBox","Books");
		
		typeText("field-keywords","Harry Potter");
		
		clickElement("//*[@id=\"nav-search-submit-button\"]");
		
		/*driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
		
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();*/
	}

	

}
