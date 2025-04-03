package icici.loans.personalloans;

import icici.loans.homeloans.A;

public class C extends A
{
	public void m3()
	{
		System.out.println("iam m3 in C class");
	}
	
	public static void main(String[] args) 
	{
		C c = new C();
		c.m3();
		c.m1();
		System.out.println(c.x);
		
		A a = new A();
		a.m1();
		System.out.println(a.x);
	}

}
