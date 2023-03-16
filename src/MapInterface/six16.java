package MapInterface;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class six16 {

	public static void main(String[] args) {
//		16. Write a program to create a hashmap as follows. A hashmap ‘oldMap’ 
//		has multiple duplicate values. Write a program to create new hashmap 
//		‘newMap’ which contains keys as unique values of ‘oldMap’ and values as 
//		count of number of times value has appeared in ‘map’.
//		e.g. oldMap = (1, ‘a’) , (2,’b’), (3,’c’), (4,’b’), (5,’a’), (6,’a’)
//		newMap = {‘a’,3) , (‘b’,2),(‘c’,1
		
		
		HashMap<Integer,Character> mapNumber=new HashMap<Integer,Character>();
		mapNumber.put(1,'a');
		mapNumber.put(2,'b');
		mapNumber.put(4,'c');
		mapNumber.put(5,'a');
		mapNumber.put(6,'f');
 Character[] ch=mapNumber.values().toArray(new Character[0]);
	    for(int i=0;i<ch.length;i++)
	    {
	    	System.out.println(ch[i]);
	    }
HashMap<Character,Integer> newMap=new HashMap<Character,Integer>();

for(int i=0;i<ch.length;i++)
{
	boolean flag=true;
	for(int k=i-1;k>=0;k--)
	{
		if(ch[i]==ch[k])
		{
			
			flag=false;
		}
	}
	int c=1;
	if(flag==true)
	{
		
		for(int j=i+1;j<ch.length;j++)
		{
			{
				if(ch[i]==ch[j])
				{
					c++;
				}
			}
		}

		newMap.put(ch[i], c);
	}
}
System.out.println(newMap);
}

}
