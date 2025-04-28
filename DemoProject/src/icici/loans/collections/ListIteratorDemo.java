package icici.loans.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<String> a = new ArrayList<String>();
		a.add("dell");
		a.add("tcs");
		a.add("wipro");
		a.add("hp");
		
		System.out.println(a);
		ListIterator<String> val = a.listIterator();
		while (val.hasNext()) 
		{
			String var = val.next();
			if(var.equals("wipro"))
				val.set("vmware");
			else
				val.remove();
		}
		System.out.println(a);
	}
}
