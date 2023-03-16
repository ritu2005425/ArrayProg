package MapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class n9 {

	public static void main(String[] args) {
		//9. WAP to test if a HashMap contains a mapping for the specified ke
		HashMap<Integer,Integer> mapNumber=new HashMap<Integer,Integer>();
		mapNumber.put(1,2);
		mapNumber.put(2,4);
		mapNumber.put(4,5);
		int k=2;
		Set s=mapNumber.entrySet();
		for(Map.Entry<Integer,Integer>m1:mapNumber.entrySet())
		{
			if(m1.getKey()==k)
			{
				System.out.println("HashMap contains a mapping for the specified key");
				
			}
			
		}
		
	}

}
