package icici.loans.homeloans;

public class TypeCastings 
{

	public static void main(String[] args) 
	{
		// byte = 1, short=2, int=4, long=6, float=4, double=8
		
		//1-ltr --> 500ml  --> No data loss --> widining
		//1-ltr --> 1.5ltr --> Yes,There data is loss -Narrowing
		
		//Type Casting from primitive type to another primitive type(p-p)
		
		int i1 = 65;
		System.out.println(i1);
		
		double i2 = (double)i1;
		System.out.println(i2);
		
		int i3 = (int)i2;
		System.out.println(i3);
		
		char i4 = (char)i3;
		System.out.println(i4);
		
		//Type Casting from primitive type to corresponding wrapper class Type(p-c)
		
		int x1 = 10;
		System.out.println(x1);
		
		Integer x2 = Integer.valueOf(x1);
		System.out.println(x2);
		
		//Type Casting from wrapper class Type to corresponding primitive type(c-p)
		
		Float f1 = 13.34f;
		System.out.println(f1);
		
		float f2 = (float)f1;
		System.out.println(f2);
		
		//Type Casting from one wrapper class to another wrapper class type(c-c)
		
		String s1 = "200";
		String s2 = "300";
		System.out.println(s1+s2);
		
		Integer p1 = Integer.valueOf(s1);
		Integer p2 = Integer.valueOf(s2);
		System.out.println(p1+p2);
		
		Float q1 = Float.valueOf(s1);
		Float q2 = Float.valueOf(s2);
		System.out.println(q1+q2);
		
		int r1 = Integer.parseInt(s1);
		int r2 = Integer.parseInt(s2);
		System.out.println(r1+r2);
		
		float t1 = Float.parseFloat(s1);
		float t2 = Float.parseFloat(s2);
		System.out.println(t1+t2);
		
		/* 
		  
		  (p-p) --> (primitive data type)primitive variable
		    ex : (int)x; 
		  
		  (p-c) --> ClassName.valueOf(primitive variable)
		    ex : Integer.valueOf(10);
		    
		  (c-p) --> (primitive data type)Reference variable
		    Integer i = 10;
		    ex : int j = (int)i;
		    
		  (c-c) --> ClassName.valueOf(Reference variable)
		            ClassName.parseInt(Reference variable)
		    ex :  Integer i = Integer.valueOf(Reference variable)
		          int  j =  Integer.parseInt(Reference variable)
		 */
		
	}

}
