package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutorDemo 
{

	public static void main(String[] args) 
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('email').value='ravilella'");
		
		String title = js.executeScript("return document.title").toString();
		System.out.println(title);
		
		js.executeScript("window.scrollBy(0,200)");
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		js.executeScript("document.getElementById('u_0_5_ef').scrollIntoView()");
		
		js.executeScript("window.history.back()");
		
		js.executeScript("window.history.forward()");
		
		js.executeScript("window.history.go(0)");
	}
}
