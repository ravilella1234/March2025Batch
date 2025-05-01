package icici.loans.files;

import java.io.File;
import java.util.Scanner;

public class File2 
{

	public static void main(String[] args) throws Exception 
	{
		File f = new File("C:\\Users\\DELL\\Desktop\\text2.txt");
		Scanner sc = new Scanner(f);
		//System.out.println(sc.next());
		
		
		/*while(sc.hasNext())
		{
			System.out.println(sc.next());
			Thread.sleep(500);
		}*/
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
			Thread.sleep(2000);
		}
		
		sc.close();
	}
}
