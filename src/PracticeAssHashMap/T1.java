package PracticeAssHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<Integer,String> lmap=new LinkedHashMap<Integer,String>();
		lmap.put(1, "one");
		lmap.put(2, "two");
		lmap.put(4, "three");
		lmap.put(5, "five");
		lmap.put(6, "six");
		for(Map.Entry<Integer,String> m:lmap.entrySet())
		{
			if(m.getKey()%3!=0)
			{
				System.out.println(m.getKey()+" "+m.getValue());
			}
		}
		
	}

}
