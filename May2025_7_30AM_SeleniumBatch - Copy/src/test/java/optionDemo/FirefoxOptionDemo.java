package optionDemo;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxOptionDemo 
{

	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver;
		FirefoxOptions option = new FirefoxOptions();
		
		ProfilesIni p = new ProfilesIni();
		FirefoxProfile pf = p.getProfile("JuneFF");
		
		// To disable the browser web notification
		pf.setPreference("dom.webnotifications.enabled", false);
		
		// To Handle the certificate Errors
		pf.setAcceptUntrustedCertificates(true);
		pf.setAssumeUntrustedCertificateIssuer(false);
		
		
		/* To set the proxy setting in Firefox Browser
		about:config*/
		//pf.setPreference("network.proxy.type", 1);
		//pf.setPreference("network.proxy.scoks", "192.168.10.1");
		//pf.setPreference("network.proxy.scoks_port", 1744);
				
		option.addArguments("--headless");
		option.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		option.addArguments("--private");
		
		option.setProfile(pf);
		
		driver = new FirefoxDriver(option);
		//driver.get("https://www.moneycontrol.com/promo/mc_interstitial_dfp.php?size=1280x540");
		driver.get("https://expired.badssl.com/");
		//driver.get("https://www.hdfc.com/");
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
	}

}
