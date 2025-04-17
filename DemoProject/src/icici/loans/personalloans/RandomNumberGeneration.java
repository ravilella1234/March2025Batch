package icici.loans.personalloans;


import java.util.Date;
import java.util.Random;

public class RandomNumberGeneration 
{

	public static void main(String[] args) 
	{
		Random r1 = new Random();
		int ran1 = r1.nextInt();
		System.out.println(ran1);
		
		Random r2 = new Random();
		int ran2 = r2.nextInt(999);
		System.out.println(ran2);
		
		/* ravilella_123@gmail.com
		 * ravilella_234@gmail.com
		 * ravilella_345@gmail.com
		 */
		
		String fName = "qa" ;
		String lName = "test";
		String domain = "@gmail.com";
		
		for(int i=1;i<=10;i++)
		{
			Random num =  new Random();
			int randNum = num.nextInt(999);
			System.out.println(fName+lName+randNum+domain);
		}
		
		Date dt = new Date();
		System.out.println(dt);
		String d = dt.toString();
		System.out.println(d.replace(':', '_').replace(' ', '_'));
	
	}
}
