package icici.loans.personalloans;

public class MethodReturnTypeVoid 
{
	
	public void add(int a,int b)
	{
		int c = a+b;
		System.out.println(c);
	}
	

	public static void main(String[] args) 
	{
		MethodReturnTypeVoid obj = new MethodReturnTypeVoid();
	    obj.add(10, 20);
	}

}
