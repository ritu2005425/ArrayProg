package InterviewASS;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Occrences {

	public static void main(String[] args) {
		String str = "rituritut ttz";  
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				if(map.containsKey(str.charAt(i)))
				{
					int c=map.get(str.charAt(i));
					c++;
					map.put(str.charAt(i), c);
				}
				else
				{
					map.put(str.charAt(i), 1);
				}	
			}
		}
		System.out.println(map);
		int max=Collections.max(map.values());
		System.out.println("Maximum occuring character is = ");
		
		map.entrySet().stream().filter(e->e.getValue()== max).
		forEach(e->System.out.println(e.getKey()+" "+e.getValue()));
		
int min=Collections.min(map.values());
		System.out.println("Minimum occuring character is = ");
		map.entrySet().stream().filter(e->e.getValue()==min).forEach(e->System.out.println(e));
		
		
		
		
		
		
		
		
		
		}  
		}  