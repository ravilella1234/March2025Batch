package switches;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadByRobotClass 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://transfer.pcloud.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		//ctrl+c
		driver.findElement(By.xpath("//span[contains(text(),'Click here to add files')]")).click();
		StringSelection filePath = new StringSelection("C:\\Users\\DELL\\Desktop\\sql-joins.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
		Thread.sleep(3000);
		
		//ctrl+v
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		
		//Click on Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
