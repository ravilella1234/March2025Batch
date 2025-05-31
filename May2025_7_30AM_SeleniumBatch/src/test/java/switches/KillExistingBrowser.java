package switches;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KillExistingBrowser 
{

	public static void main(String[] args) throws Exception 
	{
		Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
		
		Thread.sleep(5000);
			
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
	}

}
