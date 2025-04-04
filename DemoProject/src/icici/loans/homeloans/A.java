package icici.loans.homeloans;

public  class A 
{
	public  int x = 10;
	
	public  void m1()
	{
		System.out.println("iam m1 in A class");
	}
	
	public static void main(String[] args) 
	{
		A a = new A();
		a.m1();
		System.out.println(a.x);
	}

}
