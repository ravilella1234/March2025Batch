package icici.loans.files;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadData 
{

	public static void main(String[] args) throws Exception 
	{
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		File f = new File(projectPath+"//data.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties p = new Properties();
		p.load(fis);
		String e = p.getProperty("amazonurl");
		System.out.println(e);
	}

}
