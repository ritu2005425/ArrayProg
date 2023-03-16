package MapInterface;

import java.util.HashMap;

public class E8 {

	public static void main(String[] args) {
		//8. WAP to copy all of the mappings from the specified HashMap to another map.
		HashMap<Integer,Integer> mapNumber=new HashMap<Integer,Integer>();
		mapNumber.put(1,2);
		mapNumber.put(2,4);
		mapNumber.put(4,5);
		
		HashMap<Integer,Integer>newmap=new HashMap<Integer,Integer>(mapNumber);
		System.out.println(newmap);
		HashMap<Integer,Integer> mapNumber1=new HashMap<Integer,Integer>(mapNumber);
		System.out.println(mapNumber1);
	}

}
