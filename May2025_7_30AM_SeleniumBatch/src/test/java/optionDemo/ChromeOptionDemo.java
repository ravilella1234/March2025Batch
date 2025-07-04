package optionDemo;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeOptionDemo 
{
	static WebDriver driver;	
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();	
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--user-data-dir=C:\\Users\\DELL\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 5");
		option.addArguments("--start-maximized");
		//option.addArguments("--headless");
		//option.addArguments("--incognito");
		option.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		System.out.println(option.getBrowserName());
		option.addArguments("--disable-notifications");
		option.addArguments("--proxy-server=192.168.10.1:1744");
		option.addArguments("--ignore-certificate-errors-spki-list");
		
		
		driver = new ChromeDriver(option);
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
	}

}
