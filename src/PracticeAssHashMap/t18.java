package PracticeAssHashMap;

import java.util.Map;
import java.util.TreeMap;

public class t18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, String> map=new TreeMap<Integer, String>();
		map.put(12, "ritu");
		map.put(14, "titu");
		map.put(15, "neha");
		System.out.println(map);
		TreeMap<Integer, TreeMap<Integer, String>> map2=new TreeMap<Integer, TreeMap<Integer, String>>();
		map2.put(1, map);
		map2.put(2, map);
		for(Map.Entry<Integer, TreeMap<Integer, String>> m:map2.entrySet())
		{
			System.out.println(m.getKey());
			for(Map.Entry<Integer, String> p:map.entrySet())
			{
				System.out.println(p.getValue());
			}
		}
	//	System.out.println();
	}

}
