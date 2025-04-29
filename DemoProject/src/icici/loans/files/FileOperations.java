package icici.loans.files;

import java.io.File;
import java.io.IOException;

public class FileOperations 
{

	public static void main(String[] args) throws Exception 
	{
		/*File f = new File("C:/Users/DELL/Desktop/demo3.txt");
		System.out.println(f.exists());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getParent());
		System.out.println(f.getName());
		System.out.println(f.getPath());
		System.out.println(f.canWrite());
		System.out.println(f.canRead());
		f.setReadOnly();
		System.out.println(f.canWrite());
		System.out.println(f.exists());
		//f.delete();
		System.out.println(f.exists());
		
		
		
		f.setReadOnly();
		f.setWritable(true);*/
		
		
		/*if(!f.exists())
		f.createNewFile();
	else
		f.delete();*/
		
		
		File f1 = new File("C:/Users/DELL/Desktop/demo4.txt");
		if(!f1.exists())
			f1.createNewFile();
		else 
		{
			System.out.println(f1.isAbsolute());
			System.out.println(f1.isDirectory());
			System.out.println(f1.isFile());
		}
		
	System.out.println(f1.isHidden());
	System.out.println(f1.length());
	System.out.println(f1.getTotalSpace());
	System.out.println(f1.getFreeSpace());
	System.out.println(f1.getUsableSpace());
	System.out.println(f1.lastModified());
	
	
	File f2 = new File("C:/Users/DELL/Desktop/a/b/c");
	//f2.mkdir();
	f2.mkdirs();
	
	/*
	 * FileInputStream
	 * FileOutputStream
	 * 
	 * FileReader
	 * FileWriter
	 * 
	 * BufferedReader
	 * BufferedWriter
	 * 
	 * Scanner
	 * 
	 */
		
	}

}
