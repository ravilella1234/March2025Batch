package selfies;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Selfy2 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		int linksize = driver.findElements(By.linkText("rajinikanth")).size();
		System.out.println(linksize);
		if(linksize == 0)
		{
			File scrpath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(scrpath,new File("C:\\Users\\DELL\\Desktop\\screenshots\\google.jpeg"));
		}
	}
}
