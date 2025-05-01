package icici.loans.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File7 
{

	public static void main(String[] args) throws IOException 
	{
		File f = new File("C:\\Users\\DELL\\Desktop\\text1.txt");
		if(f.exists())
			f.delete();
		f.createNewFile();
		String text = "My Name is Ravikanth";
		String ap = "Thank You";
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		bw.write(text);
		
		//bw = new BufferedWriter(new FileWriter(f));
		bw.write(" "+ ap);
		
		bw.close();
	}

}
