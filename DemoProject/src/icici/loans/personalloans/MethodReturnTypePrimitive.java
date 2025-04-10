package icici.loans.personalloans;

public class MethodReturnTypePrimitive 
{
	
	public int add(int a,int b)
	{
		int c = a+b;
		System.out.println("sum of C in Inside method : " + c);
		return c;
	}
	

	public static void main(String[] args) 
	{
		MethodReturnTypePrimitive obj = new MethodReturnTypePrimitive();
	    int value = obj.add(10, 20);
	    System.out.println("sum of C in outside method : " + value);
	}

}
