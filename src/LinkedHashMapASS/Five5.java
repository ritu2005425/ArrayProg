package LinkedHashMapASS;

import java.util.HashMap;

public class Five5 {

	public static void main(String[] args) {		
//		5. Accept string from user. Create a map which has key as character in 
//		string and value as number of occurances of that character in string. E.g.
		String t="I am ritu ramesh jadhav";
		String s=t.toLowerCase();
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(int i=0;i<s.length();i++)
		{
			boolean flag=true;
			for(int k=i-1;k>=0;k--)
			{
				if(s.charAt(i)==s.charAt(k))
				{
					flag=false;
				}
			}
			int c=1;
			if(flag==true)
			{
				for(int j=i+1;j<s.length();j++)
				{
					if(s.charAt(i)==s.charAt(j))
					{
						c++;
					}
				}
				if(s.charAt(i)!=' ')
				{
					map.put(s.charAt(i), c);
				}
				
			}
		}
		System.out.println(map);
		
		
		

	}

}
