package ArraylistProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class thire13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("pune");
		list.add("Mumbai");
		list.add("pune");
		list.add("Mumbai");
		list.add("Nasik");
		list.add("pune");
		
		LinkedHashMap<String, Integer> map=new LinkedHashMap<String, Integer>();
	
		for(int i=0;i<list.size();i++)
		{
			if(map.containsKey(list.get(i)))
			{
				int c=map.get(list.get(i));
				c++;
				map.put(list.get(i), c);
			}
			else
			{
				map.put(list.get(i), 1);
			}
		}
		
		System.out.println(map);
	
		
	//	System.out.println(map);
		
//		for(int i=0;i<list.size();i++)
//		{
//			boolean flag=true;
//			for(int k=i-1;k>=0;k--)
//			{
//				if(list.get(i).equals(list.get(k)))
//				{
//					flag=false;
//				}
//			}
//			if(flag)
//			{
//				int c=1;
//				for(int j=i+1;j<list.size();j++)
//				{
//					if(list.get(i).equals(list.get(j)))
//					{
//						c++;
//					}
//				}
//				map.put(list.get(i), c);
//			}
//		}
//		System.out.println(map);
	}

}
