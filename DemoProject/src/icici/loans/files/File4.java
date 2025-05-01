package icici.loans.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class File4 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		File f = new File("C:\\Users\\DELL\\Desktop\\text2.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		
		int asciiNum = 0;
		String line = null;
		
		/*while((asciiNum = br.read()) != -1)
		{
			System.out.print((char)asciiNum);
			Thread.sleep(200);
		}*/
		
		while((line = br.readLine()) != null)
		{
			System.out.println(line);
			Thread.sleep(1000);
		}
		
		br.close();
	}

}
