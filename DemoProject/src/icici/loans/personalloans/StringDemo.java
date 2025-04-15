package icici.loans.personalloans;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		String s1 = "ravikanth";
		System.out.println(s1);
		System.out.println(s1.isEmpty());
		System.out.println(s1.length());
		System.out.println(s1.charAt(1));
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.startsWith("ravi"));
		System.out.println(s1.endsWith("anth"));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
				
		String s2 = new String("lella");
		System.out.println(s2);
		System.out.println(s1.equals(s2)); // false
		
		String s3 = "ravikanth";
		System.out.println(s1.equals(s3)); // true
		
		String s4 = "Ravikanth";
		System.out.println(s1.equals(s4)); // false
		System.out.println(s1.equalsIgnoreCase(s4)); // true
		
		String s5 = "Ravi";
		System.out.println(s1.equals(s5)); //false
		System.out.println(s1.equalsIgnoreCase(s5)); //false
		System.out.println(s1.contains(s5)); //false
		System.out.println(s1.contains(s5.toLowerCase())); //true
		
		System.out.println(s1);
		System.out.println(s2);
		//System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		System.out.println(s1);
		System.out.println(s1.substring(2, 7));
		
		System.out.println(s1);
		System.out.println(s1.replace('r', 'k'));
		
		String s6 = " ravikanth";
		System.out.println(s1);
		System.out.println(s6);
		System.out.println(s1.equals(s6)); // false
		System.out.println(s1.equals(s6.trim())); // true
		
		String s7 = "ravi kanth lella";
		System.out.println(s7);
		String[] str = s7.split(" ");
		for(String s:str)
		{
			System.out.println(s);
		}
		
	}
}
