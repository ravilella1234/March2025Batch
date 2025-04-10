package icici.loans.personalloans;

public class MethodReturnTypeMultipleVariables 
{
	
	public int[] add()
	{
		int a = 10;
		int b = 20;
		int c = 30;
		System.out.println("A Value inside method is: " + a);
		System.out.println("B Value inside method is: " + b);
		System.out.println("C Value inside method is: " + c);
		return new int[]{a,b,c};
		
	}
	

	public static void main(String[] args) 
	{
		MethodReturnTypeMultipleVariables obj = new MethodReturnTypeMultipleVariables();
	    int[] values = obj.add();
	    for(int v:values)
	    {
	    	 System.out.println("Value of A,B,C in outside method : " + v);
	    }
	   
	}

}
