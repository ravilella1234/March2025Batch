package utils;

import java.io.IOException;

public class KillBrowser 
{
	
	
	public static void main(String[] args) 
	{
		killBrowser("chrome");
	}
	

	public static void killBrowser(String browserName) 
	{
	    try {
	        String command = "";
	        switch (browserName.toLowerCase()) {
	            case "chrome":
	                command = "taskkill /F /IM chrome.exe";
	                break;
	            case "firefox":
	                command = "taskkill /F /IM firefox.exe";
	                break;
	            case "edge":
	                command = "taskkill /F /IM msedge.exe";
	                break;
	            case "safari":
	                command = "killall Safari"; // macOS only
	                break;
	            default:
	                System.out.println("Unsupported browser.");
	                return;
	        }
	        Runtime.getRuntime().exec(command);
	        System.out.println(browserName + " closed successfully.");
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

}
