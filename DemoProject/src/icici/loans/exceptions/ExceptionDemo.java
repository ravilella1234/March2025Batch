package icici.loans.exceptions;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionDemo 
{

	public static void main(String[] args) 
	{
		int nr,dr,result;
		Scanner sc = new Scanner(System.in);
		
		while(true) 
		{
			System.out.println("Enter the nr value : ");
			nr = sc.nextInt();
			System.out.println("Enter the dr value : ");
			dr = sc.nextInt();
			
			try 
			{
				result = nr / dr;
				System.out.println(result);
				break;
			} 
			
			catch (NoSuchElementException e) 
			{
				e.printStackTrace();
			} 
			catch (ArithmeticException e) 
			{
				e.printStackTrace();
			} 
			catch (NullPointerException e) 
			{
				e.printStackTrace();
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			} 
			
		}	
	}
}
