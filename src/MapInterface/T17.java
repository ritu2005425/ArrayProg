package MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class T17 {

	public static void main(String[] args) {
//		17. Create a hashmap which contains integer keys and String values. Take a 
//		string from user. Delete that entry in map if value matches with the input 
//		string 
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "ritu");
		map.put(11, "reva");
		map.put(15, "chinu");
		map.put(12, "vidya");
		String userinput="vidya";
		Iterator itr=map.entrySet().iterator();
		while(itr.hasNext())
		{
		Map.Entry<Integer,String> m1=(Entry<Integer, String>) itr.next();
		if(m1.getValue().equals(userinput))
		{
			itr.remove();
		}
		else
		{
			System.out.println(m1.getKey()+" "+m1.getValue());
		}
		}
		
		

	}

}
