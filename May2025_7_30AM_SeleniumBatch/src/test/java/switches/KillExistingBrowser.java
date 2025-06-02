package switches;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KillExistingBrowser 
{

	public static void main(String[] args) throws Exception 
	{
		Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
		
		/* 
		 *  taskkill   -  Built-in Windows command to terminate tasks (i.e., processes).
		 *  /F	       -  Forcefully terminates the process (without prompting).
		 *  /IM	       -  Stands for Image Name, indicating you're specifying the process by its executable name.    
		 *  chrome.exe -  The name of the executable process to kill (in this case, Chrome).
		 *  
		 *  taskkill /F /IM chrome.exe
		 *  taskkill /F /IM firefox.exe
		 *  taskkill /F /IM msedge.exe
		 *  
		 * */
		
		Thread.sleep(5000);
			
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
	}

}
