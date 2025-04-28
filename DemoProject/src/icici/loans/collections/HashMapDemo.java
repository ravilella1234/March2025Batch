package icici.loans.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashMapDemo 
{

	public static void main(String[] args) 
	{
		//HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		//LinkedHashMap<Integer, Integer> h = new LinkedHashMap<Integer, Integer>();
		TreeMap<Integer, Integer> h = new TreeMap<Integer, Integer>();
		h.put(10, 100);
		h.put(200, 200);
		h.put(1, 300);
		h.put(100, 400);
		h.put(4, 200);
		
		
		System.out.println(h);
		System.out.println(h.size());
		System.out.println(h.isEmpty());
		System.out.println(h.get(20));
		Set<Integer> keys = h.keySet();
		for(Integer key:keys)
		{
			System.out.println(key +"--->" + h.get(key));
		}
	}

}
