package PracticeHashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class T4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "ritu");
		map.put(2, "komal");
		map.put(4, "surya");
		
		HashMap<Integer,String> map2=new HashMap<Integer,String>(map);
		System.out.println("this is map 2" +map2);
		Set s=map.keySet();
		System.out.println("thisis key set "+s);
		
		Collection value=map.values();
		System.out.println("this are values "+value);
		
		map.forEach((k,v)->{
			System.out.println(k+ " "+v);
		});
	//	System.out.println(map);
		for(Map.Entry<Integer,String> val:map.entrySet())
		{
			System.out.println(val.getKey()+" "+val.getValue());
		}

	}

}
