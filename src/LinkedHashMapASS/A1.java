package LinkedHashMapASS;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class A1 {

	public static void main(String[] args) {
//		2. Create a Linkedhashmap<int,String> where key is integers 1 to 10 and 
//		string is number in words.Remove entry for which number is divisible by 
//		3.

	LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();
	map.put(1,"one");
	map.put(2,"two");
	map.put(3,"three");
	map.put(4,"four");
	map.put(5,"five");
	map.put(6,"six");
	map.put(7,"seven");
	map.put(8,"eight");
	map.put(9,"nine");
	map.put(10,"ten");
	
//	map.forEach((e,t)->{
//		System.out.println(e+" "+t);
//	});
	Iterator itr=map.entrySet().iterator();
	while(itr.hasNext())
	{
		Map.Entry<Integer,String> val = (Entry<Integer, String>) itr.next();
		if(val.getKey()%3==0)
		{
			itr.remove();
		}
		else
		{
			System.out.println(val.getKey() +" "+val.getValue());
		}
		
	}
	
	
	
	}

}
