package selfies;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Selfy3 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		List<WebElement> elements = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		for(int i=0;i<elements.size();i++)
		{
			if(!elements.get(i).getText().isEmpty())
			{
				String linkName = elements.get(i).getText();
				elements.get(i).click();
				File scrpath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(scrpath,new File("C:\\Users\\DELL\\Desktop\\screenshots\\"+linkName+".png"));
				elements = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
			}
		}
	}
}
