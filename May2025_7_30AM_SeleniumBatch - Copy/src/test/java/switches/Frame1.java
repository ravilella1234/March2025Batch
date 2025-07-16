package switches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		driver.manage().window().maximize();
		
		//driver.switchTo().frame(driver.findElement(By.name("packageListFrame")));
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("java.applet")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		driver.switchTo().frame(driver.findElement(By.name("packageFrame")));
		driver.findElement(By.linkText("Applet")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		driver.switchTo().frame(driver.findElement(By.name("classFrame")));
		driver.findElement(By.linkText("JApplet")).click();
	}

}
