package icici.loans.homeloans;

public class B extends A // isA Relationship
{
	public void m2()
	{
		System.out.println("iam m2 in B class");
	}

	public static void main(String[] args) 
	{
		B b = new B();
		b.m2();
		b.m1();
		System.out.println(b.x);
		
		A a = new A(); // HasA Relationship
		a.m1();
		System.out.println(a.x);
	}
}
