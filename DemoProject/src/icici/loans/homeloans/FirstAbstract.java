package icici.loans.homeloans;

public abstract class FirstAbstract 
{
	public void m1()
	{
		System.out.println("iam m1 from FirstAbstract class");
	}
	
	public abstract void m2();

	public static void main(String[] args) 
	{
		//FirstAbstract obj = new FirstAbstract();
		FirstAbstract obj = new ChildClass();
		obj.m1();
		obj.m2();
	}

}
