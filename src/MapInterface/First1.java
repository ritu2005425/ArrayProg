package MapInterface;

import java.util.HashMap;

public class First1 {

	public static void main(String[] args) {
		// 1.WAP to add elements to a HashMap without using generics (i.e. do not 
	//	use <>) and print content of it. Use Integer as Key and String as Value. 
		//In 
//	second HashMap add elements of String type as Key and Integer as 
//	Value.
		HashMap map=new HashMap();
		map.put(0, "ritu");
		map.put(1, "tina");
		map.put(4, "reva");
		map.put(5, "opert");
		System.out.println(map);
	HashMap map1=new HashMap();
		map1.put("ritu",1);
		map1.put("tina",2);
		map1.put("reva",4);
		map1.put("opert",5);
		System.out.println(map1);
		
		
		
	}

}
