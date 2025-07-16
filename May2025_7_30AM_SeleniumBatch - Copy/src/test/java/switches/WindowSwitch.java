package switches;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowSwitch {

	public static void main(String[] args) 
	{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		String parent = driver.getWindowHandle();
		System.out.println("Parent id : " + parent);
		System.out.println("Parent Tite : "+ driver.getTitle());
		
		//driver.switchTo().newWindow(WindowType.TAB);
		//driver.switchTo().newWindow(WindowType.WINDOW);
		//driver.navigate().to("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//img[@alt='redbus_facebook']")).click();
		driver.findElement(By.xpath("//img[@alt='redbus_linkedin']")).click();
		driver.findElement(By.xpath("//img[@alt='redbus_twitter']")).click();
		driver.findElement(By.xpath("//img[@alt='redbus_instagram']")).click();
		
		Set<String> childs = driver.getWindowHandles();
		System.out.println("child Windows are  :");
		for(String c:childs)
		{
			System.out.println(c);	
			driver.switchTo().window(c);
			String actualtitle = driver.getTitle();
			String expectedtitle = "redBus | Bangalore";
			
			System.out.println("actualtitle : " +  actualtitle);
			System.out.println("expectedtitle : "+  expectedtitle);
			if(actualtitle.contains(expectedtitle))
				driver.close();
				
		}
		
		
		
		
	}

}
