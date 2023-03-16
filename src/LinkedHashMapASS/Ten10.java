package LinkedHashMapASS;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Ten10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> map = new LinkedHashMap();
		map.put(1 , "Jilebi");
		map.put(2,"Modak");
		map.put(3, "laddu");
		
		if(map.put(2, "Barfi") == null )
		System.out.println("yummy");
		else
		System.out.println("tasty");
		System.out.println(map.put(3, "newval"));
		System.out.println(map.size());

	}

}
