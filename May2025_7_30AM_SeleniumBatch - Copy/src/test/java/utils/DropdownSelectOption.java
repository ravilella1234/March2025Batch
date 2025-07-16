package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownSelectOption 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement loc = driver.findElement(By.id("searchDropdownBox"));
		Select s = new Select(loc);
		s.selectByIndex(1);
		
		Thread.sleep(4000);
		s.selectByVisibleText("Amazon Devices");
		
		Thread.sleep(4000);
		s.selectByValue("search-alias=fashion");
		
		Thread.sleep(4000);
		
		String option = s.getFirstSelectedOption().getText();
		System.out.println(option);
		
		List<WebElement> options = s.getOptions();
		for(WebElement opt:options)
		{
			System.out.println(opt.getText());
		}
		
	}

}
