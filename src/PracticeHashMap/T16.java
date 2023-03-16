package PracticeHashMap;

import java.util.Collection;
import java.util.HashMap;

public class T16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer, Character> map=new HashMap<Integer, Character>();
		HashMap<Character, Integer> map2=new HashMap<Character, Integer>();
		map.put(1, 'a');
		map.put(2, 'b');
		map.put(4, 'c');
		map.put(5, 'd');
		map.put(6, 'a');
		map.put(7, 'b');
		map.put(8, 'c');
		
		System.out.println(map);
		Character[] ch=map.values().toArray(new Character[0]);
		
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
			if(flag)
			{
				for(int j=i+1;j<ch.length;j++)
				{
					if(ch[i]==ch[j])
					{
						c++;
					}
				}
				map2.put(ch[i], c);
			}
		}
		System.out.println(map2);
	}

}
