package selfies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;
import com.project.BaseClass;

public class Verificaions extends BaseClass
{

	public static void main(String[] args) throws Exception 
	{
		init();
		test = report.createTest("Verificaions");
		test.log(Status.INFO, "init the properties files....");
		
		browserLaunch("chromebrowser");
		test.log(Status.INFO, "Launched the Browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(Status.INFO, "Navigated to page : " + childProp.getProperty("amazonurl"));
		
		/*String link1 = driver.findElement(By.linkText("Mobiles")).getText();
		System.out.println(link1);
		
		String link2 = driver.findElement(By.linkText("Mobiles")).getAttribute("href");
		System.out.println(link2);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("lg");
		String value = driver.findElement(By.id("twotabsearchtextbox")).getAttribute("value");
		System.out.println("value :" + value);*/
		
				
		WebElement ele = driver.findElement(By.linkText("Sell"));
		String actuallink = ele.getText();
		String expectedllink = "Selll";
		
		if(actuallink.equals(expectedllink))
			reportSucess("Both links are equal...");
		else
			reportFailure("Both links are not equal...",ele);	
		
		report.flush();
	}
}
