package PracticeHashMap;

import java.util.HashMap;

public class T9 {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "ritu");
		map.put(2, "komal");
		map.put(4, "surya");
		// mapping for the specified value.
		if(map.containsValue("komal"))
		{
			System.out.println("contains value");
		}
		else
		{
			System.out.println("does not contain value");
		}
		
		if(map.containsKey(2))
		{
			System.out.println("mpping exist");
		}
		else
		{
			System.out.println("mapping does not exist");
		}

	}

}
