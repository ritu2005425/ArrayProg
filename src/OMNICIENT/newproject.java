package OMNICIENT;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class newproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="rriiityyuuuz";
		int n=s.length();
		
		HashMap<Character,Integer > map=new HashMap<Character,Integer>();
		
		for(int i=0;i<s.length();i++)
		{
			int c=1;
			boolean flag=true;
			for(int k=i-1;k>=0;k--)
			{
				if(s.charAt(i)==s.charAt(k))
				{
					flag=false;
				}
			}
			if(flag)
			{
				for(int j=i+1;j<s.length();j++)
				{
					if(s.charAt(i)==s.charAt(j))
					{
						c++;
					}
				}
				map.put(s.charAt(i),c);
				//System.out.println(s.charAt(i)+" "+c);
			}
						
		}
		System.out.println(map);
		
		int d=Collections.max(map.values());
		int min=Collections.min(map.values());
		System.out.println("maximuum occurence of character is = ");
		for(Map.Entry<Character,Integer> m:map.entrySet())
		{
			if(m.getValue()==d)
			{
				System.out.println(m.getKey()+" "+m.getValue());
			}
		}
		
		System.out.println("minimum occurence of character is = ");
		for(Map.Entry<Character,Integer> m:map.entrySet())
		{
			if(m.getValue()==min)
			{
				System.out.println(m.getKey()+" "+m.getValue());
			}
		}
		

		
//		int d=Collections.max(map.keySet());
//		System.out.println(d);
//		System.out.println("maximum value occured is= "+map.get(d)+" "+d+"times");
//		
//		int min=Collections.min(map.keySet());
//		System.out.println("maximum value occured is= "+map.get(min)+" "+min+"times");

		
	}

}
