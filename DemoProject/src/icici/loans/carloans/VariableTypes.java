package icici.loans.carloans;

public class VariableTypes 
{
	// Primitive variable
	int x = 10; // primitive instance
	static int  y = 20; // primitive static
	static VariableTypes obj;
	
	public void m1()
	{
		int z =30; // primitive local
		int x = 40;
		System.out.println(z);
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(VariableTypes.y);
	}
	
	public static void m2()
	{
		obj = new VariableTypes();
		System.out.println(obj.x);
		System.out.println(VariableTypes.y);
	}
	
	public static void main(String[] args) 
	{
		obj = new VariableTypes(); // non-primitive or reference variable
		System.out.println(obj.x);
		System.out.println(VariableTypes.y);
	}

}
