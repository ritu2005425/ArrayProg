package MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Queries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer>ma=new HashMap<Integer,Integer>();
		ma.put(1, 45);
		ma.put(2, 556);
		ma.put(5, 545);
		ma.put(2, 98);
		for(Map.Entry<Integer,Integer> map: ma.entrySet())
		{
		System.out.println(map.getKey()+" "+map.getValue());
		}
		
		Iterator itr=ma.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer,Integer>  m2=(Entry<Integer, Integer>) itr.next();
			if(m2.getValue()==98)
			{
				itr.remove();
			}
			else
			{
				System.out.println(m2.getKey()+" "+m2.getValue());
			}
		}
		
	}

}
