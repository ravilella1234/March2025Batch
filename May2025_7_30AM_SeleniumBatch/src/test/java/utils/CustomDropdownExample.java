package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomDropdownExample 
{
	public static void main(String[] args) 
	{
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bstackdemo.com/");
        driver.manage().window().maximize();

        // Click to open the custom dropdown
        WebElement dropdown = driver.findElement(By.className("sort"));
        dropdown.click();

        // Select the desired option
        WebElement option = driver.findElement(By.xpath("//option[text()='Highest to lowest']"));
        option.click();

        //driver.quit();
	}
}
