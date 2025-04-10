package icici.loans.personalloans;

public class MethodReturnTypeArrayVariable 
{
	
	public int[] add()
	{
		int[] a = {10,20,30,40,50};
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Array Values inside method is: " + a[i]);
		}
		return a;
	}
	

	public static void main(String[] args) 
	{
		MethodReturnTypeArrayVariable obj = new MethodReturnTypeArrayVariable();
	    int[] values = obj.add();
	    for(int v:values)
	    {
	    	 System.out.println("Value of A,B,C in outside method : " + v);
	    }
	   
	}

}
