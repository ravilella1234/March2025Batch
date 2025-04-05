package icici.loans.homeloans;

public class ChildClass extends FirstAbstract
{

	public static void main(String[] args) 
	{
		ChildClass obj = new ChildClass();
		obj.m1();
		obj.m2();
	}

	@Override
	public void m2() 
	{
		System.out.println("iam m2 overriden in Childlass");
	}

}
