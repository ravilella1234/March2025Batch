package dataDrivens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookLogin 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		ExcelAPI e = new ExcelAPI("C:\\Users\\DELL\\Desktop\\testdata1.xlsx");
		
		for(int i=1;i<e.getRowCount("login");i++)
		{
			String userName = e.getCellData("login","UserName", i);
			String userPassword = e.getCellData("login", "Password", i);
			
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys(userName);
			
			driver.findElement(By.id("pass")).clear();
			driver.findElement(By.id("pass")).sendKeys(userPassword);
			
			Thread.sleep(2000);
		}
		
	}

}
