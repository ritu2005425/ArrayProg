package MapInterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Seco2 {

	public static void main(String[] args) {
		//3. WAP to add elements to a HashMap using generics with Integer as Key 
		//and String as value. And 4 key-value entries.
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "rtiut");
		map.put(2, "tina");
		map.put(4, "malu");
		Set s1=map.keySet();
		System.out.println(s1);
		Collection c1=map.values();
		System.out.println(c1);
	
	
		

	}

}
