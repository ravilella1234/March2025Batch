package icici.loans.files;

import java.io.File;
import java.io.FileInputStream;

public class File1 
{

	public static void main(String[] args) throws Exception
	{
		File f = new File("C:/Users/DELL/Desktop/text2.txt");
		FileInputStream fis = new FileInputStream(f);
		int asciiNum = 0;
		
		//System.out.println(fis.read());
		
		while((asciiNum = fis.read()) != -1)
		{
			System.out.print((char)asciiNum);
			Thread.sleep(500);
		}
		
		fis.close();
	}

}
