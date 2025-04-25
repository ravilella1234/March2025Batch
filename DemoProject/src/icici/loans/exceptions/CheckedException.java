package icici.loans.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException 
{
	
	public static void m1() throws FileNotFoundException 
	{
		BufferedReader b = new BufferedReader(new FileReader("d://abc.txt"));
	}

	public static void main(String[] args) throws FileNotFoundException 
	{
		m1();
	}

}
