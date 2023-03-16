package MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class S6 {

	public static void main(String[] args) {
		// 6. WAP to get only the Keys from a HashMap.
		HashMap<Integer,Integer> mapNumber=new HashMap<Integer,Integer>();
		mapNumber.put(1,2);
		mapNumber.put(2,4);
		mapNumber.put(4,5);
		Set s=mapNumber.entrySet();
		//System.out.println(s);
		//enhanced for loop
		for(Map.Entry<Integer,Integer> m:mapNumber.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		//Stream api
		mapNumber.entrySet().stream().forEach(e->{
			System.out.println(e.getKey());
		});
		
	}

}
