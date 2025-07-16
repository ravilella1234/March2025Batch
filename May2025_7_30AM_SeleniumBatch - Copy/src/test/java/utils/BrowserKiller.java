package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BrowserKiller 
{

	public static void killBrowser(String browserName) 
	{
        String os = System.getProperty("os.name").toLowerCase();
        String command = "";

        switch (browserName.toLowerCase()) 
        {
            case "chrome":
                command = os.contains("win") ? "taskkill /F /IM chrome.exe" : "killall -9 Google\\ Chrome";
                break;
            case "firefox":
                command = os.contains("win") ? "taskkill /F /IM firefox.exe" : "killall -9 firefox";
                break;
            case "edge":
                command = os.contains("win") ? "taskkill /F /IM msedge.exe" : "killall -9 Microsoft\\ Edge";
                break;
            case "safari":
                if (os.contains("mac")) {
                    command = "killall -9 Safari";
                } else {
                    System.out.println("Safari is only supported on macOS.");
                    return;
                }
                break;
            default:
                System.out.println("Unsupported browser: " + browserName);
                return;
        }

        try 
        {
            Process process = Runtime.getRuntime().exec(command);
            int exitCode = process.waitFor();

            if (exitCode == 0) 
            {
                System.out.println(browserName + " closed successfully on " + os);
            } 
            else 
            {
                printError(process);
                System.out.println("Failed to close " + browserName + " (exit code: " + exitCode + ")");
            }

        } 
        catch (IOException | InterruptedException e) 
        {
            System.out.println("Error while closing " + browserName + ": " + e.getMessage());
        }
    }

    private static void printError(Process process) throws IOException 
    {
        try (BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()))) 
        {
            String line;
            while ((line = errorReader.readLine()) != null) 
            {
                System.err.println("Error: " + line);
            }
        }
    }

    public static void main(String[] args) 
    {
        killBrowser("chrome");
        killBrowser("firefox");
        killBrowser("edge");
        killBrowser("safari");
    }


}
