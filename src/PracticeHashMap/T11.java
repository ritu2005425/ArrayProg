package PracticeHashMap;

import java.util.HashMap;

public class T11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "ritu");
		map.put(2, "komal");
		map.put(4, "surya");
		
		map.remove(2);
		System.out.println(map);
	}

}
