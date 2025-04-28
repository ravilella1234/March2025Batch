package icici.loans.collections;

import java.util.ArrayList;

public class ListDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<Object> a = new ArrayList<Object>();
		a.add(10);
		a.add(20.34f);
		a.add(10);
		a.add("ravi");
		a.add(40);		
		
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.get(3));
		System.out.println(a.isEmpty());
		System.out.println(a.contains("ravi"));
		System.out.println(a);
		a.add(50);
		System.out.println(a);
		a.add(1, "lella");
		System.out.println(a);
		a.set(2, "ravikanth");
		System.out.println(a);
		System.out.println(a.indexOf("ravikanth"));
		System.out.println(a.subList(2, 5));
		a.remove(1);
		System.out.println(a);
		a.remove("ravikanth");
		System.out.println(a);
		System.out.println(a.indexOf(10));
		a.clear();
		System.out.println(a);
	}
}
