package icici.loans.personalloans;

public class MethodOverloading 
{
	// int -4, long-8, float-4, double-8 

	/*public void m1(int x)
	{
		System.out.println(x);
	}*/
	
	/*public void m1(float x)
	{
		System.out.println(x);
	}*/
	
	/*public void m1(String x)
	{
		System.out.println(x);
	}*/
	
	/*public void m1(Integer x)
	{
		System.out.println(x);
	}*/
	
	/*public void m1(Number x)
	{
		System.out.println(x);
	}*/
	
	public void m1(Object x)
	{
		System.out.println(x);
	}
	
	public static void main(String[] args) 
	{
		MethodOverloading obj = new MethodOverloading();
		obj.m1(100);
		obj.m1(13.34f);
		obj.m1("ravi");
		obj.m1(45);
		obj.m1(34.56f);
		obj.m1("oracle");
	}

}
