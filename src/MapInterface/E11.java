package MapInterface;

import java.util.HashMap;

public class E11 {

	public static void main(String[] args) {
		//11.WAP to remove an element from HashMap using key.
		HashMap<Integer,Integer> mapNumber=new HashMap<Integer,Integer>();
		mapNumber.put(1,2);
		mapNumber.put(2,4);
		mapNumber.put(4,5);
		
		mapNumber.remove(2);
		System.out.println(mapNumber);

	}

}
