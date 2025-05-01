package icici.loans.files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class File5 
{

	public static void main(String[] args) throws IOException, Exception 
	{
		File f = new File("C:\\Users\\DELL\\Desktop\\text1.txt");
		if(f.exists())
			f.delete();
		f.createNewFile();
		
		String text = "Hello How are you";
		
		FileOutputStream fos = new FileOutputStream(f);
		for(char ch : text.toCharArray())
		{
			System.out.println(ch);
			fos.write(ch);
			Thread.sleep(300);
		}
		fos.close();
	}

}
