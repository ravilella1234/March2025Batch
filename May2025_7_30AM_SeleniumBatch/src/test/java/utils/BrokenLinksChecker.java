package utils;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksChecker 
{
	
	public static void main(String[] args) 
	{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com.");

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("Total Links Found: " + allLinks.size());

        for(WebElement link : allLinks) 
        {
            String href = link.getAttribute("href");

            //Skip empty or null links
            if (href == null || href.isEmpty()) 
            {
                System.out.println("Skipping empty link.");
                continue;
            }

            try 
            {
                // Create HTTP connection
                HttpURLConnection connection = (HttpURLConnection) new URL(href).openConnection();
                connection.setRequestMethod("HEAD");
                connection.connect();
                int responseCode = connection.getResponseCode();
                String responsemessage = connection.getResponseMessage();

                if (responseCode >= 400) 
                {
                    System.out.println("Broken Link: " + href + " — Status Code: " + responseCode +" - "+ responsemessage);
                } 
                else 
                {
                    System.out.println("Valid Link: " + href + " — Status Code: " + responseCode +" - "+ responsemessage);
                }

            } 
            catch (Exception e) 
            {
                System.out.println("Error checking link: " + href + " — " + e.getMessage());
            }
        }
	}

}
