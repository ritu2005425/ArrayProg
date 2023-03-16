package ArraylistProgram;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Hashmap {

	private static final Object String = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer, String> map=new LinkedHashMap<Integer, String>();
		map.put(1, "abc");
		map.put(2, "rt");
		map.put(4, "rtyu");
		map.put(5, "xtr");
		
		
		
		
		
		
		
		
		
		for(Map.Entry<Integer, String> w1:map.entrySet())
		{
			
			if(w1.getKey()!=1)
			{
				System.out.println(w1.getValue()+" "+w1.getKey());
				//System.out.println("found");
			}
		}
		
		LinkedHashMap<Integer, String> map2=new LinkedHashMap<Integer, String>(map);
		System.out.println("ENTER MAP2 VALUES");
		System.out.println(map2);
		
		Iterator itr=map.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer, String> m=(Entry<Integer, String>) itr.next();
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
		for(Map.Entry<Integer, String> w:map.entrySet())
		{
			if(w.getValue().equals("abc"))
			{
				System.out.println(w.setValue("dapoli"));
			}
			System.out.println(w.getKey()+" "+w.getValue());
		}
		
		
	//	System.out.println(s);
		
//		Collection c=map.values();
//		System.out.println(c);
//		Set s2=map.keySet();
//		System.out.println(s2);

	}

}
